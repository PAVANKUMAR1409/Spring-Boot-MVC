package com.pk.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pk.service.SeasonFinderService;

@Controller
public class SeasonFinderController {
	
	@Autowired
	private SeasonFinderService season;

	//@RequestMapping("/")
	@RequestMapping
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
	
	/*@RequestMapping("/report")
	public String showSeason(Map<String, Object> map) {
		
		System.out.println("SeasonFinderController.showSeason()");
		//use service
		String session = season.seasonFinder();
		//set attributes
		map.put("sf", session);
		//lvn
		return "show_result";
	}*/
	
	/*@RequestMapping("/REPORT")
	public String showSeason1(Map<String, Object> map) {
		System.out.println("SeasonFinderController.showSeason1()");
		//use service
		String session = season.seasonFinder();
		//set attributes
		map.put("sf", session);
		//lvn
		return "show_result1";
	}*/
	
	/*@RequestMapping({"/report","/report1","/REPORT"})   // default is GET mode
	public String showSeason(Map<String, Object> map) {
		
		System.out.println("SeasonFinderController.showSeason()");
		//use service
		String session = season.seasonFinder();
		//set attributes
		map.put("sf", session);
		//lvn
		return "show_result";
	}*/
	
	//@RequestMapping(value="/report", method=RequestMethod.GET) 
	@GetMapping("/report")
	public String showSeason1(Map<String, Object> map) {
		
		System.out.println("SeasonFinderController.showSeason1()");
		//use service
		String session = season.seasonFinder();
		//set attributes
		map.put("sf", session);
		//lvn
		return "show_result";
	}
	
	//@RequestMapping(value="/report", method=RequestMethod.POST)  
	@PostMapping("/report")
	public String showSeason2(Map<String, Object> map) {
		
		System.out.println("SeasonFinderController.showSeason2()");
		//use service
		String session = season.seasonFinder();
		//set attributes
		map.put("sf", session);
		//lvn
		return "show_result1";
	}
	
	
}
