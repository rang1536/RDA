package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Medicalhistory;
 	
		
@Repository		
public class MhDao {		
		
@Autowired		
private SqlSessionTemplate sqlSession;		
		
		
//	public int selectMhCount(Map<String, Object> map){	
//		return sqlSession.selectOne("MhDao.selectFarmCount", map);
//	}	
//public List<Farm> selectMhList(Map<String, Object> map){		
//	return sqlSession.selectList("MhDao.selectFarmList", map);	
//	}
public List<Medicalhistory> ajaxmhEntityListDetail(Medicalhistory entityDetail) {
	System.out.println("===================farmId=의 맵값=========== dao수정=="+entityDetail.getENTITY_ID());	
	String birEntityID = entityDetail.getENTITY_ID();
	return sqlSession.selectList("MhDao.ajaxmhEntityListDetail", entityDetail);	
}
public String mhEntityInsertSelectOne(String farmId) {
	System.out.println("===================farmId=의 맵값=====mhEntityInsertSelectOne====== dao수정=="+farmId);	
	return sqlSession.selectOne("MhDao.mhEntityInsertSelectOne",farmId);	
}
public int ajaxmhEntityInsertDo(Medicalhistory entityInsert) {
	return sqlSession.insert("MhDao.ajaxmhEntityInsertDo",entityInsert);		

}
public Medicalhistory mhEntitySelectOneBeforeUpdate(String entity_id) {
	return sqlSession.selectOne("MhDao.mhEntitySelectOneBeforeUpdate",entity_id);	
	}
 
public int ajaxmhEntityUpdatetDo(Medicalhistory entityUpdate) {
	return sqlSession.update("MhDao.ajaxmhEntityUpdatetDo",entityUpdate);	
}
public int ajaxmhEntityDeleteDo(String seqno) {
	return sqlSession.delete("MhDao.ajaxmhEntityDeleteDo",seqno);	 
}
}		
		
		
