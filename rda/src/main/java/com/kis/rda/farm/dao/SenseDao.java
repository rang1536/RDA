package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Sense;
import com.kis.rda.common.domain.TbSensetime;
import com.kis.rda.farm.domain.Cbcentity;
import com.kis.rda.farm.domain.Farm;		
import com.kis.rda.farm.domain.NewFarm;
import com.kis.rda.farm.domain.TbSenseCount;
import com.kis.rda.farm.domain.TbSenseEntityList;
import com.kis.rda.farm.domain.TbSenseEntityListDetail;
import com.kis.rda.farm.domain.TbsenseStableList;		
		
@Repository		
public class SenseDao {		
		
@Autowired		
private SqlSessionTemplate sqlSession;		
		
		
 
 
public List<TbSenseEntityList> ajaxsenseEntityList() {
	return sqlSession.selectList("SenseDao.ajaxsenseEntityList");	
}
public List<TbsenseStableList> ajaxsenseStableList() {
	return sqlSession.selectList("SenseDao.ajaxsenseStableList");	
}
public List<TbSenseEntityListDetail> ajaxsenseEntityListDetail(TbSenseEntityListDetail entityDetail) {
	return sqlSession.selectList("SenseDao.ajaxsenseEntityListDetail", entityDetail);	
}
public List<TbsenseStableList> ajaxsenseStableListDetail(TbsenseStableList entityDetail) {
	return sqlSession.selectList("SenseDao.ajaxsenseStableListDetail", entityDetail);	
}
public int ajaxsenseStableEntityInsertDo(Sense entityInsert) {
	return sqlSession.insert("SenseDao.ajaxsenseStableEntityInsertDo",entityInsert);			
	}
public List<String> selectchartymd(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectchartymd", map);
}
public List<String> selectupdown(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectupdown", map);
}
public List<String> selectchartavg(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectchartavg", map);
}
public List<String> selectchartcentr(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectchartcentr", map);
}


public List<String> selectStablechartymd(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectStablechartymd", map);
}
public List<String> selectStablechartavg(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectStablechartavg", map);
}
public List<String> selectStablechartavg2(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectStablechartavg2", map);
}
public List<String> selectStablechartavg3(Map<String, Object> map) {
	return sqlSession.selectList("SenseDao.selectStablechartavg3", map);
}
 


}		
		
		
