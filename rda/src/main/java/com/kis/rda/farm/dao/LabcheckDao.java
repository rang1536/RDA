package com.kis.rda.farm.dao;		
		
import java.util.List;		
import java.util.Map;		
		
import org.mybatis.spring.SqlSessionTemplate;		
import org.springframework.beans.factory.annotation.Autowired;		
import org.springframework.stereotype.Repository;

import com.kis.rda.common.domain.Biochemical;
import com.kis.rda.common.domain.Cbc;
import com.kis.rda.common.domain.Immune;
import com.kis.rda.common.domain.Infection;
import com.kis.rda.common.domain.Istat;
import com.kis.rda.common.domain.Phos;
import com.kis.rda.farm.domain.Biochemicalentity;
import com.kis.rda.farm.domain.Cbcentity;
import com.kis.rda.farm.domain.EntityList;
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.domain.Immuneentity;
import com.kis.rda.farm.domain.Infectionentity;
import com.kis.rda.farm.domain.Istatentity;
 
import com.kis.rda.farm.domain.Phosentity;		
		
@Repository		
public class LabcheckDao {		
		
@Autowired		
private SqlSessionTemplate sqlSession;		
		
		
	public int selectLabcheckCount(Map<String, Object> map){	
		return sqlSession.selectOne("LabcheckDao.selectFarmCount", map);
	}	
public List<Farm> selectLabcheckList(Map<String, Object> map){		
	return sqlSession.selectList("LabcheckDao.selectFarmList", map);	
	}
public List<EntityList> ajaxcbcEntityListDetail(Cbc entityDetail) {
 	return sqlSession.selectList("LabcheckDao.ajaxcbcEntityListDetail", entityDetail);	
}
public List<EntityList> ajaxbiochemicalEntityListDetail(Biochemical  entityDetail) {
 	return sqlSession.selectList("LabcheckDao.ajaxbiochemicalEntityListDetail", entityDetail);	
}
public List<EntityList> ajaxphosEntityListDetail(Phos  entityDetail) {
 	return sqlSession.selectList("LabcheckDao.ajaxphosEntityListDetail", entityDetail);	
}
public List<EntityList> ajaxistatEntityListDetail(Istat  entityDetail) {
 	return sqlSession.selectList("LabcheckDao.ajaxistatEntityListDetail", entityDetail);	
}
public List<EntityList> ajaximmuneEntityListDetail(Immune entityDetail) {
	return sqlSession.selectList("LabcheckDao.ajaximmuneEntityListDetail", entityDetail);	
}
public List<EntityList> ajaxinfectionEntityListDetail(Infection  entityDetail) {
		
	
	return sqlSession.selectList("LabcheckDao.ajaxinfectionEntityListDetail", entityDetail);	
}

// 수정전 개체 값가져오는것==============================================================
public Cbc cbcEntitySelectOneBeforeUpdate(String entity_id) {
	
	
	return sqlSession.selectOne("LabcheckDao.cbcEntitySelectOneBeforeUpdate",entity_id);	
}
public Biochemical  biochemicalEntitySelectOneBeforeUpdate(String entity_id) {
	return sqlSession.selectOne("LabcheckDao.biochemicalEntitySelectOneBeforeUpdate",entity_id);	
}
public Phos phosEntitySelectOneBeforeUpdate(String entity_id) {
	return sqlSession.selectOne("LabcheckDao.phosEntitySelectOneBeforeUpdate",entity_id);	
}
public Istat  istatEntitySelectOneBeforeUpdate(String entity_id) {
	return sqlSession.selectOne("LabcheckDao.istatEntitySelectOneBeforeUpdate",entity_id);	
}
public Immune  immuneEntitySelectOneBeforeUpdate(String entity_id) {
	return sqlSession.selectOne("LabcheckDao.immuneEntitySelectOneBeforeUpdate",entity_id);	
}
public Infection infectionEntitySelectOneBeforeUpdate(String entity_id) {
	return sqlSession.selectOne("LabcheckDao.infectionEntitySelectOneBeforeUpdate",entity_id);	
}
//입력 수정 삭제 ========================================================
public int ajaxcbcEntityInsertDo(Cbc  entityInsert) {
 
	return sqlSession.insert("LabcheckDao.ajaxcbcEntityInsertDo",entityInsert);		
}

public int ajaxcbcEntityUpdateDo(Cbc  entityUpdate) {
	
	return sqlSession.update("LabcheckDao.ajaxcbcEntityUpdateDo",entityUpdate);		
}
public int ajaxcbcEntityDeleteDo(Cbc  environment) {
	return sqlSession.delete("LabcheckDao.ajaxcbcEntityDeleteDo",environment);		
	}		
public int ajaxbiochemicalEntityInsertDo(Biochemical  entityInsert) {
	return sqlSession.insert("LabcheckDao.ajaxbiochemicalEntityInsertDo",entityInsert);		
	}
 
public int ajaxbiochemicalEntityUpdateDo(Biochemical  entityUpdate) {
	
	return sqlSession.update("LabcheckDao.ajaxbiochemicalEntityUpdateDo",entityUpdate);		
}
public int ajaxbiochemicalEntityDeleteDo(Biochemical  environment) {
	return sqlSession.delete("LabcheckDao.ajaxbiochemicalEntityDeleteDo",environment);		
	}		
public int ajaxphosEntityInsertDo(Phos  entityInsert) {
	return sqlSession.insert("LabcheckDao.ajaxphosEntityInsertDo",entityInsert);		
	}
 
public int ajaxphosEntityUpdateDo(Phos  entityUpdate) {
	
	return sqlSession.update("LabcheckDao.ajaxphosEntityUpdateDo",entityUpdate);		
}
public int ajaxphosEntityDeleteDo(Phos  environment) {
	return sqlSession.delete("LabcheckDao.ajaxphosEntityDeleteDo",environment);		
	}		
public int ajaxistatEntityInsertDo(Istat  entityInsert) {
	return sqlSession.insert("LabcheckDao.ajaxistatEntityInsertDo",entityInsert);		
	}
 
public int ajaxistatEntityUpdateDo(Istat  entityUpdate) {
	
	return sqlSession.update("LabcheckDao.ajaxistatEntityUpdateDo",entityUpdate);		
}
public int ajaxistatEntityDeleteDo(Istat  environment) {
	return sqlSession.delete("LabcheckDao.ajaxistatEntityDeleteDo",environment);		
	}		
public int ajaximmuneEntityInsertDo(Immune entityInsert) {
	return sqlSession.insert("LabcheckDao.ajaximmuneEntityInsertDo",entityInsert);		
	}
 
public int ajaximmuneEntityUpdateDo(Immune entityUpdate) {
	
	return sqlSession.update("LabcheckDao.ajaximmuneEntityUpdateDo",entityUpdate);		
}
public int ajaximmuneEntityDeleteDo(Immune environment) {
	return sqlSession.delete("LabcheckDao.ajaximmuneEntityDeleteDo",environment);		
	}		
public int ajaxinfectionEntityInsertDo(Infection  entityInsert) {
	return sqlSession.insert("LabcheckDao.ajaxinfectionEntityInsertDo",entityInsert);		
	}
 
public int ajaxinfectionEntityUpdateDo(Infection  entityUpdate) {
	
	return sqlSession.update("LabcheckDao.ajaxinfectionEntityUpdateDo",entityUpdate);		
}
public int ajaxinfectionEntityDeleteDo(Infection  environment) {
	return sqlSession.delete("LabcheckDao.ajaxinfectionEntityDeleteDo",environment);		
	}		
}		
		
		
