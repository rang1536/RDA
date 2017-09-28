package com.kis.rda.farm.controller;				
				
import java.util.Map;				
				
import org.springframework.beans.factory.annotation.Autowired;				
			
import org.springframework.ui.Model;				
import org.springframework.web.bind.annotation.RequestMapping;				
import org.springframework.web.bind.annotation.RequestMethod;				
import org.springframework.web.bind.annotation.RequestParam;				
import org.springframework.web.bind.annotation.RestController;


import com.kis.rda.farm.domain.EntityList;
 
 
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.service.EntityService;				
				
@RestController				
public class EntityRestController {				
				
@Autowired				
private EntityService entityService;				
 
@RequestMapping(value = "/ajax/entityEntityList", method = RequestMethod.POST)				
public Map<String,Object> ajaxentityEntityList(Model model,				
	@RequestParam(value="pageNum", defaultValue="1") int pageNum,			
	@RequestParam(value="searchOption", defaultValue="none") String searchOption,			
	@RequestParam(value="searchValue", defaultValue="none") String searchValue,String farm_id) {	

 Map<String, Object> map = entityService.ajaxentityEntityList(farm_id);	  
model.addAttribute("entityEntityList", map.get("entityList"));							
return map;				
}				
@RequestMapping(value = "/ajax/entityEntityInsertDo", method = RequestMethod.POST)		
public int ajaxentityEntityInsertDo(Model model,Farm farm,String farm_Id,EntityList  entityInsert) {		

	String totaldate = entityInsert.getTotalDate();
	entityInsert.setBIRTH(totaldate);
int result = entityService.ajaxentityEntityInsertDo(entityInsert);		
System.out.println(" 객체 입력하기   ");		
		
model.addAttribute("result", result);		
		
return result;		
}		
		
 	
		
//객체 수정하기			
@RequestMapping(value = "/ajax/entityEntityUpdatetDo", method = RequestMethod.POST)		
public int ajaxentityEntityUpdatetDo(Model model,Farm farm,String farm_Id,EntityList  entityUpdate) {		
 
		entityUpdate.setBIRTH(entityUpdate.getTotalDate());
int result = entityService.ajaxentityEntityUpdatetDo(entityUpdate);		
		
model.addAttribute("result", result);		
		
return result;		
}		
//객체삭제하기 envEntityDeleteDo
@RequestMapping(value = "/ajax/entityEntityDeleteDo", method = RequestMethod.POST)
public int ajaxentityEntityDeleteDo(Model model,Farm farm,String farm_Id,EntityList  entityUpdate) {

	System.out.println(" 객체  삭제   "+entityUpdate.getENTITY_ID() );
int result = entityService.ajaxentityEntityDeleteDo(entityUpdate);

model.addAttribute("result", result);

return result;
}


}				
				
				
