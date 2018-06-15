package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Sense;
import com.kis.rda.common.domain.SenseActive;
import com.kis.rda.common.domain.TbSensetime;
import com.kis.rda.farm.domain.Aduino;
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
	
	// 날짜 목록(2017)
	public List<String> selectStablechartymd(Map<String, Object> map) {
		return sqlSession.selectList("SenseDao.selectStablechartymd", map);
	}
	
	// 축사별 온도평균
	public List<String> selectStablechartavg(Map<String, Object> map) {
		return sqlSession.selectList("SenseDao.selectStablechartavg", map);
	}
	
	// 축사별 이산화탄소평균
	public List<String> selectStablechartavg2(Map<String, Object> map) {
		return sqlSession.selectList("SenseDao.selectStablechartavg2", map);
	}
	
	//축사별 HUM평균
	public List<String> selectStablechartavg3(Map<String, Object> map) {
		return sqlSession.selectList("SenseDao.selectStablechartavg3", map);
	}
	 
	//아두이노
	public List<Aduino> selectAduinoSensing(){
		return sqlSession.selectList("SenseDao.selectAduinoSensing");
	}

	//개체목록
	public List<String> selectEntityIdList(){
		return sqlSession.selectList("SenseDao.selectEntityIdList");
	}
	//개체별 일일활동량 데이터 조회
	public List<SenseActive> selectEntityActive(String nodeId){
		return sqlSession.selectList("SenseDao.selectEntityActive", nodeId);
	}
	
	public List<String> selectDateList(String nodeId){
		return sqlSession.selectList("SenseDao.selectDateList",nodeId);
	}
	
	public List<String> selectDateList2(String nodeId){
		return sqlSession.selectList("SenseDao.selectDateList2",nodeId);
	}
	
	//개체별 일일활동량 데이터카운트 조회
	public List<Integer> selectEntityActiveCount(String nodeId){
		return sqlSession.selectList("SenseDao.selectEntityActiveCount",nodeId);
	}
	
	public List<Aduino> selectSensorDataByTime(Map<String, Object> params){
		return sqlSession.selectList("SenseDao.selectSensorDataByTime", params);
	}
}		
		
		
