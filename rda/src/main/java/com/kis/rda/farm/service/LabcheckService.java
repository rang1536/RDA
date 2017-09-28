package com.kis.rda.farm.service;							
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;

import com.kis.rda.common.domain.Biochemical;
import com.kis.rda.common.domain.Cbc;
import com.kis.rda.common.domain.Immune;
import com.kis.rda.common.domain.Infection;
import com.kis.rda.common.domain.Istat;
import com.kis.rda.common.domain.Phos;
import com.kis.rda.farm.dao.LabcheckDao;
import com.kis.rda.farm.domain.Biochemicalentity;
 
import com.kis.rda.farm.domain.Cbcentity;
import com.kis.rda.farm.domain.EntityList;
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.domain.Immuneentity;
import com.kis.rda.farm.domain.Infectionentity;
import com.kis.rda.farm.domain.Istatentity;
 
import com.kis.rda.farm.domain.Phosentity;
import com.kis.rda.util.Paging;							
import com.kis.rda.util.UtilPaging;							
							
@Service							
public class LabcheckService {							
							
							
							
@Autowired							
private LabcheckDao labcheckDao;							
//public Map<String, Object> selectFarmListServ(int pageNum, String searchOption, String searchValue){							
//	Map<String, Object> map = new HashMap<String, Object>();						
//	map.put("searchOption", searchOption);						
//	map.put("searchValue", searchValue);						
//	int totalCount = labcheckDao.selectLabcheckCount(map);						
//	UtilPaging utilPaging = new UtilPaging();						
//	Paging paging = utilPaging.pagingMethod(pageNum, totalCount);						
//	map.put("beginRow", paging.getBeginRow());						
//	map.put("endRow", paging.getEndRow());						
//	List<Farm> labcheckList = labcheckDao.selectLabcheckList(map);						
//	map.put("labcheckList",labcheckList);						
//	map.put("totalCount", totalCount);						
//	map.put("paging", paging);						
//	return map;						
//}
public Map<String, Object> ajaxcbcEntityListDetail(Cbc entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<EntityList> ajaxentityDetail = labcheckDao.ajaxcbcEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityDetail);		
	return map;
}
public Map<String, Object> ajaxbiochemicalEntityListDetail(Biochemical entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<EntityList> ajaxentityDetail = labcheckDao.ajaxbiochemicalEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityDetail);		
	return map;
}
public Map<String, Object> ajaxphosEntityListDetail(Phos  entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<EntityList> ajaxentityDetail = labcheckDao.ajaxphosEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityDetail);		
	return map;
}
public Map<String, Object> ajaxistatEntityListDetail(Istat  entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<EntityList> ajaxentityDetail = labcheckDao.ajaxistatEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityDetail);		
	return map;
}
public Map<String, Object> ajaximmuneEntityListDetail(Immune  entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<EntityList> ajaxentityDetail = labcheckDao.ajaximmuneEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityDetail);		
	return map;
}
public Map<String, Object> ajaxinfectionEntityListDetail(Infection  entityDetail) {
	Map<String, Object> map = new HashMap<String, Object>();		
	List<EntityList> ajaxentityDetail = labcheckDao.ajaxinfectionEntityListDetail(entityDetail);		
	map.put("entityList",ajaxentityDetail);		
	return map;
}
public Cbc  cbcEntitySelectOneBeforeUpdate(String entity_id) {
	return labcheckDao.cbcEntitySelectOneBeforeUpdate(entity_id);	 
	}
public Biochemical  biochemicalEntitySelectOneBeforeUpdate(String entity_id) {
	return labcheckDao.biochemicalEntitySelectOneBeforeUpdate(entity_id);	 
	}
public Phos  phosEntitySelectOneBeforeUpdate(String entity_id) {
	return labcheckDao.phosEntitySelectOneBeforeUpdate(entity_id);	 
	}
public Istat  istatEntitySelectOneBeforeUpdate(String entity_id) {
	return labcheckDao.istatEntitySelectOneBeforeUpdate(entity_id);	 
	}
