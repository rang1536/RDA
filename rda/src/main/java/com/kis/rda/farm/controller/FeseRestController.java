package com.kis.rda.farm.controller;				
				
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

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

import com.kis.rda.common.domain.Fecesimg;
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.domain.FecesInput;
import com.kis.rda.farm.domain.MhListDetail;
import com.kis.rda.farm.service.FeseService;				
				
@RestController				
public class FeseRestController {				
				
@Autowired				
private FeseService feseService;				
@RequestMapping(value = "/ajax/feseList", method = RequestMethod.POST)				
public Map<String,Object> ajaxfeseList(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,			
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,			
	@RequestParam(value="searchValue", defaultValue="none") String searchValue) {			
Map<String, Object> map = feseService.selectFarmListServ(pageNum, searchOption, searchValue);				
model.addAttribute("farmList", map.get("farmList"));				
model.addAttribute("totalCount", map.get("totalCount"));				
model.addAttribute("paging", map.get("paging"));				
model.addAttribute("searchOption", searchOption);				
model.addAttribute("searchValue", searchValue);				
				
				
return map;				
}		


@RequestMapping(value = "/ajax/feseEntityInsertDo", method = RequestMethod.POST)		
public void ajaxfeseEntityInsertDo(Model model,Farm farm,String farm_Id,FecesInput  entityInsert,MultipartHttpServletRequest request,MultipartFile file,Fecesimg entityImgInsert) throws IllegalStateException, IOException {		
		
	//MultipartFile file = request.getFile("uploadfile");
	
 // 파일가져오기
	 file = request.getFile("uploadfile");
//		     String fileName = file.getOriginalFilename();
//	         String path = "C:\\Users\\Administrator\\git\\RDA\\rda\\src\\main\\webapp\\resources\\upload\\"+fileName;
//		     File destFile = new File(path); 
//		     file .transferTo(destFile);
//		     
//		     
//		     
//		     System.out.println("-------------- file end --------------" + fileName);
// 
	
	 //오리지날 파일이름 가져오기
	 String fileName = file.getOriginalFilename();
	 entityImgInsert.setORIGINIMG(fileName);
	 System.out.println(" 객체 오리지날  파일이름 "+fileName);
	 //확장자가져오기
	 int pos = fileName.lastIndexOf( "." );
	 String ext = fileName.substring( pos + 1 );	
	 System.out.println(" 객체확장자가져오기   "+ext);
	
	 //경로가져오기
	  String path = "C:\\Users\\Administrator\\git\\RDA\\rda\\src\\main\\webapp\\resources\\upload\\";
	  System.out.println(" 객체 경로가져오기   "+path);
	 UUID uuid = UUID.randomUUID();
	 
	 
	 
     // 랜덤생성+파일이름 저장
	 String savedName = uuid.toString()+"."+ext;
 	entityInsert.setFECES_IMAGE(savedName);
	 System.out.println(" 객체 저장될 파일이름  "+savedName);
	 
     File target = new File(path, savedName);
     // 임시디렉토리에 저장된 업로드된 파일을 지정된 디렉토리로 복사
     // FileCopyUtils.copy(바이트배열, 파일객체)
     FileCopyUtils.copy(file.getBytes(), target);
 
    
	
	
	
//	String gather = entityInsert.getFECES_GATHERDATE1()+"년"+entityInsert.getFECES_GATHERDATE2()+"월"+entityInsert.getFECES_GATHERDATE3()+"일"+entityInsert.getFECES_GATHERDATE4()+"시";
//	String occur = entityInsert.getFECES_OCCURDATE1()+"년"+entityInsert.getFECES_OCCURDATE2()+"월"+entityInsert.getFECES_OCCURDATE3()+"일"+entityInsert.getFECES_OCCURDATE4()+"시";
//	 
     String occur = entityInsert.getTotalDate();
     String gather = entityInsert.getTotalDate1();
    		 
	entityInsert.setFECES_GATHERDATE(gather);
	entityInsert.setFECES_OCCURDATE(occur);

 System.out.println(" 객체 입11력하기   "+entityInsert.getFECES_IMAGE());
 System.out.println(" 객체 입11력하기   "+entityImgInsert.getORIGINIMG());
 System.out.println(" 객체 입11력하기   "+entityInsert.getENTITY_ID());
	
	//분변정보와 실제이미지명
	int resultImg = feseService.ajaxfeseEntityInsertImgDo( entityImgInsert);		
	//분변의 원래이미지명
	int result = feseService.ajaxfeseEntityInsertDo(entityInsert);		
System.out.println(" 객체 입력하기   " +result );					



 
//return result;		
}		




@RequestMapping(value = "/ajax/feseEntityImgList", method = RequestMethod.POST)				
public Map<String,Object> ajaxfeseEntityImgList(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,			
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,			
	@RequestParam(value="searchValue", defaultValue="none") String searchValue, String entity_id) {			
Map<String, Object> map = feseService.ajaxfeseEntityImgList(entity_id);	

model.addAttribute("farmList", map.get("farmList"));				
model.addAttribute("totalCount", map.get("totalCount"));				
model.addAttribute("paging", map.get("paging"));				
model.addAttribute("searchOption", searchOption);				
model.addAttribute("searchValue", searchValue);				
				
				
return map;				
}		
 
}				
				
				
