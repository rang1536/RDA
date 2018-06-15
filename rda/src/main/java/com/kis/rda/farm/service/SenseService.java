package com.kis.rda.farm.service;							
import java.util.ArrayList;
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Sense;
import com.kis.rda.common.domain.SenseActive;
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
	
	
	public Map<String, Object> selectchartymd(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		List<String> chartymd = senseDao.selectchartymd(map);
		map.put("chartymd", chartymd);
		return map;
	}
	
	public Map<String, Object> selectchartavg(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		List<String> chartavg = senseDao.selectchartavg(map);
		map.put("chartavg", chartavg);
		return map;
	}
	public Map<String, Object> selectchartcentr(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		List<String> chartcentr = senseDao.selectchartcentr(map);
		map.put("chartcentr", chartcentr);
		return map;
	}
	public Map<String, Object> selectupdown(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		List<String> chartupdown = senseDao.selectupdown(map);
		map.put("chartupdown", chartupdown);
		return map;
	}
	
	
	
	public Map<String, Object> selectStablechartymd(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		List<String> chartymd = senseDao.selectStablechartymd(map);
		map.put("chartymd", chartymd);
		return map;
	}
	 
	public Map<String, Object> selectStablechartavg(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		
		List<String> chartavg = senseDao.selectStablechartavg(map);
		map.put("chartavg", chartavg);
		return map;
	}
	public Map<String, Object> selectStablechartavg2(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		
		List<String> chartavg2 = senseDao.selectStablechartavg2(map);
		map.put("chartavg2", chartavg2);
		return map;
	}
	public Map<String, Object> selectStablechartavg3(String nodeId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("nodeId", nodeId);
		
		List<String> chartavg3 = senseDao.selectStablechartavg3(map);
		map.put("chartavg3", chartavg3);
		return map;
	}

	//아두이노
	public List<Aduino> readAduinoSensingServ(){
		return senseDao.selectAduinoSensing();
	}
	
	//날짜목록조회
	public List<String> readDateListServ(){
		List<String> result = senseDao.selectDateList2("201710130001");
		List<String> dateList = new ArrayList<String>();
		
		for(int i=0; i<result.size(); i++) {
			String date = "'"+result.get(i).toString()+"'";
			dateList.add(date);	
		}
		return dateList;
	}
	//개체별 일일활동량 조회
	public List<List<Integer>> readEntityActiveServ(){
		List<Integer> acList = new ArrayList<Integer>(); //개체별 활동량 목록
		List<List<Integer>> list = new ArrayList<List<Integer>>(); // 목록을 담은 목록
		int activeValue =0;
		
		//개체
		String[] nodeId = {"201710130001","201710130002","201710130003","201710130004","201710130005","201710130006","201710130007","201710130008","201710130009","201710130010"};
		/*List<SenseActive> activeList = senseDao.selectEntityActive("201710130001"); //날짜,활동량 조회
		
		for(int j=0; j<activeList.size(); j++) {
			activeValue = activeList.get(j).getActionValue(); //활동량만 추출
			acList.add(activeValue);
		}*/
		
		for(int i=0; i<nodeId.length; i++) {
			List<SenseActive> activeList = senseDao.selectEntityActive(nodeId[i]); //날짜,활동량 조회
			
			acList = new ArrayList<Integer>();
			for(int j=0; j<activeList.size(); j++) {
				activeValue = activeList.get(j).getActionValue(); //활동량만 추출
				acList.add(activeValue);
			}
			list.add(acList);
		}
		return list;
	}
	
	//현황 > 개체별 일일활동량 카운트 조회
	public List<Map<String, Object>> readEntityActiveCountServ(){
		List<String> dateList = new ArrayList<String>();
		Map<String, Object> map = null;
		List<Map<String, Object>> ajaxList = new ArrayList<Map<String, Object>>();
		List<Integer> cow1,cow2,cow3,cow4,cow5,cow6,cow7,cow8,cow9,cow10;
		//개체
		cow1 = senseDao.selectEntityActiveCount("201710130001");
		cow2 = senseDao.selectEntityActiveCount("201710130002");
		cow3 = senseDao.selectEntityActiveCount("201710130003");
		cow4 = senseDao.selectEntityActiveCount("201710130004");
		cow5 = senseDao.selectEntityActiveCount("201710130005");
		cow6 = senseDao.selectEntityActiveCount("201710130006");
		cow7 = senseDao.selectEntityActiveCount("201710130007");
		cow8 = senseDao.selectEntityActiveCount("201710130008");
		cow9 = senseDao.selectEntityActiveCount("201710130009");
		cow10 = senseDao.selectEntityActiveCount("201710130010");
		
		dateList = senseDao.selectDateList("201710130001");
		
		for(int i=0; i<dateList.size(); i++) {
			map = new HashMap<String, Object>();
			map.put("day", dateList.get(i));
			map.put("cow1", cow1.get(i));
			map.put("cow2", cow2.get(i));
			map.put("cow3", cow3.get(i));
			map.put("cow4", cow4.get(i));
			map.put("cow5", cow5.get(i));
			map.put("cow6", cow6.get(i));
			map.put("cow7", cow7.get(i));
			map.put("cow8", cow8.get(i));
			map.put("cow9", cow9.get(i));
			map.put("cow10", cow10.get(i));
			ajaxList.add(map);
		}
		
		System.out.println(ajaxList);
		/*System.out.println("날짜목록 : "+dateList);
		System.out.println("카운트 목록 : "+activeCountList);*/
		
		/*map.put("dateList", dateList);
		map.put("activeCountList", activeCountList);*/
		
		return ajaxList;
	}
	
	public Map<String, Object> getDistanceServ(String date, String start, String end){
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("start", "20180528143000"); //시작일(yyyymmddhhmmss)
		params.put("end",  "20180530175500"); //종료일(yyyymmddhhmmss)
		
		List<Aduino> list = senseDao.selectSensorDataByTime(params); //시작~종료사이에 센싱데이터 조회
		System.out.println("list 확인 : "+list);
		
		float speedx = 0.0f, speedy = 0.0f, speedz = 0.0f; //각 축값을 담을 변수 및 배열 선언
		List<Float> speedXList = new ArrayList<Float>();
		List<Float> speedYList = new ArrayList<Float>();
		List<Float> speedZList = new ArrayList<Float>();
		List<Float> ditanceXList = new ArrayList<Float>();
		List<Float> ditanceYList = new ArrayList<Float>();
		List<Float> ditanceZList = new ArrayList<Float>();
		List<String> dateList = new ArrayList<String>();
		int time = 0;
		float ditancex = 0.0f, ditancey = 0.0f, ditancez = 0.0f;
		float xTDis = 0.0f, yTDis = 0.0f, zTDis = 0.0f; //거리 총합을 할당할 변수 선언
		for(int i=0; i<list.size(); i++) { //속도, 이동거리구하기 
			if(list.get(i).getgAx() < 0) { //방향의 진퇴를 알고자 하는 부분이 아니므로 음수는 양수로 만듬
				speedx = (list.get(i).getgAx()*(-1));
			}else {
				speedx = (list.get(i).getgAx());
			}
			
			if(list.get(i).getgAy() < 0) {
				speedy += (list.get(i).getgAy()*(-1));
			}else {
				speedy += (list.get(i).getgAy());
			}
			
			if(list.get(i).getgAz() < 0) {
				speedz += (list.get(i).getgAz()*(-1));
			}else {
				speedz += (list.get(i).getgAz());
			}
			
			if(i==0) { //x 0.17은 센서가 멈춰있을때 15초당 기본적으로 측정되는 가속도임
				//System.out.println("x 속도 : "+(speedx/15)+"m/s");
				ditancex += (speedx-0.17)*15;
				ditancey += (speedy-0.12)*15;
				ditancez += (speedz-0.87)*15;
			}else if(i>0) {
				//System.out.println("x 속도 : "+((speedx-speedXList.get(i-1))/15)+"m/s");
				ditancex = (float) (speedx-0.17)*15;
				/*ditancex += (speedx-speedXList.get(i-1)-0.17);*/
				ditancey = (float)(speedy-0.12)*15;
				ditancez = (float)(speedz-0.87)*15;
				//System.out.println(i+" 번째 x 이동거리 : "+ ditancex);
			}
			xTDis += ditancex;
			yTDis += ditancey;
			zTDis += ditancez;
			if(ditancex < 0) ditancex = ditancex*(-1); //이동거리가 음수일 경우 양수로 변환
			// m/s2
			speedXList.add(speedx);
			speedYList.add(speedy);
			speedZList.add(speedz);
			
			ditanceXList.add(ditancex);
			ditanceYList.add(ditancey);
			ditanceZList.add(ditancez);
			
			dateList.add(list.get(i).getgDate());
			if(i==(list.size()-1)) {
				System.out.println("총 x축 이동거리 : "+xTDis);
				System.out.println("총 y축 이동거리 : "+yTDis);
				System.out.println("총 z축 이동거리 : "+zTDis);
				map.put("x", ditancex);
				map.put("y", ditancey);
				map.put("z", ditancez);
			}
			
			/*if(i > 0) {
				time +=15;
				System.out.println(i+"번째 까지 연산 x평균 속도 : "+speedx/15+"m/s");
			}
			if(list.get(i).getgAx() < 0) {
				speedx += (list.get(i).getgAx()*(-1)/10);
			}else {
				speedx += (list.get(i).getgAx()/10);
			}
			
			if(list.get(i).getgAy() < 0) {
				speedy += (list.get(i).getgAy()*(-1)/10);
			}else {
				speedy += (list.get(i).getgAy()/10);
			}
			
			if(list.get(i).getgAz() < 0) {
				speedz += (list.get(i).getgAz()*(-1)/10);
			}else {
				speedz += (list.get(i).getgAz()/10);
			}*/		
		}
		map.put("xList", speedXList); //15초 구간별 가속도
		map.put("xList2", ditanceXList); //15초 구간별 이동거리 세팅
		map.put("yList", speedYList);
		map.put("yList2", ditanceYList);
		map.put("zList", speedZList);
		map.put("zList2", ditanceZList);
		map.put("dateList", dateList);
		
		/*for(int i=0; i<speedXList.size(); i++) {
			
			ditancex += speedXList.get(i);
			ditancey += speedYList.get(i);
			ditancez += speedZList.get(i);
			
			ditanceXList.add(ditancex);
			ditanceYList.add(ditancey);
			ditanceZList.add(ditancez);
			
			if(i == speedXList.size()-1) {
				System.out.println("총 x축 이동거리 : "+ditancex);
				System.out.println("총 y축 이동거리 : "+ditancey);
				System.out.println("총 z축 이동거리 : "+ditancez);
				map.put("x", ditancex);
				map.put("y", ditancey);
				map.put("z", ditancez);
			}
		}*/
		
		
		map.put("list", list);
		return map;
	}
	
	//================================================
	

}						
