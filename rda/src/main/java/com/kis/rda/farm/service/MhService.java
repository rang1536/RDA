package com.kis.rda.farm.service;							
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Medicalhistory;
import com.kis.rda.farm.dao.MhDao;
  		
							
@Service							
public class MhService {							
							
							
							
@Autowired							
private MhDao mhDao;							
//public Map<String, Object> selectFarmListServ(int pageNum, String searchOption, String searchValue){							
//	Map<String, Object> map = new HashMap<String, Object>();						
//	map.put("searchOption", searchOption);						
//	map.put("searchValue", searchValue);						
//	int totalCount = mhDao.selectMhCount(map);						
//	UtilPaging utilPaging = new UtilPaging();						
//	Paging paging = utilPaging.pagingMethod(pageNum, totalCount);						
//	map.put("beginRow", paging.getBeginRow());						
//	map.put("endRow", paging.getEndRow());						
//	List<Farm> mhList = mhDao.selectMhList(map);						
//	map.put("mhList",mhList);						
//	map.put("totalCount", totalCount);						
//	map.put("paging", paging);						
//	return map;						
//}
public Map<String, Object> ajaxmhEntityListDetail(Medicalhistory entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<Medicalhistory> ajaxentityDetail = mhDao.ajaxmhEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityDetail);		
	return map;
}
public String mhEntityInsertSelectOne(String farmId) {
	String farmNm =    mhDao.mhEntityInsertSelectOne(farmId);		
	return farmNm;		
}
public int ajaxmhEntityInsertDo(Medicalhistory entityInsert) {
	 int result = mhDao.ajaxmhEntityInsertDo(entityInsert);		
	return result;	
}
public Medicalhistory mhEntitySelectOneBeforeUpdate(String entity_id) {
	
	return mhDao.mhEntitySelectOneBeforeUpdate(entity_id);	 
	}
public int ajaxmhEntityUpdatetDo(Medicalhistory entityUpdate) {
	 int result = mhDao.ajaxmhEntityUpdatetDo(entityUpdate);		
		return result;		
}
public int ajaxmhEntityDeleteDo(String seqno) {
	 int result = mhDao.ajaxmhEntityDeleteDo(seqno);		
	return result;		
}

				
}							
							
