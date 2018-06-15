package com.kis.rda.basic.service;							
import java.util.HashMap;							
import java.util.List;							
import java.util.Map;							
							
import org.springframework.beans.factory.annotation.Autowired;							
import org.springframework.stereotype.Service;							
							
import com.kis.rda.basic.dao.BasicDao;
import com.kis.rda.basic.domain.Basic;
import com.kis.rda.common.domain.User;
import com.kis.rda.farm.domain.Farm;							
import com.kis.rda.farm.domain.NewFarm;
import com.kis.rda.farm.domain.TbSenseEntityList;
import com.kis.rda.util.Paging;							
import com.kis.rda.util.UtilPaging;							
							
@Service							
public class BasicService {							
							
							
							
	@Autowired							
	private BasicDao basicDao;	
	
	public Map<String, Object> selectFarmListServ(int pageNum, String searchOption, String searchValue){							
		Map<String, Object> map = new HashMap<String, Object>();						
		map.put("searchOption", searchOption);						
		map.put("searchValue", searchValue);						
		int totalCount = basicDao.selectTemperCount(map);						
		UtilPaging utilPaging = new UtilPaging();						
		Paging paging = utilPaging.pagingMethod(pageNum, totalCount);						
		map.put("beginRow", paging.getBeginRow());						
		map.put("endRow", paging.getEndRow());						
		List<Basic> temperList = basicDao.selectTemperList(map);						
		map.put("temperList",temperList);						
		map.put("totalCount", totalCount);						
		map.put("paging", paging);						
		return map;						
	}
	
	public Map<String, Object> ajaxbasicEntityList(String sensedevtipe) {
		Map<String, Object> map = new HashMap<String, Object>();		
		List<TbSenseEntityList> ajaxList = basicDao.ajaxbasicEntityList(sensedevtipe);		
		map.put("ajaxList",ajaxList);		
		return map;
	}

	//로그인
	public Map<String, Object> loginServ(User user){
		List<User> userList = basicDao.login(user);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		for(int i=0; i< userList.size(); i++) {
			if(user.getUserName().equals(userList.get(i).getUserName())) { //아이디 일치상황
				if(user.getUserPassword().equals(userList.get(i).getUserPassword())) { //비번까지 일치 > 로그인
					resultMap.put("check", "success");
					resultMap.put("userNo", String.valueOf(userList.get(i).getUserNo()));
					
					user= new User();
					user= userList.get(i);
					resultMap.put("user", user);
				}else if(!user.getUserPassword().equals(userList.get(i).getUserPassword())){
					resultMap.put("check", "fail");
					resultMap.put("reason", "password");
				}
			}else if(!user.getUserName().equals(userList.get(i).getUserName())){ //아이디 불일치 상황
				resultMap.put("check", "fail");
				resultMap.put("reason", "userName");
			}
		}
		return resultMap;
	}
}							
