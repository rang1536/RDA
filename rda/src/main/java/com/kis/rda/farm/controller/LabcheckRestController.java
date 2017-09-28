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

import com.kis.rda.common.domain.Biochemical;
import com.kis.rda.common.domain.Cbc;
import com.kis.rda.common.domain.Immune;
import com.kis.rda.common.domain.Infection;
import com.kis.rda.common.domain.Istat;
import com.kis.rda.common.domain.Phos;

import com.kis.rda.farm.domain.Farm;

import com.kis.rda.farm.service.LabcheckService;				
				
@RestController				
public class LabcheckRestController {				
				
@Autowired				
private LabcheckService labcheckService;				
 

//=================== [  CBC  ] =======================================================================


@RequestMapping(value = "/ajax/cbcEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaxcbcEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String entity_id,String searchValue,Cbc  entityDetail) {		
  
 Map<String, Object> map =labcheckService.ajaxcbcEntityListDetail(entityDetail );		
   
model.addAttribute("entityEntityList", map.get("entityList"));	  
return map;			
}	

// 입력
@RequestMapping(value = "/ajax/cbcEntityInsertDo", method = RequestMethod.POST)		
public int ajaxcbcEntityInsertDo(Model model,Farm farm,String farm_Id,Cbc entityInsert) {		
		
 		
 
	
	entityInsert.setCBC_GATHERDATE(entityInsert.getTotalDate());
	int result = labcheckService.ajaxcbcEntityInsertDo(entityInsert);		
System.out.println(" 객체 입력하기   ");					
return result;		
}		
		
// 수정하기			
@RequestMapping(value = "/ajax/cbcEntityUpdateDo", method = RequestMethod.POST)		
public int ajaxcbcEntityUpdateDo(Model model,Farm farm,String farm_Id,Cbc entityUpdate) {		
					
System.out.println("  수정하기   "+entityUpdate.getSEQNO());		
 	

entityUpdate.setCBC_GATHERDATE(entityUpdate.getTotalDate());
int result = labcheckService.ajaxcbcEntityUpdateDo(entityUpdate);		
		
model.addAttribute("result", result);		
		
return result;		
}		
		
//삭제하기 envEntityDeleteDo		
@RequestMapping(value = "/ajax/cbcEntityDeleteDo", method = RequestMethod.POST)		
public int ajaxcbcEntityDeleteDo(Model model,Farm farm,String farm_Id,Cbc   environment) {		
	System.out.println("   삭제   "+environment.getSEQNO());	
int result = labcheckService.ajaxcbcEntityDeleteDo(environment);		
model.addAttribute("result", result);		
return result;		
}		
		
//========================[  생화학   ]==================================================================

@RequestMapping(value = "/ajax/biochemicalEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaxbiochemicalEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,Biochemical   entityDetail) {		
	String entity_id=entityDetail.getENTITY_ID();		
	System.out.println("목장birEntityListDetail"+ entity_id);	
 Map<String, Object> map =labcheckService.ajaxbiochemicalEntityListDetail(entityDetail );			
	
  			
model.addAttribute("entityEntityList", map.get("entityList"));			
  System.out.println("목장birEntityListDetail"+ entity_id);			
 
return map;			
}	
//입력
@RequestMapping(value = "/ajax/biochemicalEntityInsertDo", method = RequestMethod.POST)		
public int ajaxbiochemicalEntityInsertDo(Model model,Farm farm,String farm_Id,Biochemical   entityInsert) {		

	entityInsert.setBIO_GATHERDATE(entityInsert.getTotalDate());
	int result = labcheckService.ajaxbiochemicalEntityInsertDo(entityInsert);		
System.out.println(" 객체 입력하기   ");					
return result;		
}		
// 수정하기			
@RequestMapping(value = "/ajax/biochemicalEntityUpdateDo", method = RequestMethod.POST)		
public int ajaxbiochemicalEntityUpdateDo(Model model,Farm farm,String farm_Id,Biochemical  entityUpdate) {		
	
entityUpdate.setBIO_GATHERDATE(entityUpdate.getTotalDate());
int result = labcheckService.ajaxbiochemicalEntityUpdateDo(entityUpdate);		
		
model.addAttribute("result", result);				
return result;		
}		
		
//삭제하기 envEntityDeleteDo		
@RequestMapping(value = "/ajax/biochemicalEntityDeleteDo", method = RequestMethod.POST)		
public int ajaxbiochemicalEntityDeleteDo(Model model,Farm farm,String farm_Id,Biochemical  environment) {		
	
int result = labcheckService.ajaxbiochemicalEntityDeleteDo(environment);				
model.addAttribute("result", result);			
return result;		
}		
//========================[  phos   ]==================================================================


@RequestMapping(value = "/ajax/phosEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaxphosEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,Phos   entityDetail) {		
	String entity_id=entityDetail.getENTITY_ID();		
	System.out.println("목장birEntityListDetail"+ entity_id);	
 Map<String, Object> map =labcheckService.ajaxphosEntityListDetail(entityDetail );			
 			
model.addAttribute("entityEntityList", map.get("entityList"));					
return map;			
}	
//입력
@RequestMapping(value = "/ajax/phosEntityInsertDo", method = RequestMethod.POST)		
public int ajaxphosEntityInsertDo(Model model,Farm farm,String farm_Id,Phos  entityInsert) {		

	entityInsert.setPHOS_GATHERDATE(entityInsert.getTotalDate());
	int result = labcheckService.ajaxphosEntityInsertDo(entityInsert);				
return result;		
}		
 
 		

// 수정하기			
@RequestMapping(value = "/ajax/phosEntityUpdateDo", method = RequestMethod.POST)		
public int ajaxphosEntityUpdateDo(Model model,Farm farm,String farm_Id,Phos  entityUpdate) {		

entityUpdate.setPHOS_GATHERDATE(entityUpdate.getTotalDate());
int result = labcheckService.ajaxphosEntityUpdateDo(entityUpdate);				
model.addAttribute("result", result);				
return result;		
}		
		
// 삭제하기 envEntityDeleteDo		
@RequestMapping(value = "/ajax/phosEntityDeleteDo", method = RequestMethod.POST)		
public int ajaxphosEntityDeleteDo(Model model,Farm farm,String farm_Id,Phos  environment) {		
	
int result = labcheckService.ajaxphosEntityDeleteDo(environment);	
model.addAttribute("result", result);				
return result;		
}		

//========================[  iStat   ]==================================================================


@RequestMapping(value = "/ajax/istatEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaxistatEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,Istat  entityDetail) {		
	String entity_id=entityDetail.getENTITY_ID();		

 Map<String, Object> map =labcheckService.ajaxistatEntityListDetail(entityDetail );	  			
model.addAttribute("entityEntityList", map.get("entityList"));				
return map;			
}	
//입력
@RequestMapping(value = "/ajax/istatEntityInsertDo", method = RequestMethod.POST)		
public int ajaxistatEntityInsertDo(Model model,Farm farm,String farm_Id,Istat  entityInsert) {		
	
	entityInsert.setISTAT_GATHERDATE(entityInsert.getTotalDate());
	int result = labcheckService.ajaxistatEntityInsertDo(entityInsert);				
return result;		
}		
// 수정하기			
@RequestMapping(value = "/ajax/istatEntityUpdateDo", method = RequestMethod.POST)		
public int ajaxistatEntityUpdateDo(Model model,Farm farm,String farm_Id,Istat  entityUpdate) {		
	
entityUpdate.setISTAT_GATHERDATE(entityUpdate.getTotalDate());
int result = labcheckService.ajaxistatEntityUpdateDo(entityUpdate);				
model.addAttribute("result", result);				
return result;		
}		
		
//삭제하기 envEntityDeleteDo		
@RequestMapping(value = "/ajax/istatEntityDeleteDo", method = RequestMethod.POST)		
public int ajaxistatEntityDeleteDo(Model model,Farm farm,String farm_Id,Istat  environment) {		
	
int result = labcheckService.ajaxistatEntityDeleteDo(environment);				
model.addAttribute("result", result);				
return result;		
}		
//========================[   면역 및 염증인자   ]==================================================================

@RequestMapping(value = "/ajax/immuneEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaximmuneEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,Immune entityDetail) {		
	String entity_id=entityDetail.getENTITY_ID();		

 Map<String, Object> map =labcheckService.ajaximmuneEntityListDetail(entityDetail );				
model.addAttribute("entityEntityList", map.get("entityList"));			
return map;			
}	
//입력
@RequestMapping(value = "/ajax/immuneEntityInsertDo", method = RequestMethod.POST)		
public int ajaximmuneEntityInsertDo(Model model,Farm farm,String farm_Id,Immune  entityInsert) {		

	entityInsert.setIMMUNE_GATHERDATE(entityInsert.getTotalDate());
	int result = labcheckService.ajaximmuneEntityInsertDo(entityInsert);		
			
return result;		
}		
// 수정하기			
@RequestMapping(value = "/ajax/immuneEntityUpdateDo", method = RequestMethod.POST)		
public int ajaximmuneEntityUpdateDo(Model model,Farm farm,String farm_Id,Immune  entityUpdate) {		

entityUpdate.setIMMUNE_GATHERDATE(entityUpdate.getTotalDate());
int result = labcheckService.ajaximmuneEntityUpdateDo(entityUpdate);				
model.addAttribute("result", result);				
return result;		
}		
		
//삭제하기 envEntityDeleteDo		
@RequestMapping(value = "/ajax/immuneEntityDeleteDo", method = RequestMethod.POST)		
public int ajaximmuneEntityDeleteDo(Model model,Farm farm,String farm_Id,Immune  environment) {		
	
int result = labcheckService.ajaximmuneEntityDeleteDo(environment);			
model.addAttribute("result", result);				
return result;		
}		
//========================[    감염성원인체조사   ]==================================================================

@RequestMapping(value = "/ajax/infectionEntityListDetail", method = RequestMethod.POST)			
public Map<String,Object> ajaxinfectionEntityListDetail(Model model,			
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,		
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,		
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,Infection   entityDetail) {		
	String entity_id=entityDetail.getENTITY_ID();		

 Map<String, Object> map =labcheckService.ajaxinfectionEntityListDetail(entityDetail );			  			
model.addAttribute("entityEntityList", map.get("entityList"));			 		
return map;			
}	
//입력
@RequestMapping(value = "/ajax/infectionEntityInsertDo", method = RequestMethod.POST)		
public int ajaxinfectionEntityInsertDo(Model model,Farm farm,String farm_Id,Infection  entityInsert) {		

	entityInsert.setINFECTION_GATHERDATE(entityInsert.getTotalDate());
	int result = labcheckService.ajaxinfectionEntityInsertDo(entityInsert);		 				
return result;		
}		
// 수정하기			
@RequestMapping(value = "/ajax/infectionEntityUpdateDo", method = RequestMethod.POST)		
public int ajaxinfectionEntityUpdateDo(Model model,Farm farm,String farm_Id,Infection  entityUpdate) {		
  
entityUpdate.setINFECTION_GATHERDATE(entityUpdate.getTotalDate()); 
int result = labcheckService.ajaxinfectionEntityUpdateDo(entityUpdate);			
model.addAttribute("result", result);		
		
return result;		
}		
		
//삭제하기 envEntityDeleteDo		
@RequestMapping(value = "/ajax/infectionEntityDeleteDo", method = RequestMethod.POST)		
public int ajaxinfectionEntityDeleteDo(Model model,Farm farm,String farm_Id,Infection  environment) {		
	
int result = labcheckService.ajaxinfectionEntityDeleteDo(environment);				
model.addAttribute("result", result);				
return result;		
}		
}				
				
				
				
