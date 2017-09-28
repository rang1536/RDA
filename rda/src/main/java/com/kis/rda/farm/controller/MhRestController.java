package com.kis.rda.farm.controller;				
				
import java.util.Map;				
				
import org.springframework.beans.factory.annotation.Autowired;				
 			
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;				
import org.springframework.web.bind.annotation.RestController;

import com.kis.rda.common.domain.Bir;
 
import com.kis.rda.common.domain.Medicalhistory;
import com.kis.rda.farm.domain.Farm;
 
import com.kis.rda.farm.service.MhService;				
				
@RestController				
public class MhRestController {				
				
@Autowired				
private MhService mhService;				
 


@RequestMapping(value = "/ajax/mhEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaxmhEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,Medicalhistory  entityDetail) {		

 Map<String, Object> map =mhService.ajaxmhEntityListDetail(entityDetail );		  			
model.addAttribute("entityEntityList", map.get("entityList"));	
return map;			
}	

@RequestMapping(value = "/ajax/mhEntityInsertDo", method = RequestMethod.POST)		
public int ajaxmhEntityInsertDo(Model model,Farm farm,String farm_Id,Medicalhistory  entityInsert) {		
		

	entityInsert.setOCCUR_DATE(entityInsert.getTotalDate());
	entityInsert.setCURE_DATE(entityInsert.getTotalDate1());
	entityInsert.setRECOVERY_DATE(entityInsert.getTotalDate2());

	int result = mhService.ajaxmhEntityInsertDo(entityInsert);						
return result;		
}		
		

//  수정하기			
@RequestMapping(value = "/ajax/mhEntityUpdatetDo", method = RequestMethod.POST)		
public int ajaxmhEntityUpdatetDo(Model model,Farm farm,String farm_Id,Medicalhistory  entityUpdate) {			 
	
	entityUpdate.setOCCUR_DATE(entityUpdate.getTotalDate());
	entityUpdate.setCURE_DATE(entityUpdate.getTotalDate1());
	entityUpdate.setRECOVERY_DATE(entityUpdate.getTotalDate2());
int result = mhService.ajaxmhEntityUpdatetDo(entityUpdate);			
model.addAttribute("result", result);				
return result;		
}		
		
//  삭제하기 envEntityDeleteDo		
@RequestMapping(value = "/ajax/mhEntityDeleteDo", method = RequestMethod.POST)		
public int ajaxmhEntityDeleteDo(Model model,Farm farm,String farm_Id,Bir  seqno) {		
	
int result = mhService.ajaxmhEntityDeleteDo(seqno.getSEQNO());				
model.addAttribute("result", result);				
return result;		
}		
		

}				
				
				
				
