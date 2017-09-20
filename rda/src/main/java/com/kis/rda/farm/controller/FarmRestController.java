package com.kis.rda.farm.controller;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kis.rda.common.domain.Newfarm;
import com.kis.rda.farm.domain.Farm;
import com.kis.rda.farm.service.FarmService;

 



@RestController
public class FarmRestController {
	
	@Autowired
	private FarmService farmService;

	//목장자료 - 기존 목장 추가
	@RequestMapping(value = "/farmAdd", method = RequestMethod.POST)
	public int farmAddCtrl(Farm farm) {
		int result = farmService.insertFarmServ(farm);
		return result;
	}
	
	//목장자료 - 기존 목장 수정
	@RequestMapping(value = "/farmUpdate", method = RequestMethod.POST)
	public int farmUpdateCtrl(Farm farm) {
		int result = farmService.updateFarmServ(farm);
		return result;
	}
	
	//목장자료 - 기존 목장 삭제
	@RequestMapping(value = "/farmDelete", method = RequestMethod.POST)
	public int farmDeleteCtrl(
			@RequestParam(value="farmId") String farmId) {
		int result = farmService.deleteFarmServ(farmId);
		return result;
	}
	 
 	
	//======목장자료 - 기존 목장 LIST
		@RequestMapping(value = "/ajax/farmList", method = RequestMethod.POST)
		public Map<String,Object> ajaxfarmListCtrl(Model model,
				@RequestParam(value="pageNum", defaultValue="1") int pageNum,
				@RequestParam(value="searchOption", defaultValue="none") String searchOption,
				@RequestParam(value="searchValue", defaultValue="none") String searchValue) {
			Map<String, Object> map = farmService.selectFarmListServ(pageNum, searchOption, searchValue);
//			model.addAttribute("farmList", map.get("farmList"));
//			model.addAttribute("totalCount", map.get("totalCount"));
//			model.addAttribute("paging", map.get("paging"));
//			model.addAttribute("searchOption", searchOption);
//			model.addAttribute("searchValue", searchValue);
			
		
		return map;
		}

		//목장자료 - 신규목장 LIST
		@RequestMapping(value = "/ajax/newFarmList", method = RequestMethod.POST)
		public Map<String,Object> ajaxnewFarmListCtrl(Model model,
				@RequestParam(value="cateNum", defaultValue="1") int cateNum,
				@RequestParam(value="pageNum", defaultValue="1") int pageNum,
				@RequestParam(value="searchOption", defaultValue="none") String searchOption,
				@RequestParam(value="searchValue", defaultValue="none") String searchValue) {
			Map<String, Object> map = farmService.selectNewFarmListServ(pageNum, searchOption, searchValue);
//			model.addAttribute("farmList", map.get("farmList"));
//			model.addAttribute("totalCount", map.get("totalCount"));
//			model.addAttribute("paging", map.get("paging"));
//			model.addAttribute("cateNum", cateNum);
//			model.addAttribute("searchOption", searchOption);
//			model.addAttribute("searchValue", searchValue);
			return map;
		}

