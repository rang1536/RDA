package com.kis.rda.farm.controller;

import java.util.ArrayList;
import java.util.List;
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

import com.kis.rda.farm.domain.Aduino;
import com.kis.rda.farm.service.SenseService;								
				
@Controller				
public class SenseController {				
				
	@Autowired				
	private SenseService senseService;										
				
	//=============================현황==================================================		
	@RequestMapping(value = "/senseCountList", method = RequestMethod.GET)				
	public String senseCountList(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
					
		return "data_management/sensecount/senseCount_list";				
	}		


	//==============================개체=================================================		
	@RequestMapping(value = "/senseEntityList", method = RequestMethod.GET)				
	public String senseEntityList(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
				
		model.addAttribute("searchOption", searchOption);				
		model.addAttribute("searchValue", searchValue);				
		return "data_management/senseentity/senseEntity_list";				
	}		

	//활동량 목록 ? 데이터보기
	@RequestMapping(value = "/senseEntityListDetail", method = RequestMethod.GET)				
	public String senseEntityListDetail(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="sensecuid", defaultValue="none") String sensecuid,				
			@RequestParam(value="sensenodeid", defaultValue="none") String sensenodeid) {				
					
		model.addAttribute("sensecuid", sensecuid);				
		model.addAttribute("sensenodeid", sensenodeid);				
		return "data_management/senseentity/senseEntity_list_detail";				
	}		



	@RequestMapping(value = "/senseEntityChart", method = RequestMethod.GET)				
	public String senseEntityChart(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="sensecuid", defaultValue="none") String sensecuid,				
			@RequestParam(value="sensenodeid", defaultValue="none") String sensenodeid) {				
		model.addAttribute("sense_nodeId",sensenodeid);
		model.addAttribute("sense_cuId", sensecuid); 
		 
		Map<String, Object> map1 = senseService.selectchartymd(sensenodeid);	
		Map<String, Object> map11 = senseService.selectupdown(sensenodeid);	
		Map<String, Object> map2 = senseService.selectchartavg(sensenodeid);	
		Map<String, Object> map3 = senseService.selectchartcentr(sensenodeid);
		
		model.addAttribute("chartymd", map1.get("chartymd"));
		model.addAttribute("chartupdown", map11.get("chartupdown"));
		model.addAttribute("chartavg", map2.get("chartavg")); 
		model.addAttribute("chartcentr", map3.get("chartcentr"));			
		return "data_management/senseentity/chart_22";				
	}	
	
	//===============================축사================================================		
	@RequestMapping(value = "/senseStableList", method = RequestMethod.GET)				
	public String senseStableList(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
	return "data_management/sensestable/senseStable_list";				
	}		


	@RequestMapping(value = "/senseStableListDetail", method = RequestMethod.GET)				
	public String senseStableListDetail(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue,String sensecuid,String sensenodeid) {				
		model.addAttribute("sensecuid", sensecuid);				
		model.addAttribute("sensenodeid", sensenodeid);		
			
		return "data_management/sensestable/senseStable_list_detail";				
	}		



	@RequestMapping(value = "/senseStableChart", method = RequestMethod.GET)				
	public String senseStableChart(Model model,				
		@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
		@RequestParam(value="sensenodeid", defaultValue="none") String senseNodeId,				
		@RequestParam(value="sensecuid", defaultValue="none") String sensecuid) {				
	
		Map<String, Object> map1 = senseService.selectStablechartymd(senseNodeId);	
		 
		Map<String, Object> map2 = senseService.selectStablechartavg(senseNodeId);	
		Map<String, Object> map3 = senseService.selectStablechartavg2(senseNodeId);	
		Map<String, Object> map5= senseService.selectStablechartavg3(senseNodeId);	
		
		model.addAttribute("chartymd", map1.get("chartymd"));
		model.addAttribute("chartavg", map2.get("chartavg")); 
		model.addAttribute("chartavg2", map3.get("chartavg2")); 
		model.addAttribute("chartavg3", map5.get("chartavg3")); 
		
		model.addAttribute("sensecuid", sensecuid);				
		model.addAttribute("sensenodeid", senseNodeId);		
				
		return "data_management/sensestable/chart_env";				
	}		


	@RequestMapping(value = "/senseStableEntityInsert", method = RequestMethod.GET)				
	public String senseStableEntityInsert(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue,String sense_nodeId,String sense_cuId,String sensecuid,String sensenodeid) {				
		model.addAttribute("sensecuid", sensecuid);				
		model.addAttribute("sensenodeid", sensenodeid);		
		
		return "data_management/sensestable/senseStableEntity_insert";				
	}		


	//축사 자료 리스트( 센스가 있는 ?? 목장리스트) > (분석) 보기
 
	//아두이노 센싱자료 목록가기
	@RequestMapping(value = "/sensing", method = RequestMethod.GET)				
	public String aduinoSensingCtrl(Model model) {				
		return "data_management/sensestable/sensing_list";				
	}		
}				
