package com.pk.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pk.service.SeasonFinderService;

@Controller
public class SeasonFinderController {
	
	@Autowired
	private SeasonFinderService season;

	@RequestMapping("/")
	public String home() {
		
		// return logical view name (LVN)
		return "home";
	}
	
	@RequestMapping("/season")
	public String findSeason(Map<String, Object> map) {
		//use service
		String session = season.seasonFinder();
		//set attributes
		map.put("sf", session);
		//lvn
		return "season";
	}
	
	
}
