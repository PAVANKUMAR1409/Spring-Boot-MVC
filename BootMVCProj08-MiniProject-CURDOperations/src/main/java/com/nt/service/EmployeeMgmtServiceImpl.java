package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.Employee;
import com.nt.repo.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository empRepo;
	
	@Override
	public Iterable<Employee> getAllEmployee() {
		
		return empRepo.findAll();
	}

	@Override
	public String registerEmployee(Employee emp) {
		int idVal = empRepo.save(emp).getEmpno();
		return "Employee is saved with id value : "+idVal;
	}

	@Override
	public String removeEmployee(Integer no) {
		Optional<Employee> byId = empRepo.findById(no);
		if(byId.isEmpty()) {
			return "Id Not found";
		}else {
			empRepo.deleteById(no);
			return no+" id is deleted";
		}
		
	}

	@Override
	public Employee getEmployeeById(Integer no) {
		Employee emp= empRepo.findById(no).orElseThrow(() -> new IllegalArgumentException());
		return emp;
	}

	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is update with having id value :: "+empRepo.save(emp).getEmpno();
	}

}
