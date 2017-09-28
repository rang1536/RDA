package com.kis.rda.farm.service;							
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Bir;
import com.kis.rda.farm.dao.BirDao;
 
import com.kis.rda.farm.domain.EntityList;
import com.kis.rda.farm.domain.Farm;							
import com.kis.rda.farm.domain.NewFarm;							
import com.kis.rda.util.Paging;							
import com.kis.rda.util.UtilPaging;							
							
@Service							
public class BirService {							
							
							
							
@Autowired							
private BirDao birDao;							
  
public Bir birEntityUpdateSelectOne(String seqno) {			
	Map<String, Object> map = new HashMap<String, Object>();		
	//map.put("farmId", seqno);		
	Bir farmNm =    birDao.birEntityUpdateSelectOne(seqno);		
	return farmNm;		
}			
			
 
public int ajaxbirEntityInsertDo(Bir entityInsert) {
 	 int result = birDao.ajaxbirEntityInsertDo(entityInsert);		
 	return result;	
}		
			
 
public int ajaxbirEntityUpdatetDo(Bir entityUpdate) {
	 int result = birDao.ajaxbirEntityUpdatetDo(entityUpdate);		
	return result;		
}



public int ajaxbirEntityDeleteDo(String string) {
	 int result = birDao.ajaxbirEntityDeleteDo(string);		
 	return result;		
}



public Map<String, Object> ajaxbirEntityListDetail(Bir entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<Bir> ajaxentityEntityList = birDao.ajaxbirEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityEntityList);		
	return map;
}
 

}							
							
							
							
