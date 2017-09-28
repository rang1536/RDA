package com.kis.rda.farm.controller;				
				
import java.io.File;
import java.io.IOException;
 
import java.util.Map;
import java.util.UUID;
 

import org.springframework.beans.factory.annotation.Autowired;				
import org.springframework.http.HttpHeaders;				
import org.springframework.http.HttpStatus;				
import org.springframework.http.ResponseEntity;				
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;				
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.kis.rda.common.domain.Feces;
import com.kis.rda.common.domain.Fecesimg;
import com.kis.rda.farm.domain.Farm;


import com.kis.rda.farm.service.FeseService;				
				
@RestController				
public class FeseRestController {				
				
@Autowired				
private FeseService feseService;				
 
@RequestMapping(value = "/ajax/feseEntityInsertDo", method = RequestMethod.POST)		
public ResponseEntity<String> ajaxfeseEntityInsertDo(Model model,Farm farm,String farm_Id,Feces  entityInsert,MultipartHttpServletRequest request,MultipartFile file,Fecesimg entityImgInsert) throws IllegalStateException, IOException {		
		
	
      // 파일가져오기
	 file = request.getFile("uploadfile");
 
		 //오리지날 파일이름 가져오기
	 String fileName = file.getOriginalFilename();
	 entityImgInsert.setORIGINIMG(fileName);
 
	 //확장자가져오기
	 int pos = fileName.lastIndexOf( "." );
	 String ext = fileName.substring( pos + 1 );	
 
	
	 //경로가져오기
	  String path = "C:\\Users\\Administrator\\git\\RDA\\rda\\src\\main\\webapp\\resources\\upload\\";
 	 UUID uuid = UUID.randomUUID();
	  	 
     // 랜덤생성+파일이름 저장
	 String savedName = uuid.toString()+"."+ext;
 	entityInsert.setFECES_IMAGE(savedName);
 	 
     File target = new File(path, savedName);
     // 임시디렉토리에 저장된 업로드된 파일을 지정된 디렉토리로 복사
     // FileCopyUtils.copy(바이트배열, 파일객체)
     FileCopyUtils.copy(file.getBytes(), target); 
     
     String occur = entityInsert.getTotalDate();
     String gather = entityInsert.getTotalDate1();    		 
	entityInsert.setFECES_GATHERDATE(gather);
	entityInsert.setFECES_OCCURDATE(occur);

	//분변정보와 실제이미지명
	int resultImg = feseService.ajaxfeseEntityInsertImgDo( entityImgInsert);		
	//분변의 원래이미지명
	int result = feseService.ajaxfeseEntityInsertDo(entityInsert);		

HttpHeaders responseHeaders = new HttpHeaders();
responseHeaders.add("Content-Type", "text/html; charset=UTF-8");
return new ResponseEntity<String>("<script> alert(\"전송완료했습니다.\"),window.close();</script> ", responseHeaders, HttpStatus.OK);
}		


@RequestMapping(value = "/ajax/feseEntityImgList", method = RequestMethod.POST)				
public Map<String,Object> ajaxfeseEntityImgList(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,			
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,			
	@RequestParam(value="searchValue", defaultValue="none") String searchValue, String entity_id) {			
Map<String, Object> map = feseService.ajaxfeseEntityImgList(entity_id);	
 	 			
return map;				
}		
 
}				
				
				
