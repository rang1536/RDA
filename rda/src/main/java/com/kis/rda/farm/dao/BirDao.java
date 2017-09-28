package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Bir;
import com.kis.rda.common.domain.Environment;
 
import com.kis.rda.farm.domain.EntityList;
import com.kis.rda.farm.domain.Farm;		
import com.kis.rda.farm.domain.NewFarm;		
		
@Repository		
public class BirDao {		
		
@Autowired		
private SqlSessionTemplate sqlSession;		
				
//	public int selectBirCount(Map<String, Object> map){	
//		return sqlSession.selectOne("BirDao.selectFarmCount", map);
//	}	
//public List<Farm> selectBirList(Map<String, Object> map){		
//	return sqlSession.selectList("BirDao.selectFarmList", map);	
//	}	
//public List<Farm> selectEnvList(Map<String, Object> map){		
//return sqlSession.selectList("BirDao.selectFarmList", map);		
//}		
//public List<Environment> ajaxbirEntityList(Map<String, Object> map) {			
//return sqlSession.selectList("BirDao.ajaxbirEntityList", map);		
//}		
public Bir birEntityUpdateSelectOne(String seqno) {	
	return sqlSession.selectOne("BirDao.birEntityUpdateSelectOne",seqno);	
}		
	
public int ajaxbirEntityDeleteDo(String seqno) {	
return sqlSession.delete("BirDao.ajaxbirEntityDeleteDo",seqno);		
}		

public int ajaxbirEntityInsertDo(Bir entityInsert) {
	return sqlSession.insert("BirDao.ajaxbirEntityInsertDo",entityInsert);		
}
//public Map<String, Object> ajaxenvEntitySelectOneBeforUpdate(String entity_id) {
//	return sqlSession.selectOne("BirDao.ajaxenvEntitySelectOneBeforUpdate",entity_id);	
//}
public int ajaxbirEntityUpdatetDo(Bir entityUpdate) {
	return sqlSession.update("BirDao.ajaxbirEntityUpdatetDo",entityUpdate);		
}
//public List<EntityList> ajaxentityEntityList(EntityList entityEntityList) {
//	return sqlSession.selectList("BirDao.ajaxentityEntityList", entityEntityList);	
//}
//public Map<String, Object> birEntitySelectOneBeforeUpdate(String entity_id) {
//	return sqlSession.selectOne("BirDao.birEntitySelectOneBeforeUpdate",entity_id);	
//}
public List<Bir> ajaxbirEntityListDetail(Bir entityDetail) {
	return sqlSession.selectList("BirDao.ajaxbirEntityListDetail", entityDetail);	
}
//public String birEntityInsertSelectOne(String farmId) {
//	return sqlSession.selectOne("BirDao.birEntityInsertSelectOne",farmId);	
//}

}		
		
		
		
		
 