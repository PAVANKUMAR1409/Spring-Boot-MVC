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
	public String showForm(@ModelAttribute("stud")Student stu) {
		return "student_register";
	}
	
	@PostMapping("register")
	public String registerStudent(@ModelAttribute("stud")Student stu,Map<String,Object> map) {
		
		String msg="";
		if(stu.getAvg()>75)
			msg="First Class with Distinction";
		else if(stu.getAvg()>60)
			msg="First Class";
		else if(stu.getAvg()>50)
			msg="Second Class";
		else if(stu.getAvg()>35)
			msg="Third Class";
		else 
			msg="Fail";
		
		map.put("msg", msg);
		map.put("student", stu);
		
		return "result";
	}
}
