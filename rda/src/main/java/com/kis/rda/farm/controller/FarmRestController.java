package com.kis.rda.farm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
}
