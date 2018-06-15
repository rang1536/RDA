package com.kis.rda.farm.controller;				
				
import java.util.HashMap;
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

import com.kis.rda.common.domain.Sense;
import com.kis.rda.farm.domain.Aduino;
import com.kis.rda.farm.domain.Cbcentity;
import com.kis.rda.farm.domain.EntityList;
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.domain.TbSenseEntityList;
import com.kis.rda.farm.domain.TbSenseEntityListDetail;
import com.kis.rda.farm.domain.TbsenseStableList;
import com.kis.rda.farm.service.SenseService;				
				
@RestController				
public class SenseRestController {				
				
	@Autowired				
	private SenseService senseService;				
	//@RequestMapping(value = "/ajax/senseList", method = RequestMethod.POST)				
	//public Map<String,Object> ajaxsenseList(Model model,				
	//	@RequestParam(value="pageNum", defaultValue="1") int pageNum,			
	//	@RequestParam(value="searchOption", defaultValue="none") String searchOption,			
	//	@RequestParam(value="searchValue", defaultValue="none") String searchValue) {			
	//Map<String, Object> map = senseService.selectFarmListServ(pageNum, searchOption, searchValue);				
	//model.addAttribute("farmList", map.get("farmList"));				
	//model.addAttribute("totalCount", map.get("totalCount"));				
	//model.addAttribute("paging", map.get("paging"));				
	//model.addAttribute("searchOption", searchOption);				
	//model.addAttribute("searchValue", searchValue);				
	//				
	//				
	//return map;				
	//}			
	
	
	
	
	//=============================현황==================================================		
	
	@RequestMapping(value = "/ajax/senseCountList", method = RequestMethod.POST)			
	public List<Map<String, Object>> ajaxsenseCountList(Model model,
			@RequestParam(value="pageNum", defaultValue="1") int pageNum) {		
		
		List<Map<String, Object>> map =senseService.readEntityActiveCountServ();
		return map;			
	}	
	
	
	//==============================개체=================================================		
	
	@RequestMapping(value = "/ajax/senseEntityList", method = RequestMethod.POST)			
	public Map<String,Object> ajaxsenseEntityList(Model model,			
		@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
		@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
		@RequestParam(value="searchValue", defaultValue="none") String entity_id,String searchValue,Cbcentity  entityDetail) {		
		  System.out.println("목장birEntityListDetail"+ entity_id);	
	 
	 Map<String, Object> map =senseService.ajaxsenseEntityList( );			
	  //entityEntityList =entityService.ajaxentityEntityList(farmId);			
	  			
	model.addAttribute("entityEntityList", map.get("entityList"));			
	  System.out.println("목장birEntityListDetail"+ entity_id);			
	 //model.addAttribute("entityEntityList",entityEntityList  );			
	//model.addAttribute("paging", map.get("paging"));			
	//model.addAttribute("searchOption", searchOption);			
	//model.addAttribute("searchValue", searchValue);			
				
				
	return map;			
	}	
	
	@RequestMapping(value = "/ajax/senseEntityListDetail", method = RequestMethod.POST)			
	public Map<String,Object> ajaxsenseEntityListDetail(Model model,			
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
			@RequestParam(value="sensecuid", defaultValue="none") String sensecuid,		
			@RequestParam(value="NODEID", defaultValue="none") String NODEID,TbSenseEntityListDetail entityDetail) {		
		 System.out.println("목장sensecuid : "+ sensecuid);	
		 System.out.println("목장sensenodeid : "+ NODEID);
		 System.out.println("목장sensenodeid2 : "+ entityDetail.getNODEID());	
		 System.out.println("entityDetail : "+ entityDetail);
		 
		 Map<String, Object> map =senseService.ajaxsenseEntityListDetail(entityDetail);			
		  //entityEntityList =entityService.ajaxentityEntityList(farmId);			
		
		 model.addAttribute("entityEntityList", map.get("ajaxList"));			
		  	
		 return map;			
		}	
	
	//===============================축사================================================		
	
	@RequestMapping(value = "/ajax/senseStableList", method = RequestMethod.POST)			
	public Map<String,Object> ajaxsenseStableList(Model model,			
		@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
		@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
		@RequestParam(value="searchValue", defaultValue="none") String entity_id,String searchValue,TbSenseEntityList  entityDetail) {		
		  System.out.println("목장birEntityListDetail"+ entity_id);	
	 
	 Map<String, Object> map =senseService.ajaxsenseStableList( );			
	  //entityEntityList =entityService.ajaxentityEntityList(farmId);			
	  			
	model.addAttribute("entityEntityList", map.get("entityList"));			
	  System.out.println("목장birEntityListDetail"+ entity_id);			
	 //model.addAttribute("entityEntityList",entityEntityList  );			
	//model.addAttribute("paging", map.get("paging"));			
	//model.addAttribute("searchOption", searchOption);			
	//model.addAttribute("searchValue", searchValue);			
				
				
	return map;			
	}	
	
	
	
	@RequestMapping(value = "/ajax/senseStableListDetail", method = RequestMethod.POST)			
	public Map<String,Object> ajaxsenseStableListDetail(Model model,			
		@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
		@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
		@RequestParam(value="searchValue", defaultValue="none") String entity_id,String searchValue,TbsenseStableList  entityDetail) {		
		  System.out.println("목장birEntityListDetail"+ entity_id);	
	 
	 Map<String, Object> map =senseService.ajaxsenseStableListDetail(entityDetail );			
	  //entityEntityList =entityService.ajaxentityEntityList(farmId);			
	  			
	model.addAttribute("entityEntityList", map.get("entityList"));			
	  System.out.println("목장birEntityListDetail"+ entity_id);			
	 //model.addAttribute("entityEntityList",entityEntityList  );			
	//model.addAttribute("paging", map.get("paging"));			
	//model.addAttribute("searchOption", searchOption);			
	//model.addAttribute("searchValue", searchValue);			
				
				
	return map;			
	}	
	@RequestMapping(value = "/ajax/senseStableEntityInsertDo", method = RequestMethod.POST)		
	public int ajaxsenseStableEntityInsertDo(Model model,Farm farm,String farm_Id,Sense  entityInsert) {		
		//System.out.println(" 객체 입력하기   "+environment.getFARM_ID());		
		int result = senseService.ajaxsenseStableEntityInsertDo(entityInsert);		
		System.out.println(" 객체 입력하기   ");		
				
		model.addAttribute("result", result);		
				
		return result;		
	}		
			
	//List<Aduino> list = senseService.readAduinoSensingServ();
	@RequestMapping(value="/aduinoSensingList", method = RequestMethod.POST)
	public Map<String, Object> aduinoSensingListCtrl(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Aduino> list = senseService.readAduinoSensingServ();
		System.out.println("리스트 확인 : "+list);
		resultMap.put("list", list);
		
		return resultMap;
	}
	
	//getDistance
	@RequestMapping(value="/getDistance", method = RequestMethod.POST)
	public Map<String, Object> getDistanceCtrl(@RequestParam(value="date") String date,
			@RequestParam(value="startTime") String startTime,
			@RequestParam(value="endTime") String endTime){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		System.out.println("date : "+date);
		System.out.println("startTime : "+startTime);
		System.out.println("startTime : "+endTime);
		
		resultMap = senseService.getDistanceServ(date, startTime, endTime);
		return resultMap;
	}
}				
				
				
				
