package com.kis.rda.farm.controller;				
import java.util.HashMap;
import java.util.Map;				
				
import org.springframework.beans.factory.annotation.Autowired;				
import org.springframework.http.HttpHeaders;				
import org.springframework.http.HttpStatus;				
import org.springframework.http.ResponseEntity;				
import org.springframework.stereotype.Controller;				
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;

import com.kis.rda.common.domain.Bir;
 
import com.kis.rda.farm.service.BirService;				
				
				
@Controller				
public class BirController {				
				
@Autowired				
private BirService birService;				
				
				
 		
@RequestMapping(value = "/birList", method = RequestMethod.GET)				
public String birList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
 		
return "data_management/bir/bir_list";				
	}		

 
@RequestMapping(value = "/birEntityList", method = RequestMethod.GET)	
public String birEntityList(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id ) {	
 	
  model.addAttribute("entity_id", entity_id);	
  model.addAttribute("farmId", farmId);	
 
return "data_management/bir/birEntity_list";	
}	
@RequestMapping(value = "/birEntityListDetail", method = RequestMethod.GET)	
public String birEntityListDetail(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id ) {	
 	
	 model.addAttribute("entity_id", entity_id);	
	 model.addAttribute("farmId", farmId);	
 
return "data_management/bir/birEntity_list_detail";	
}	
 
	
@RequestMapping(value = "/birEntityUpdate", method = RequestMethod.GET)	
public String birEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id, String  seqno) {	
	model.addAttribute("farmId", farmId);
  
 Bir  birentity = 	birService.birEntityUpdateSelectOne(seqno);
  
 String date[] = birentity.getCHECK_DATE().split("/");
 
 model.addAttribute("entity_id", entity_id);	
 model.addAttribute("birentity", birentity);	
 
return "data_management/bir/birEntity_update";	
}	
  	
	
@RequestMapping(value = "/birEntityInsert", method = RequestMethod.GET)	
public String birEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id) {	
	
 	model.addAttribute("old_entity_id", entity_id);
	model.addAttribute("farmId", farmId);	
 
return "data_management/bir/birEntity_insert";	
}	
	
 

}				
