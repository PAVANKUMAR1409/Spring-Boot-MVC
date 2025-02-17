package com.nt.service;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {

	public Iterable<Employee> getAllEmployee();
	
	public String registerEmployee(Employee emp);

	public String removeEmployee(Integer no);
	
	public Employee getEmployeeById(Integer no);
	
	public String updateEmployee(Employee emp);
}
