package com.kis.rda.farm.controller;				
				
import java.util.Map;				
				
import org.springframework.beans.factory.annotation.Autowired;				
import org.springframework.http.HttpHeaders;				
import org.springframework.http.HttpStatus;				
import org.springframework.http.ResponseEntity;				
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
 		
import org.springframework.web.bind.annotation.RestController;

import com.kis.rda.common.domain.Environment;
 
import com.kis.rda.farm.domain.Farm;
 
import com.kis.rda.farm.service.EnvService;				
				
@RestController				
public class EnvRestController {				
				
@Autowired				
private EnvService envService;				

	@RequestMapping(value = "/ajax/envEntityList", method = RequestMethod.POST)
	public Map<String,Object> ajaxenvEntityList(Model model,Farm farm,String farm_Id,Environment environment) {

		String farmId= environment.getFARM_ID();		
		Map<String, Object> map = envService.ajaxenvEntityList(farmId);		
		model.addAttribute("envEntityList", map.get("envList").toString());		
		return map;
	}
//  환경 입력하기
	@RequestMapping(value = "/ajax/envEntityInsertDo", method = RequestMethod.POST)
	public int ajaxenvEntityInsertDo(Model model,Farm farm,String farm_Id,Environment  environment) {
	 
    	 environment.setENV_GATHERDATE( environment.getTotalDate());
		int result = envService.ajaxenvEntityInsertDo(environment);	 
		model.addAttribute("result", result);		
		return result;
	}
	 
 
	
//  환경 수정하기
	@RequestMapping(value = "/ajax/envEntityUpdateDo", method = RequestMethod.POST)
	public int ajaxenvEntityUpdateDo(Model model,Farm farm,String farm_Id,Environment  environment) {

		environment.setENV_GATHERDATE(environment.getTotalDate());		 
		int result = envService.ajaxenvEntityUpdateDo(environment);	  	
		model.addAttribute("result", result);		
		return result;
	}
	
	// 환경삭제하기 envEntityDeleteDo
	@RequestMapping(value = "/ajax/envEntityDeleteDo", method = RequestMethod.POST)
	public int ajaxenvEntityDeleteDo(Model model,Farm farm,String farm_Id,Environment  environment) {
	 
	 	 int result = envService.ajaxenvEntityDeleteDo(environment);	 		
		model.addAttribute("result", result);		
		return result;
	}
	
}				
				
				
				
