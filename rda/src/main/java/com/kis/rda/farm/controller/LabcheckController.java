package com.kis.rda.farm.controller;				
import java.util.Map;				
				
import org.springframework.beans.factory.annotation.Autowired;				
 			
import org.springframework.stereotype.Controller;				
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;

import com.kis.rda.common.domain.Biochemical;
import com.kis.rda.common.domain.Cbc;

import com.kis.rda.farm.service.LabcheckService;				
 
 
import com.kis.rda.common.domain.Immune;
import com.kis.rda.common.domain.Infection;
import com.kis.rda.common.domain.Istat;
import com.kis.rda.common.domain.Phos;				
				
@Controller				
public class LabcheckController {				
				
@Autowired				
private LabcheckService labcheckService;				
				
				 
				
 	

//=================== [  CBC  ] =======================================================================


@RequestMapping(value = "/cbcList", method = RequestMethod.GET)				
public String cbcList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
//Map<String, Object> map = labcheckService.selectFarmListServ(pageNum, searchOption, searchValue);				
//model.addAttribute("farmList", map.get("farmList"));				
//model.addAttribute("totalCount", map.get("totalCount"));				
//model.addAttribute("paging", map.get("paging"));				
//model.addAttribute("searchOption", searchOption);				
//model.addAttribute("searchValue", searchValue);				
return "data_management/labcheckcbc/cbc_list";				
	}		

@RequestMapping(value = "/cbcEntityList", method = RequestMethod.GET)		
public String cbcEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		
 	
			
 model.addAttribute("farmId", farmId);		
 return "data_management/labcheckcbc/cbcEntity_list";		
}		

@RequestMapping(value = "/cbcEntityListDetail", method = RequestMethod.GET)		
public String cbcEntityListDetail(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno  ) {		
 		
 model.addAttribute("entity_id", entity_id);			
 model.addAttribute("farmId", farmId);		
 		
return "data_management/labcheckcbc/cbcEntity_list_detail";		
}		



@RequestMapping(value = "/cbcEntityInsert", method = RequestMethod.GET)	
public String cbcEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno) {	

model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/labcheckcbc/cbcEntity_insert";	
}	


@RequestMapping(value = "/cbcEntityUpdate", method = RequestMethod.GET)	
public String cbcEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id,String seqno ) {	
model.addAttribute("farmId", farmId);
 
Cbc  ListDetail= labcheckService.cbcEntitySelectOneBeforeUpdate(seqno);		
  
model.addAttribute("EntityList", ListDetail);		
model.addAttribute("entity_id", entity_id);	
model.addAttribute("farmId", farmId);	
return "data_management/labcheckcbc/cbcEntity_update";	
}	


//========================[  생화학   ]==================================================================



@RequestMapping(value = "/biochemicalList", method = RequestMethod.GET)				
public String biochemicalList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
//Map<String, Object> map = labcheckService.selectFarmListServ(pageNum, searchOption, searchValue);				
//model.addAttribute("farmList", map.get("farmList"));				
//model.addAttribute("totalCount", map.get("totalCount"));				
//model.addAttribute("paging", map.get("paging"));				
//model.addAttribute("searchOption", searchOption);				
//model.addAttribute("searchValue", searchValue);				
return "data_management/labcheckbiochemical/biochemical_list";				
	}		



@RequestMapping(value = "/biochemicalEntityList", method = RequestMethod.GET)		
public String biochemicalEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		
	
 model.addAttribute("farmId", farmId);		
 		
return "data_management/labcheckbiochemical/biochemicalEntity_list";		
}		

@RequestMapping(value = "/biochemicalEntityListDetail", method = RequestMethod.GET)		
public String biochemicalEntityListDetail(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno  ) {		
 		
 model.addAttribute("entity_id", entity_id);				
 model.addAttribute("farmId", farmId);		
 
return "data_management/labcheckbiochemical/biochemicalEntity_list_detail";		
}		



@RequestMapping(value = "/biochemicalEntityInsert", method = RequestMethod.GET)	
public String biochemicalEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno) {	

 
model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/labcheckbiochemical/biochemicalEntity_insert";	
}	


