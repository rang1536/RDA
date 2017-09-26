package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Environment;
import com.kis.rda.farm.domain.EnvUpdate;
import com.kis.rda.farm.domain.Farm;		
import com.kis.rda.farm.domain.NewFarm;		
		
@Repository		
public class EnvDao {		
		
@Autowired		
private SqlSessionTemplate sqlSession;		
		
		
	public int selectEnvCount(Map<String, Object> map){	
		return sqlSession.selectOne("EnvDao.selectFarmCount", map);
	}	
public List<Farm> selectEnvList(Map<String, Object> map){	
	System.out.println("=================================");
	return sqlSession.selectList("EnvDao.selectFarmList", map);	
	}
public List<Environment> ajaxenvEntityList(Map<String, Object> map) {

	return sqlSession.selectList("EnvDao.ajaxenvEntityList", map);
}
public Environment envEntityUpdateSelectOne(String seqno) {
	System.out.println(seqno);
		return sqlSession.selectOne("EnvDao.envEntityUpdateSelectOne",seqno);
 	}
public int ajaxenvEntityUpdateDo(Environment environment) {
 
	return sqlSession.update("EnvDao.ajaxenvEntityUpdateDo",environment);
}
public int ajaxenvEntityDeleteDo(EnvUpdate environment) {
	
	return sqlSession.delete("EnvDao.ajaxenvEntityDeleteDo",environment);
}
public int ajaxenvEntityInsertDo(EnvUpdate environment) {

		return sqlSession.insert("EnvDao.ajaxenvEntityInsertDo",environment);
}
 
}		
		
		
		
		
		
		
		
		
		
