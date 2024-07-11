package com.nt.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;

@Controller
//@RequestMapping("/employee")
public class EmployeeOperationsController {

	@Autowired
	private IEmployeeMgmtService empService;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/emp_report")  //G---->GET
	public String showEmployeeReport(Map<String, Object> map) {
		
		//use service
		Iterable<Employee> itEmps = empService.getAllEmployee();
		//put results in model attribute
		map.put("empsList", itEmps);
		
		//return LVN
		return "show_employee_report";
	}
	
	@GetMapping("/register")  // form launch register
	public String showEmployeeRegisterForm(@ModelAttribute("emp") Employee emp) {
		
		//return LVN
		return "add_employee_form";
	}
	
	/*@PostMapping("/register")  //saving the form values  //P--->POST
	public String getEmployee(@ModelAttribute("emp")Employee emp, Map<String, Object> map) {
		//use service
		String msg= empService.registerEmployee(emp);
		//Iterable<Employee> it= empService.getAllEmployee();
		// keep the result in shared memory
		map.put("msg", msg);
		//map.put("empsList", it);
		//LVN
		return "redirect:emp_report";  //R--->Redirect
	}*/
	
	
	//==================BEST=================================
	@PostMapping("/register")  //saving the form values  //P--->POST
	public String getEmployee(@ModelAttribute("emp")Employee emp, RedirectAttributes attrs) {
		//use service
		String msg= empService.registerEmployee(emp);
		//Iterable<Employee> it= empService.getAllEmployee();
		// keep the result in shared memory
		attrs.addFlashAttribute("msg", msg);
		//map.put("empsList", it);
		//LVN
		return "redirect:emp_report";  //R--->Redirect
	}
	
	/*@PostMapping("/register")  //saving the form values  //P--->POST
	public String getEmployee(@ModelAttribute("emp")Employee emp, HttpSession session) {
		//use service
		String msg= empService.registerEmployee(emp);
		//Iterable<Employee> it= empService.getAllEmployee();
		// keep the result in shared memory
		session.setAttribute("msg", msg);
		//map.put("empsList", it);
		//LVN
		return "redirect:emp_report";  //R--->Redirect
	}*/
	
	@GetMapping("/emp_delete")
	public String deleteEmployee(@RequestParam Integer no, RedirectAttributes attrs) {
		String removeEmployee = empService.removeEmployee(no);
		attrs.addFlashAttribute("msg",removeEmployee);
		// return LVN
		return "redirect:emp_report";
	}
	
	@GetMapping("/emp_edit")
	public String showEditEmployeeForm(@RequestParam("no")Integer no ,@ModelAttribute("emp") Employee emp) {
		
		Employee emp1 = empService.getEmployeeById(no);
		//copy proprties
		BeanUtils.copyProperties(emp1, emp);		
		return "edit_employee_form";
	}
	
	@PostMapping("/emp_edit")
	public String editEmployee(RedirectAttributes attrs, @ModelAttribute("emp") Employee emp) {
		//use service
		String msg= empService.updateEmployee(emp);
		attrs.addFlashAttribute("msg",msg);
		
		//return LVN
		return "redirect:emp_report";
	}
}




