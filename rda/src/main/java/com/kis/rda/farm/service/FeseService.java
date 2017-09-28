package com.kis.rda.farm.service;							
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Feces;
import com.kis.rda.common.domain.Fecesimg;
import com.kis.rda.farm.dao.FeseDao;							
import com.kis.rda.farm.domain.Farm;
 
@Service							
public class FeseService {							
							
							
							
@Autowired							
private FeseDao feseDao;							
 
public int ajaxfeseEntityInsertDo(Feces entityInsert) {
	 int result = feseDao.ajaxfeseEntityInsertDo(entityInsert);		
	return result;	
}
public int ajaxfeseEntityInsertImgDo(Fecesimg entityImgInsert) {
	 int result = feseDao.ajaxfeseEntityInsertImgDo(entityImgInsert);		
		return result;	
}
public Map<String, Object> ajaxfeseEntityImgList(String entity_id) {
	Map<String, Object> map = new HashMap<String, Object>();	
	List<Farm> entityList = feseDao.ajaxfeseEntityImgList(entity_id);	
	
	map.put("entityList",entityList);		
	return map;	
}					
}							
							
