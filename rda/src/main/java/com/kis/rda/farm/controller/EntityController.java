package com.kis.rda.farm.controller;				
 		
				
import org.springframework.beans.factory.annotation.Autowired;				
 			
import org.springframework.stereotype.Controller;				
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;

import com.kis.rda.common.domain.Entity;
 
import com.kis.rda.farm.service.EntityService;				
				
				
@Controller				
public class EntityController {				
				
@Autowired				
private EntityService entityService;								
				
// 개체자료 메인리스트				
@RequestMapping(value = "/entityList", method = RequestMethod.GET)				
public String entityList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {			
			
return "data_management/entity/entity_list";				
	}	

 //개체자료 > 자료관리리스트 열기

@RequestMapping(value = "/entityEntityList", method = RequestMethod.GET)				
public String entityEntityList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		

 model.addAttribute("farmId", farmId);					
return "data_management/entity/entityEntity_list";				
}	


  //개체자료 > 관리리스트 > 수정 열기
@RequestMapping(value = "/entityEntityUpdate", method = RequestMethod.GET)	
public String entityEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id) {	
model.addAttribute("farmId", farmId);
model.addAttribute("entity_id", entity_id);

Entity entityEntity =  entityService.ajaxenvEntitySelectOneBeforUpdate(entity_id);	
model.addAttribute("entityEntity", entityEntity);	
return "data_management/entity/entityEntity_update";	
}	


@RequestMapping(value = "/entityEntityInsert", method = RequestMethod.GET)	
public String envEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ,String entity_id) {	

model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/entity/entityEntity_insert";	
}	


}				
