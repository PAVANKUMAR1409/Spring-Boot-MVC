package com.pk.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderService 
{
	
	public String seasonFinder() {
		//get system date and time
		LocalDate ld= LocalDate.now();
		//get month of the year
		int monthValue = ld.getMonthValue();
		
		//return lvn
		if(monthValue>=6 && monthValue<9)
			return "Rainny season";
		else if(monthValue>=9 && monthValue<12) {
			return "Winter Season";
		}else {
			return "Summer Season";
		}
		
	}
}
