package com.kis.rda.farm.controller;				
				
import java.util.Map;				
				
import org.springframework.beans.factory.annotation.Autowired;				
import org.springframework.http.HttpHeaders;				
import org.springframework.http.HttpStatus;				
import org.springframework.http.ResponseEntity;				
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;				
import org.springframework.web.bind.annotation.RestController;

import com.kis.rda.common.domain.Bir;
import com.kis.rda.common.domain.Environment;
 
import com.kis.rda.farm.domain.EntityList;
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.service.BirService;				
				
@RestController				
public class BirRestController {				
				
@Autowired				
private BirService birService;				
		
@RequestMapping(value = "/ajax/birEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaxbirEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,Bir entityDetail) {		
	String entity_id=entityDetail.getENTITY_ID();		
 
 Map<String, Object> map =birService.ajaxbirEntityListDetail(entityDetail );					
model.addAttribute("entityEntityList", map.get("entityList"));		 	
return map;			
}			
 
	@RequestMapping(value = "/ajax/birEntityInsertDo", method = RequestMethod.POST)		
	public int ajaxbirEntityInsertDo(Model model,Farm farm,String farm_Id,Bir  entityInsert) {		
			
		entityInsert.setCHECK_DATE(entityInsert.getTotalDate());
		int result = birService.ajaxbirEntityInsertDo(entityInsert);						
	return result;		
	}		
			 
	@RequestMapping(value = "/ajax/birEntityUpdatetDo", method = RequestMethod.POST)		
	public int ajaxbirEntityUpdatetDo(Model model,Farm farm,String farm_Id,Bir entityUpdate) {		
						 
	entityUpdate.setCHECK_DATE(	entityUpdate.getTotalDate());			
	int result = birService.ajaxbirEntityUpdatetDo(entityUpdate);				
	model.addAttribute("result", result);					
	return result;		
	}		
			

	@RequestMapping(value = "/ajax/birEntityDeleteDo", method = RequestMethod.POST)		
	public int ajaxbirEntityDeleteDo(Model model,Farm farm,String farm_Id,Bir  seqno) {		
		
	int result = birService.ajaxbirEntityDeleteDo(seqno.getSEQNO());		 		
	model.addAttribute("result", result);					
	return result;		
	}		
			
			
			
			

}				
				
				
