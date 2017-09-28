package com.kis.rda.farm.controller;				
import java.util.Map;				
				
import org.springframework.beans.factory.annotation.Autowired;				
		
import org.springframework.stereotype.Controller;				
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;

import com.kis.rda.common.domain.Medicalhistory;
import com.kis.rda.farm.service.MhService;				
				
				
@Controller				
public class MhController {				
				
@Autowired				
private MhService mhService;				
				
 			
@RequestMapping(value = "/mhList", method = RequestMethod.GET)				
public String mhList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
 	
return "data_management/mh/mh_list";				
	}		

 
@RequestMapping(value = "/mhEntityListDetail", method = RequestMethod.GET)	
public String mhEntityListDetail(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id ) {	
 	
 model.addAttribute("entity_id", entity_id);	
 model.addAttribute("farmId", farmId);	 
return "data_management/mh/mhEntity_list_detail";	
}	
 

@RequestMapping(value = "/mhEntityInsert", method = RequestMethod.GET)	
public String mhEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id) {	
 
model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/mh/mhEntity_insert";	
}	
 
@RequestMapping(value = "/mhEntityList", method = RequestMethod.GET)		
public String mhEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		
 			
model.addAttribute("farmId", farmId);		 		
return "data_management/mh/mhEntity_list";		
}		
@RequestMapping(value = "/mhEntityUpdate", method = RequestMethod.GET)	
public String birEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id,String seqno) {	
model.addAttribute("farmId", farmId);
  
Medicalhistory mhListDetail= mhService.mhEntitySelectOneBeforeUpdate(seqno);		  
model.addAttribute("mhEntityList", mhListDetail);		 
model.addAttribute("entity_id", entity_id);	
model.addAttribute("farmId", farmId);	 
model.addAttribute("seqno", seqno);	
return "data_management/mh/mhEntity_update";	
}	
 

}				
