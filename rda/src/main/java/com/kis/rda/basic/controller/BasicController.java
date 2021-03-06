package com.kis.rda.basic.controller;		
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
		
		
import com.kis.rda.basic.service.BasicService;
import com.kis.rda.farm.service.SenseService;		
		
		
@Controller		
public class BasicController {		
		
	@Autowired		
	private BasicService basicService;		

	@Autowired
	private SenseService senseService;
	
	@RequestMapping(value = "/basicTempList", method = RequestMethod.GET)				
	public String basicTempList(Model model,
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
		model.addAttribute("searchOption", searchOption);				
		model.addAttribute("searchValue", searchValue);				
		return "data_management/basictemp/basictempEntity_list";				
	}	


	@RequestMapping(value = "/basicTempEntityChart", method = RequestMethod.GET)				
	public String basicTempEntityChart(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue,String sensenodeid,String sensecuid) {				
		Map<String, Object> map = basicService.selectFarmListServ(pageNum, searchOption, searchValue);	
		 
		model.addAttribute("sensenodeid",sensenodeid);
		model.addAttribute("sensecuid", sensecuid);		
		return "data_management/basictemp/chart_22";				
	}		

	@RequestMapping(value = "/basicTempTotalChart", method = RequestMethod.GET)				
	public String basicTempTotalChart(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue,String sensenodeid,String sensecuid) {				
		Map<String, Object> map = basicService.selectFarmListServ(pageNum, searchOption, searchValue);	
		 
		model.addAttribute("sensenodeid",sensenodeid);
		model.addAttribute("sensecuid", sensecuid);			
		return "data_management/basictemp/chart_3";				
	}		

//============================================================
	
	@RequestMapping(value = "/basicActiveList", method = RequestMethod.GET)				
	public String basicActiveList(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
			
		model.addAttribute("searchOption", searchOption);				
		model.addAttribute("searchValue", searchValue);				
		return "data_management/basicactive/basicactiveEntity_list";				
	}	


	@RequestMapping(value = "/basicActiveEntityChart", method = RequestMethod.GET)				
	public String basicActiveEntityChart(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue,String sensenodeid,String sensecuid) {				
		Map<String, Object> map = basicService.selectFarmListServ(pageNum, searchOption, searchValue);	
		 
		model.addAttribute("sensenodeid",sensenodeid);
		model.addAttribute("sensecuid", sensecuid);
		
		Map<String, Object> map1 = senseService.selectchartymd(sensenodeid);	
		Map<String, Object> map11 = senseService.selectupdown(sensenodeid);	
		Map<String, Object> map2 = senseService.selectchartavg(sensenodeid);	
		Map<String, Object> map3 = senseService.selectchartcentr(sensenodeid);
		
		model.addAttribute("chartymd", map1.get("chartymd"));
		model.addAttribute("chartupdown", map11.get("chartupdown"));
		model.addAttribute("chartavg", map2.get("chartavg")); 
		model.addAttribute("chartcentr", map3.get("chartcentr"));
		return "data_management/basicactive/chart_22";				
	}		

	@RequestMapping(value = "/basicActiveTotalChart", method = RequestMethod.GET)				
	public String basicActiveTotalChart(Model model,				
			@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
			@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
			@RequestParam(value="searchValue", defaultValue="none") String searchValue,String sensenodeid,String sensecuid) {				
		
		List<List<Integer>> list = senseService.readEntityActiveServ();
		model.addAttribute("list", list);
		
		List<String> dateList = senseService.readDateListServ();
		model.addAttribute("dateList", dateList);
		
		System.out.println("활동값 확인 : "+list);
		System.out.println("날짜 확인 : "+dateList);
		// 개체별 일일 활동량 평균값의 리스트
		return "data_management/basicactive/chart_ACTION";
		/*return null;*/
	}		

	@RequestMapping(value="/chartTr", method = RequestMethod.GET)
	public String chartTrCtrl() {
		return "data_management/basicactive/chart_tr";
	}
}		