@RequestMapping(value = "/biochemicalEntityUpdate", method = RequestMethod.GET)	
public String biochemicalEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id,String seqno) {	
model.addAttribute("farmId", farmId);
  
Biochemical  ListDetail= labcheckService.biochemicalEntitySelectOneBeforeUpdate(seqno);		
  
model.addAttribute("EntityList", ListDetail);		
 
model.addAttribute("entity_id", entity_id);	
model.addAttribute("farmId", farmId);	
return "data_management/labcheckbiochemical/biochemicalEntity_update";	
}	

//========================[  phos   ]==================================================================




@RequestMapping(value = "/phosList", method = RequestMethod.GET)				
public String phosList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
//Map<String, Object> map = labcheckService.selectFarmListServ(pageNum, searchOption, searchValue);		
//
//model.addAttribute("farmList", map.get("farmList"));				
//model.addAttribute("totalCount", map.get("totalCount"));				
//model.addAttribute("paging", map.get("paging"));				
//model.addAttribute("searchOption", searchOption);				
//model.addAttribute("searchValue", searchValue);				
return "data_management/labcheckphos/phos_list";				
	}		


@RequestMapping(value = "/phosEntityList", method = RequestMethod.GET)		
public String phosEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		
 	 	
 model.addAttribute("farmId", farmId);		
  
return "data_management/labcheckphos/phosEntity_list";		
}		
		 


 
@RequestMapping(value = "/phosEntityListDetail", method = RequestMethod.GET)		
public String phosEntityListDetail(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId , String entity_id,String seqno) {		
 		
model.addAttribute("entity_id", entity_id);				
 model.addAttribute("farmId", farmId);		 	
return "data_management/labcheckphos/phosEntity_list_detail";		
}		


@RequestMapping(value = "/phosEntityInsert", method = RequestMethod.GET)	
public String phosEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno) {	
 
model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/labcheckphos/phosEntity_insert";	
}	


@RequestMapping(value = "/phosEntityUpdate", method = RequestMethod.GET)	
public String phosEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id,String seqno) {	
model.addAttribute("farmId", farmId);
 

Phos  ListDetail= labcheckService.phosEntitySelectOneBeforeUpdate(seqno);	
model.addAttribute("EntityList", ListDetail);		
model.addAttribute("entity_id", entity_id);	
model.addAttribute("farmId", farmId);	
return "data_management/labcheckphos/phosEntity_update";	
}	
//========================[  iStat   ]==================================================================



@RequestMapping(value = "/istatList", method = RequestMethod.GET)				
public String istatList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
//Map<String, Object> map = labcheckService.selectFarmListServ(pageNum, searchOption, searchValue);				
//model.addAttribute("farmList", map.get("farmList"));				
//model.addAttribute("totalCount", map.get("totalCount"));				
//model.addAttribute("paging", map.get("paging"));				
//model.addAttribute("searchOption", searchOption);				
//model.addAttribute("searchValue", searchValue);				
return "data_management/labcheckistat/istat_list";				
	}		

@RequestMapping(value = "/istatEntityList", method = RequestMethod.GET)		
public String istatEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		
 
 model.addAttribute("farmId", farmId);		 	
return "data_management/labcheckistat/istatEntity_list";		
}		
		 

@RequestMapping(value = "/istatEntityListDetail", method = RequestMethod.GET)		
public String istatEntityListDetail(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno ) {		
 		
 model.addAttribute("entity_id", entity_id);				
 model.addAttribute("farmId", farmId);		 
return "data_management/labcheckistat/istatEntity_list_detail";		
}		



@RequestMapping(value = "/istatEntityInsert", method = RequestMethod.GET)	
public String istatEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno) {	
 
model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/labcheckistat/istatEntity_insert";	
}	


@RequestMapping(value = "/istatEntityUpdate", method = RequestMethod.GET)	
public String istatEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id,String seqno) {	
model.addAttribute("farmId", farmId);
 

Istat ListDetail= labcheckService.istatEntitySelectOneBeforeUpdate(seqno);		
 
model.addAttribute("EntityList", ListDetail);		
model.addAttribute("entity_id", entity_id);	
model.addAttribute("farmId", farmId);	
return "data_management/labcheckistat/istatEntity_update";	
}	
//========================[   면역 및 염증인자   ]==================================================================



