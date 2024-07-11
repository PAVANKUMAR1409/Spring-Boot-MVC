package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.model.Employee;

@Controller
public class DataRenderingController {
	
	//1. PASSING SIMPLE VALUES
	
	/*@GetMapping("/report")
	public String sendData(Map<String,Object> map) {
		
		map.put("name", "Soumya");
		map.put("age", 30);  //simple value will be converted into wrapper objects Integer value
		return "show_report";
	}
	*/
	
	//2. PASSING ARRAYS AND COLLECTS
	/*@GetMapping("/report")
	public String sendData(Map<String,Object> map) {
		
		map.put("favColors", new String[] {"blue","white","black","red","green"});
		map.put("nickNames", List.of("pavan","kanna","bakkulu","bujjulu"));
		map.put("phoneNo", Set.of(9999999L,88888888L,77777777L));
		map.put("idDetails", Map.of("aadharNo",613354173395L,"voterId",123456));
		return "show_report";
	}*/
	
	//3. PASSING MODEL CLASS OBJECT
	/*@GetMapping("/report")
	public String sendData(Map<String,Object> map) {
		Employee emp = new Employee();
		emp.setEno(101);emp.setEname("Pavan");emp.setSalary(50000.0);emp.setVaccinated(true);
		
		map.put("emp", emp);
		return "show_report";
	}*/
	
	//4. PASSING COLLECTION OF MODEL OBJECTS
	@GetMapping("/report")
	public String sendData(Map<String,Object> map) {
		List<Employee> list = List.of(new Employee(101, "Pavan", 60000.0, true),
										new Employee(102,"Surya",25000.0,false),
										new Employee(103, "chani", 45000.0, true));
		
		map.put("empList", list);
		return "show_report";
	}
	

	
}
