package com.kis.rda.farm.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Newfarm;
import com.kis.rda.farm.dao.FarmDao;
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.domain.FarmMap;
import com.kis.rda.farm.domain.NewFarm;
import com.kis.rda.util.GeoCode;
import com.kis.rda.util.Paging;
import com.kis.rda.util.UtilPaging;

@Service
public class FarmService {

	@Autowired
	private FarmDao farmDao;
	
	//목장자료 - 기존목장 LIST
	public Map<String, Object> selectFarmListServ(int pageNum, String searchOption, String searchValue){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchOption", searchOption);
		map.put("searchValue", searchValue);
		int totalCount = farmDao.selectFarmCount(map);
		UtilPaging utilPaging = new UtilPaging();
		Paging paging = utilPaging.pagingMethod(pageNum, totalCount);
		map.put("beginRow", paging.getBeginRow());
		map.put("endRow", paging.getEndRow());
		List<Farm> farmList = farmDao.selectFarmList(map);
//		List<String> farmList2 = farmDao.selectFarmLis2t(map);
//		map.put("farmListString", farmList2);
		map.put("farmList", farmList);
		map.put("totalCount", totalCount);
		map.put("paging", paging);
		return map;
	}
	
	//목장자료 - 기존목장 EXCEL LIST
	public List<Farm> selectFarmExcelServ(){
		return farmDao.selectFarmExcel();
	}
	
	//목장 추가를 위한 ID값 SELECT
	public String selectFarmNewIdServ(){
		String newId = "";
		int id = farmDao.selectFarmNewId();
		String parseId = Integer.toString(id);		
		if(id < 10){
			newId = "00" + parseId;
		}else if(id >= 10 && id <100){
			newId = "0" + parseId;
		}else{
			newId = parseId;
		}
		return newId;
	}
	
	//목장 추가
	public int insertFarmServ(Farm farm) {
		return farmDao.insertFarm(farm);
	}
	
	//목장자료 - 기존 목장 DETAIL
	public Farm selectFarmDetailServ(String farmId) {
		return farmDao.selectFarmDetail(farmId);
	}
	
	//목장자료 - 기존 목장 UPDATE
	public int updateFarmServ(Farm farm) {
		return farmDao.updateFarm(farm);
	}
	
	//목장자료 - 기존 목장 DELETE
	public int deleteFarmServ(String farmId) {
		return farmDao.deleteFarm(farmId);
	}
	
	//목장자료 - 신규목장 LIST
	public Map<String, Object> selectNewFarmListServ(int pageNum, String searchOption, String searchValue){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("searchOption", searchOption);
		map.put("searchValue", searchValue);
		int totalCount = farmDao.selectNewFarmCount(map);
		UtilPaging utilPaging = new UtilPaging();
		Paging paging = utilPaging.pagingMethod(pageNum, totalCount);
		map.put("beginRow", paging.getBeginRow());
		map.put("endRow", paging.getEndRow());
		List<NewFarm> farmList = farmDao.selectNewFarmList(map);
		map.put("farmList", farmList);
		map.put("totalCount", totalCount);
		map.put("paging", paging);
		return map;
	}
	//목장자료 - 신규목장 EXCEL LIST
	public List<NewFarm> selectNewFarmExcelServ(){
		return farmDao.selectNewFarmExcel();
	}

	public int ajaxnewfarmUpdateCtrl(Newfarm farm) {
		return farmDao.ajaxnewfarmUpdateCtrl(farm);
	}

	public int ajaxnewfarmAdd(Newfarm farm) {
		return farmDao.ajaxnewfarmAdd(farm);
	}

	public Newfarm selectnewFarmDetailServ(String farmId) {
		return farmDao.selectnewFarmDetailServ(farmId);
	}

	public int ajaxnewfarmDelete(String farmId) {
		return farmDao.ajaxnewfarmDelete(farmId);
	}
	
	
	public String getFarmDo(int num) {
		String farmDo = null;
		if(num == 1) farmDo="전체";
		else if(num == 2) farmDo="경기";
		else if(num == 3) farmDo="강원";
		else if(num == 4) farmDo="경북";
		else if(num == 5) farmDo="경남";
		else if(num == 6) farmDo="충북";
		else if(num == 7) farmDo="충남";
		else if(num == 8) farmDo="전북";
		else if(num == 9) farmDo="전남";
		else if(num == 10) farmDo="제주";
		
		return farmDo;
	}
	// 구글맵 마킹테스트
	public List<FarmMap> readFarmMapAllServ(String farmDo){
		Map<String, Object> params = new HashMap<String,Object>();
		params.put("startNo", 0);
		params.put("endNo",2600);
		params.put("farmDo", farmDo);
		List<FarmMap> farmList = farmDao.selectFarmMapAll(params);
		GeoCode geoCode = new GeoCode();
		/*String[] coords = geoCode.geoCoding("강원 춘천시 동산면 원창리 451-1");
		System.out.println("강원 춘천시 동산면 원창리 451-1" + ": " + coords[0] + ", " + coords[1]);*/
		
		/*for(int i=0; i<farmList.size(); i++) {
			String[] coords = geoCode.geoCoding(farmList.get(i).getFarmFullAdd());
			if(coords != null) {
				farmList.get(i).setFarmLat(coords[0]);
				farmList.get(i).setFarmLng(coords[1]);
				
				int result = farmDao.updateLatLng(farmList.get(i));
				System.out.println(i+" 번째 수정결과 : "+result);
			}
		}*/
		System.out.println("완료");
		return farmList;
	}
	
	/*GeoCode geoCode = new GeoCode();
	Float[] coords = geoCode.geoCoding("전북 전주시 완산구 평화동1가 386-2");
	System.out.println("전북 전주시 완산구 평화동1가 386-2" + ": " + coords[0] + ", " + coords[1]);*/
}
