package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student-api")
public class StudentOperationsController {

	/*@GetMapping("/data")
	public String process(@RequestParam("sno")Integer no,@RequestParam("sname")String name) 
	{
		System.out.println("Student Number ::"+no+"\nStudent Name ::"+name);
		return "welcome";
	}*/
	
	
	/*@GetMapping("/data")
	public String process(@RequestParam Integer sno,@RequestParam String sname) 
	{
		System.out.println("Student Number ::"+sno+"\nStudent Name ::"+sname);
		return "welcome";
	}*/
	
	
	/*@GetMapping("/data")
	public String process(@RequestParam Integer sno,@RequestParam(required=false) String sname) 
	{
		System.out.println("Student Number ::"+sno+"\nStudent Name ::"+sname);
		return "welcome";
	}*/
	
	/*@GetMapping("/data")
	public String process(@RequestParam Integer sno,@RequestParam(defaultValue = "Pavan") String sname) 
	{
		System.out.println("Student Number ::"+sno+"\nStudent Name ::"+sname);
		return "welcome";
	}*/
	
	
	/*@GetMapping("/data")
	public String process(@RequestParam Integer sno,@RequestParam String sname,
			@RequestParam(name="sadd")String addrs[],
			@RequestParam(name="sadd")List<String> addrsList,
			@RequestParam(name="sadd")Set<String> addrsSet) 
	{
		System.out.println("Student Number ::"+sno+"\nStudent Name ::"+sname);
		System.out.println(Arrays.toString(addrs));
		System.out.println(addrsList);
		System.out.println(addrsSet);
		return "welcome";
	}*/
	
	@GetMapping("/data")
	public String process(@RequestParam Integer sno,@RequestParam String sname,
			@RequestParam(name="sadd")String addrs) 
	{
		System.out.println("Student Number ::"+sno+"\nStudent Name ::"+sname);
		System.out.println(addrs);
		return "welcome";
	}
}
