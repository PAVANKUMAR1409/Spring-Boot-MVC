package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;


@Controller
public class StudnetController {

	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showForm() {
		return "studnet_register";
	}
	
	@PostMapping("register")
	public String registerStudent(@ModelAttribute("stud")Student stu,Map<String,Object> map) {
		
		System.out.println(stu);
		map.put("student", stu);
		
		return "result";
	}
	
}
