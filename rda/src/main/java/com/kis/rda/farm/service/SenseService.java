package com.kis.rda.farm.service;							
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Sense;
import com.kis.rda.common.domain.TbSensetime;
import com.kis.rda.farm.dao.SenseDao;
import com.kis.rda.farm.domain.Aduino;
import com.kis.rda.farm.domain.Cbcentity;
import com.kis.rda.farm.domain.EntityList;
import com.kis.rda.farm.domain.Farm;							
import com.kis.rda.farm.domain.NewFarm;
import com.kis.rda.farm.domain.TbSenseCount;
import com.kis.rda.farm.domain.TbSenseEntityList;
import com.kis.rda.farm.domain.TbSenseEntityListDetail;
import com.kis.rda.farm.domain.TbsenseStableList;
import com.kis.rda.util.Paging;							
import com.kis.rda.util.UtilPaging;							
							
@Service							
public class SenseService {							
								
	@Autowired							
	private SenseDao senseDao;							
	 
	public Map<String, Object> ajaxsenseEntityList() {
		Map<String, Object> map = new HashMap<String, Object>();		
		List<TbSenseEntityList> ajaxList = senseDao.ajaxsenseEntityList();		
		map.put("ajaxList",ajaxList);		
		return map;
	}
	public Map<String, Object> ajaxsenseStableList() {
		Map<String, Object> map = new HashMap<String, Object>();		
		List<TbsenseStableList> ajaxList = senseDao.ajaxsenseStableList();		
		map.put("ajaxList",ajaxList);		
		return map;
	}
	public Map<String, Object> ajaxsenseEntityListDetail(TbSenseEntityListDetail entityDetail) {
		Map<String, Object> map = new HashMap<String, Object>();		
		System.out.println("목장getSENSENODEID"+ entityDetail.getNODEID());		
		List<TbSenseEntityListDetail> ajaxList = senseDao.ajaxsenseEntityListDetail(entityDetail);		
		map.put("ajaxList",ajaxList);		
		return map;
	}
	public Map<String, Object> ajaxsenseStableListDetail(TbsenseStableList entityDetail) {
		Map<String, Object> map = new HashMap<String, Object>();	
		System.out.println("목장getSENSENODEID"+ entityDetail.getSENSENODEID());		
		List<TbsenseStableList> ajaxList = senseDao.ajaxsenseStableListDetail(entityDetail);		
		map.put("ajaxList",ajaxList);		
		return map;				
	}
	public int ajaxsenseStableEntityInsertDo(Sense entityInsert) {
		 int result = senseDao.ajaxsenseStableEntityInsertDo(entityInsert);		
			return result;		
		}
	
	
	public Map<String, Object> selectchartymd() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> chartymd = senseDao.selectchartymd(map);
		map.put("chartymd", chartymd);
		return map;
	}
	
	public Map<String, Object> selectchartavg() {
		Map<String, Object> map = new HashMap<String, Object>();
	 
		List<String> chartavg = senseDao.selectchartavg(map);
		map.put("chartavg", chartavg);
		return map;
	}
	public Map<String, Object> selectchartcentr() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> chartcentr = senseDao.selectchartcentr(map);
		map.put("chartcentr", chartcentr);
		return map;
	}
	public Map<String, Object> selectupdown() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> chartupdown = senseDao.selectupdown(map);
		map.put("chartupdown", chartupdown);
		return map;
	}
	
	
	
	public Map<String, Object> selectStablechartymd() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> chartymd = senseDao.selectStablechartymd(map);
		map.put("chartymd", chartymd);
		return map;
	}
	 
	public Map<String, Object> selectStablechartavg() {
		Map<String, Object> map = new HashMap<String, Object>();
	 
		List<String> chartavg = senseDao.selectStablechartavg(map);
		map.put("chartavg", chartavg);
		return map;
	}
	public Map<String, Object> selectStablechartavg2() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> chartavg2 = senseDao.selectStablechartavg2(map);
		map.put("chartavg2", chartavg2);
		return map;
	}
	public Map<String, Object> selectStablechartavg3() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<String> chartavg3 = senseDao.selectStablechartavg3(map);
		map.put("chartavg3", chartavg3);
		return map;
	}

	//아두이노
	public List<Aduino> readAduinoSensingServ(){
		return senseDao.selectAduinoSensing();
	}
}						
