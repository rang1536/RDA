package com.kis.rda.farm.controller;				
 

import org.springframework.beans.factory.annotation.Autowired;				
 			
import org.springframework.stereotype.Controller;				
import org.springframework.ui.Model;
 
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;
 

 
import com.kis.rda.farm.service.FeseService;				
				
				
@Controller				
public class FeseController {				
				
@Autowired				
private FeseService feseService;				
				
				
				
				
//분변자료리스트				
@RequestMapping(value = "/feseList", method = RequestMethod.GET)				
public String feseList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
 		
return "data_management/feces/fese_list";				
	}		



 
@RequestMapping(value = "/feseEntityList", method = RequestMethod.GET)		
public String feseEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		
 
model.addAttribute("farmId", farmId);		
 		
return "data_management/feces/feseEntity_list";		
}		
  

@RequestMapping(value = "/fecesEntityInsert", method = RequestMethod.GET)	
public String fecesEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id) {	
 
model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/feces/feseEntity_insert_openWindow";	
}	

//분변 이미지 보기 
@RequestMapping(value = "/feseEntityImgList", method = RequestMethod.GET)		
public String feseEntityImgList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String entity_id ) {		
 		
model.addAttribute("entity_id", entity_id);		 	
return "data_management/feces/feseEntityImg_list";		
}		
 

}				