		//목장자료 - 신규 목장 수정
		@RequestMapping(value = "/ajax/newfarmUpdate", method = RequestMethod.POST)
		public int  ajaxnewfarmUpdateCtrl(Newfarm farm,String jsonfarm) {
			System.out.println(jsonfarm);
			System.out.println(farm.getFARM_ID());
			System.out.println(farm.getNAME());
			 JSONObject json =  new JSONObject(jsonfarm);
			 System.out.println("==json 값===FARM_ID>"+ json.get("FARM_ID"));
			 System.out.println("==json 값===FARM_NAME>"+ json.get("FARM_NAME"));
			 System.out.println("==json 값===ADDRESS>"+ json.get("ADDRESS"));
			 System.out.println("==json 값===HP1>"+ json.get("HP1"));
			 System.out.println("==json 값===HP2>"+ json.get("HP2"));
			 System.out.println("==json 값===HP3>"+ json.get("HP3"));
			 System.out.println("==json 값===PHONE1>"+ json.get("PHONE1"));
			 System.out.println("==json 값===PHONE2>"+ json.get("PHONE2"));
			 System.out.println("==json 값===PHONE3>"+ json.get("PHONE3"));
			 System.out.println("==json 값===EMAIL>"+ json.get("EMAIL"));
			 System.out.println("==json 값===NAME>"+ json.get("NAME"));
			 System.out.println("==json 값===MC>"+ json.get("MC"));
			 System.out.println("==json 값===CMONEY>"+ json.get("CMONEY"));
			 System.out.println("==json 값===CHC>"+ json.get("CHC"));
			 System.out.println("==json 값===CAREER>"+ json.get("CAREER"));
			 System.out.println("==json 값===DIARRHEA>"+ json.get("DIARRHEA"));
			 System.out.println("==json 값===DIARRHEADO>"+ json.get("DIARRHEADO"));
			 System.out.println("==json 값===CHCDIE>"+ json.get("CHCDIE"));
			 System.out.println("==json 값===CHCYN>"+ json.get("CHCYN"));
			 System.out.println("==json 값===KMKC>"+ json.get("KMKC"));
			 System.out.println("==json 값===KMPI>"+ json.get("KMPI"));
			 System.out.println("==json 값===KMMC>"+ json.get("KMMC"));
			 System.out.println("==json 값===KMETC>"+ json.get("KMETC"));
			 System.out.println("==json 값===YEAR>"+ json.get("YEAR"));
			 System.out.println("==json 값===DISINFECTANT>"+ json.get("DISINFECTANT"));
			 System.out.println("==json 값===TEMP>"+ json.get("TEMP"));
			 System.out.println("==json 값===HUMIDITY>"+ json.get("HUMIDITY"));
			 System.out.println("==json 값===ILLUMINANCE>"+ json.get("ILLUMINANCE"));
			 System.out.println("==json 값===WIND>"+ json.get("WIND"));
			 System.out.println("==json 값===JANITOR>"+ json.get("JANITOR"));
			 System.out.println("==json 값===VETERINARIAN>"+ json.get("VETERINARIAN"));
//			 System.out.println("==json 값===INPUTDATE>"+ json.get("INPUTDATE"));
//			 System.out.println("==json 값===UPDATEDATE>"+ json.get("UPDATEDATE"));
//			 System.out.println("==json 값===CU_NUM>"+ json.get("CU_NUM"));
//			 System.out.println("==json 값===SEQNO>"+ json.get("SEQNO"));

			 System.out.println("==json 값===ADDRESS1>"+ json.get("ADDRESS1"));
			 System.out.println("==json 값===ADDRESS2>"+ json.get("ADDRESS2"));
			 System.out.println("==json 값===ADDRESS3>"+ json.get("ADDRESS3"));


			 farm.setFARM_ID( (String) json.get("FARM_ID"));
			 farm.setFARM_NAME( (String) json.get("FARM_NAME"));
			 farm.setADDRESS( (String) json.get("ADDRESS"));
			 farm.setHP1( (String) json.get("HP1"));
			 farm.setHP2( (String) json.get("HP2"));
			 farm.setHP3( (String) json.get("HP3"));
			 farm.setPHONE1( (String) json.get("PHONE1"));
			 farm.setPHONE2( (String) json.get("PHONE2"));
			 farm.setPHONE3( (String) json.get("PHONE3"));
			 farm.setEMAIL( (String) json.get("EMAIL"));
			 farm.setNAME( (String) json.get("NAME"));
			 farm.setMC( (String) json.get("MC"));
			 farm.setCMONEY( (String) json.get("CMONEY"));
			 farm.setCHC( (String) json.get("CHC"));
			 farm.setCAREER( (String) json.get("CAREER"));
			 farm.setDIARRHEA( (String) json.get("DIARRHEA"));
			 farm.setDIARRHEADO( (String) json.get("DIARRHEADO"));
			 farm.setCHCDIE( (String) json.get("CHCDIE"));
			 farm.setCHCYN( (String) json.get("CHCYN"));
			 farm.setKMKC( (String) json.get("KMKC"));
			 farm.setKMPI( (String) json.get("KMPI"));
			 farm.setKMMC( (String) json.get("KMMC"));
			 farm.setKMETC( (String) json.get("KMETC"));
			 farm.setYEAR( (String) json.get("YEAR"));
			 farm.setDISINFECTANT( (String) json.get("DISINFECTANT"));
			 farm.setTEMP( (String) json.get("TEMP"));
			 farm.setHUMIDITY( (String) json.get("HUMIDITY"));
			 farm.setILLUMINANCE( (String) json.get("ILLUMINANCE"));
			 farm.setWIND( (String) json.get("WIND"));
			 farm.setJANITOR( (String) json.get("JANITOR"));
			 farm.setVETERINARIAN( (String) json.get("VETERINARIAN"));
//			 farm.setINPUTDATE( (String) json.get("INPUTDATE"));
//			 farm.setUPDATEDATE( (String) json.get("UPDATEDATE"));
//			 farm.setCU_NUM( (String) json.get("CU_NUM"));
//			 farm.setSEQNO( (String) json.get("SEQNO"));
			 farm.setADDRESS1( (String) json.get("ADDRESS1"));
			 farm.setADDRESS2( (String) json.get("ADDRESS2"));
			 farm.setADDRESS3( (String) json.get("ADDRESS3"));


			int result = farmService.ajaxnewfarmUpdateCtrl(farm);
			return result;
		}

		//목장자료 - 신규 목장 추가
		@RequestMapping(value = "/ajax/newFarmAdd", method = RequestMethod.POST)
		public int  ajaxnewfarmAdd(Model model,Newfarm farm) {
			int result = farmService.ajaxnewfarmAdd(farm);
			return result;
		}
		//목장자료 - 신규 목장 삭제
		@RequestMapping(value = "/ajax/newfarmDelete", method = RequestMethod.POST)
		public int newfarmDeleteCtrl(
				@RequestParam(value="farmId") String farmId) {
			int result = farmService.ajaxnewfarmDelete(farmId);
			return result;
		}
}
