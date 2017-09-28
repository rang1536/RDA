package com.kis.rda.basic.controller;				
				
import java.util.List;
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
				
				
import com.kis.rda.basic.service.BasicService;
import com.kis.rda.farm.domain.Cbcentity;
import com.kis.rda.farm.domain.FarmMap;
import com.kis.rda.farm.service.FarmService;				
				
@RestController				
public class BasicRestController {				
				
	@Autowired				
	private BasicService temperService;	
	
	@Autowired
	private FarmService farmService;
	
	@RequestMapping(value = "/ajax/temperList", method = RequestMethod.POST)				
		public Map<String,Object> ajaxtemperList(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,			
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,			
			@RequestParam(value="searchValue", defaultValue="none") String searchValue) {			
		Map<String, Object> map = temperService.selectFarmListServ(pageNum, searchOption, searchValue);				
		model.addAttribute("farmList", map.get("farmList"));				
		model.addAttribute("totalCount", map.get("totalCount"));				
		model.addAttribute("paging", map.get("paging"));				
		model.addAttribute("searchOption", searchOption);				
		model.addAttribute("searchValue", searchValue);				
						
						
		return map;				
	}		
	
	
	
	@RequestMapping(value = "/ajax/basicEntityList", method = RequestMethod.POST)			
		public Map<String,Object> ajaxbasicEntityList(Model model,			
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
			@RequestParam(value="searchValue", defaultValue="none") String entity_id,String searchValue,Cbcentity  entityDetail,String sensedevtipe) {		
			  System.out.println("목장birEntityListDetail"+ entity_id);	
		 
		 Map<String, Object> map =temperService.ajaxbasicEntityList(sensedevtipe );			
 
		  			
		model.addAttribute("entityEntityList", map.get("entityList"));			
	 	
					
					
		return map;			
	}	

	@RequestMapping(value = "/markerMap", method = RequestMethod.POST)
	public List<FarmMap> markerMapCtrl(@RequestParam(value="farmDo", defaultValue="전체") String farmDo) {
		System.out.println("지역확인 : "+farmDo);
		List<FarmMap> farmList = farmService.readFarmMapAllServ(farmDo);
		/*System.out.println(farmList);*/
		return farmList;
	}

}				
				
				
