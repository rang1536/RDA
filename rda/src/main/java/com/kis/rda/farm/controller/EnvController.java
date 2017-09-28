	package com.kis.rda.farm.controller;				
 		
					
	import org.springframework.beans.factory.annotation.Autowired;				
 			
	import org.springframework.stereotype.Controller;				
	import org.springframework.ui.Model;				
	import org.springframework.web.bind.annotation.RequestMapping;				
	import org.springframework.web.bind.annotation.RequestMethod;				
	import org.springframework.web.bind.annotation.RequestParam;

import com.kis.rda.common.domain.Environment;
 
 
import com.kis.rda.farm.service.EnvService;				
					
					
	@Controller				
	public class EnvController {				
					
	@Autowired				
	private EnvService envService;				
					
	@RequestMapping(value = "/envList", method = RequestMethod.GET)				
	public String envList(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
	@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
 			
	return "data_management/env/env_list";				
		}	
	
        //환경자료 > 관리리스트 열기
	
	@RequestMapping(value = "/envEntityList", method = RequestMethod.GET)				
	public String entityEnvList(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
	@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {				
	
	 model.addAttribute("farmId", farmId);			 
	return "data_management/env/envEntity_list";				
	}	

	    //환경자료 > 관리리스트 > 수정폼 열기
		
	@RequestMapping(value = "/envEntityUpdate", method = RequestMethod.GET)				
	public String entityEnvUpdate(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
	@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String seqno,Environment  environment) {		
		model.addAttribute("farmId", farmId);		
		model.addAttribute("seqno", seqno);		
	 	 
	Environment EntityList = 	envService.envEntityUpdateSelectOne(seqno);
	model.addAttribute("EntityList", EntityList);	
	return "data_management/env/envEntity_update";				
	}	
		//환경자료 > 관리리스트 > 추가 폼 열기
	 
	@RequestMapping(value = "/envEntityInsert", method = RequestMethod.GET)				
	public String envEntityInsert(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
	@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId) {		
		 
    model.addAttribute("farmId", farmId);			 
	return "data_management/env/envEntity_insert";				
	}	
	 
	
}				

	