public Immune  immuneEntitySelectOneBeforeUpdate(String entity_id) {
	return labcheckDao.immuneEntitySelectOneBeforeUpdate(entity_id);	 
	}
public Infection  infectionEntitySelectOneBeforeUpdate(String entity_id) {
	return labcheckDao.infectionEntitySelectOneBeforeUpdate(entity_id);	 
	}
public int ajaxcbcEntityInsertDo(Cbc  entityInsert) {
	 int result = labcheckDao.ajaxcbcEntityInsertDo(entityInsert);		
	return result;	
}		

public int ajaxcbcEntityUpdateDo(Cbc  entityUpdate) {
	 int result = labcheckDao.ajaxcbcEntityUpdateDo(entityUpdate);		
		return result;		
	}
public int ajaxcbcEntityDeleteDo(Cbc  environment) {
	 int result = labcheckDao.ajaxcbcEntityDeleteDo(environment);		
	 	return result;		
	}
public int ajaxbiochemicalEntityInsertDo(Biochemical  entityInsert) {
	 int result = labcheckDao.ajaxbiochemicalEntityInsertDo(entityInsert);		
	return result;	
}		

public int ajaxbiochemicalEntityUpdateDo(Biochemical  entityUpdate) {
	 int result = labcheckDao.ajaxbiochemicalEntityUpdateDo(entityUpdate);		
		return result;		
	}
public int ajaxbiochemicalEntityDeleteDo(Biochemical  environment) {
	 int result = labcheckDao.ajaxbiochemicalEntityDeleteDo(environment);		
	 	return result;		
	}
public int ajaxphosEntityInsertDo(Phos  entityInsert) {
	 int result = labcheckDao.ajaxphosEntityInsertDo(entityInsert);		
	 	return result;	
	}		
		
public int ajaxphosEntityUpdateDo(Phos  entityUpdate) {
	 int result = labcheckDao.ajaxphosEntityUpdateDo(entityUpdate);		
		return result;		
	}
public int ajaxphosEntityDeleteDo(Phos  environment) {
	 int result = labcheckDao.ajaxphosEntityDeleteDo(environment);		
	 	return result;		
	}
public int ajaxistatEntityInsertDo(Istat  entityInsert) {
	 int result = labcheckDao.ajaxistatEntityInsertDo(entityInsert);		
	 	return result;	
	}		
		
public int ajaxistatEntityUpdateDo(Istat  entityUpdate) {
	 int result = labcheckDao.ajaxistatEntityUpdateDo(entityUpdate);		
		return result;		
	}
public int ajaxistatEntityDeleteDo(Istat  environment) {
	 int result = labcheckDao.ajaxistatEntityDeleteDo(environment);		
	 	return result;		
	}
public int ajaximmuneEntityInsertDo(Immune entityInsert) {
	 int result = labcheckDao.ajaximmuneEntityInsertDo(entityInsert);		
	 	return result;	
	}		
		
public int ajaximmuneEntityUpdateDo(Immune entityUpdate) {
	 int result = labcheckDao.ajaximmuneEntityUpdateDo(entityUpdate);		
		return result;		
	}
public int ajaximmuneEntityDeleteDo(Immune environment) {
	 int result = labcheckDao.ajaximmuneEntityDeleteDo(environment);		
	 	return result;		
	}
public int ajaxinfectionEntityInsertDo(Infection  entityInsert) {
	 int result = labcheckDao.ajaxinfectionEntityInsertDo(entityInsert);		
	 	return result;	
	}		
		
public int ajaxinfectionEntityUpdateDo(Infection  entityUpdate) {
	 int result = labcheckDao.ajaxinfectionEntityUpdateDo(entityUpdate);		
		return result;		
	}
public int ajaxinfectionEntityDeleteDo(Infection  environment) {
	 int result = labcheckDao.ajaxinfectionEntityDeleteDo(environment);		
	 	return result;		
	}			
}							
							
							
