package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Entity;
import com.kis.rda.farm.domain.EntityList;
 
import com.kis.rda.farm.domain.Farm;		
 
		
@Repository		
public class EntityDao {		
		
@Autowired		
private SqlSessionTemplate sqlSession;		
		
		
	public int selectEntityCount(Map<String, Object> map){	
		return sqlSession.selectOne("EntityDao.selectFarmCount", map);
	}	
public List<Farm> selectEntityList(Map<String, Object> map){		
	return sqlSession.selectList("EntityDao.selectFarmList", map);	
	}
public List<Entity> ajaxentityEntityList(String  farm_Id) {
	System.out.println("===================farmId=의 맵값============="+ farm_Id);		
	return sqlSession.selectList("EntityDao.ajaxentityEntityList", farm_Id);	
}	
public String entityEntityUpdateSelectOne(String farmId) {			
	
	return sqlSession.selectOne("EntityDao.entityEntityUpdateSelectOne",farmId);		
}			
public int ajaxentityEntityUpdatetDo(Entity entityUpdate) {			
			
return sqlSession.update("EntityDao.ajaxentityEntityUpdatetDo",entityUpdate);			
}			
public int ajaxentityEntityDeleteDo(Entity entityUpdate) {			
	// TODO Auto-generated method stub		
return sqlSession.delete("EntityDao.ajaxentityEntityDeleteDo",entityUpdate);			
}			
public int ajaxentityEntityInsertDo(EntityList environment) {			
	// TODO Auto-generated method stub		
return sqlSession.insert("EntityDao.ajaxentityEntityInsertDo",environment);			
}
public Entity ajaxenvEntitySelectOneBeforUpdate(String entity_id) {
	// TODO Auto-generated method stub
	return sqlSession.selectOne("EntityDao.ajaxenvEntitySelectOneBeforUpdate",entity_id);	
}
 
 			
			


}		
		
		
		
		
		
		
 
		
