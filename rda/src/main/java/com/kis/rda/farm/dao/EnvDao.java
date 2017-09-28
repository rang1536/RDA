package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Environment;
 
 	
		
@Repository		
public class EnvDao {		
		
@Autowired		
private SqlSessionTemplate sqlSession;		
		
		 
public List<Environment> ajaxenvEntityList(Map<String, Object> map) {
	return sqlSession.selectList("EnvDao.ajaxenvEntityList", map);
}
public Environment envEntityUpdateSelectOne(String seqno) {
		return sqlSession.selectOne("EnvDao.envEntityUpdateSelectOne",seqno);
 	}
public int ajaxenvEntityUpdateDo(Environment environment) { 
	return sqlSession.update("EnvDao.ajaxenvEntityUpdateDo",environment);
}
public int ajaxenvEntityDeleteDo(Environment environment) {	
	return sqlSession.delete("EnvDao.ajaxenvEntityDeleteDo",environment);
}
public int ajaxenvEntityInsertDo(Environment environment) {
		return sqlSession.insert("EnvDao.ajaxenvEntityInsertDo",environment);
}
 
}		
		
		
		
		
		
		
		
		
		