@RequestMapping(value = "/immuneList", method = RequestMethod.GET)				
public String immuneList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
//Map<String, Object> map = labcheckService.selectFarmListServ(pageNum, searchOption, searchValue);	
//
//model.addAttribute("farmList", map.get("farmList"));				
//model.addAttribute("totalCount", map.get("totalCount"));				
//model.addAttribute("paging", map.get("paging"));				
//model.addAttribute("searchOption", searchOption);				
//model.addAttribute("searchValue", searchValue);				
return "data_management/labcheckimmune/immune_list";				
	}	


@RequestMapping(value = "/immuneEntityList", method = RequestMethod.GET)		
public String immuneEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {		
		
		
 model.addAttribute("farmId", farmId);		 
return "data_management/labcheckimmune/immuneEntity_list";		
}		
		 



@RequestMapping(value = "/immuneEntityListDetail", method = RequestMethod.GET)		
public String immuneEntityListDetail(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId , String entity_id,String seqno) {		
 		
 model.addAttribute("entity_id", entity_id);				
 model.addAttribute("farmId", farmId);		 		
return "data_management/labcheckimmune/immuneEntity_list_detail";		
}		


@RequestMapping(value = "/immuneEntityInsert", method = RequestMethod.GET)	
public String immuneEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno) {	
 
model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/labcheckimmune/immuneEntity_insert";	
}	


@RequestMapping(value = "/immuneEntityUpdate", method = RequestMethod.GET)	
public String immuneEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id,String seqno) {	
model.addAttribute("farmId", farmId);
Immune ListDetail= labcheckService.immuneEntitySelectOneBeforeUpdate(seqno);		

model.addAttribute("EntityList", ListDetail);		 
model.addAttribute("entity_id", entity_id);	
model.addAttribute("farmId", farmId);	
return "data_management/labcheckimmune/immuneEntity_update";	
}	
//========================[    감염성원인체조사   ]==================================================================


@RequestMapping(value = "/infectionList", method = RequestMethod.GET)				
public String infectionList(Model model,				
@RequestParam(value="pageNum", defaultValue="1") int pageNum,				
@RequestParam(value="searchOption", defaultValue="none") String searchOption,				
@RequestParam(value="searchValue", defaultValue="none") String searchValue) {				
//Map<String, Object> map = labcheckService.selectFarmListServ(pageNum, searchOption, searchValue);				
//model.addAttribute("farmList", map.get("farmList"));				
//model.addAttribute("totalCount", map.get("totalCount"));				
//model.addAttribute("paging", map.get("paging"));				
//model.addAttribute("searchOption", searchOption);				
//model.addAttribute("searchValue", searchValue);				
return "data_management/labcheckinfection/infection_list";				
	}	

@RequestMapping(value = "/infectionEntityList", method = RequestMethod.GET)		
public String infectionEntityList(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId ) {				
		
 model.addAttribute("farmId", farmId);		 	
return "data_management/labcheckinfection/infectionEntity_list";		
}		


@RequestMapping(value = "/infectionEntityListDetail", method = RequestMethod.GET)		
public String infectionEntityListDetail(Model model,		
@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId , String entity_id,String seqno) {		
 		
model.addAttribute("entity_id", entity_id);				
 model.addAttribute("farmId", farmId);		 		
return "data_management/labcheckinfection/infectionEntity_list_detail";		
}		


@RequestMapping(value = "/infectionEntityInsert", method = RequestMethod.GET)	
public String infectionEntityInsert(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId, String entity_id,String seqno) {	
 
model.addAttribute("farmId", farmId);	
model.addAttribute("entity_id", entity_id);	
return "data_management/labcheckinfection/infectionEntity_insert";	
}	

@RequestMapping(value = "/infectionEntityUpdate", method = RequestMethod.GET)	
public String infectionEntityUpdate(Model model,	
@RequestParam(value="pageNum", defaultValue="1") int pageNum,	
@RequestParam(value="searchOption", defaultValue="none") String searchOption,	
@RequestParam(value="searchValue", defaultValue="none") String searchValue, String farmId,String entity_id,String seqno) {	
model.addAttribute("farmId", farmId);
 
Infection  ListDetail= labcheckService.infectionEntitySelectOneBeforeUpdate(seqno);		
 
model.addAttribute("EntityList", ListDetail);		 
model.addAttribute("entity_id", entity_id);	
model.addAttribute("farmId", farmId);	
return "data_management/labcheckinfection/infectionEntity_update";	
}	


}				
