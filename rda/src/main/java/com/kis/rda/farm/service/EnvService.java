package com.kis.rda.farm.service;							
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Environment;
import com.kis.rda.farm.dao.EnvDao;
 
import com.kis.rda.farm.domain.Farm;							
 					
import com.kis.rda.util.Paging;							
import com.kis.rda.util.UtilPaging;							
							
@Service							
public class EnvService {						
							
@Autowired							
private EnvDao envDao;							
 
public Map<String, Object> ajaxenvEntityList(String farmId) {
	Map<String, Object> map = new HashMap<String, Object>();		
	map.put("farmId", farmId);	
	 
	List<Environment> envList = envDao.ajaxenvEntityList(map);	 	 
	map.put("envList",envList);	
	return map;
}

public Environment envEntityUpdateSelectOne(String seqno) {
	Map<String, Object> map = new HashMap<String, Object>();		
	map.put("farmId", seqno);	
	Environment farmNm =     envDao.envEntityUpdateSelectOne(seqno);
	return farmNm;
}

public int ajaxenvEntityUpdateDo(Environment environment) { 
	 int result =  envDao.ajaxenvEntityUpdateDo(environment);
	return result;
}

public int ajaxenvEntityDeleteDo(Environment environment) {
	int result =  envDao.ajaxenvEntityDeleteDo(environment);
	return result;
}

public int ajaxenvEntityInsertDo(Environment environment) {
	int result =  envDao.ajaxenvEntityInsertDo(environment);
	return result;
}
 
}							
							
							
							
							
