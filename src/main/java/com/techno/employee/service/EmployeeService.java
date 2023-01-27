package com.techno.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techno.employee.entity.Employee;
import com.techno.employee.exception.EmployeeNotFoundException;
import com.techno.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository repo;
	
	public String addEmployee(Employee employee) {
		
		repo.save(employee);
		System.out.println("Employee added successfully");
		System.out.println("Employee added successfully");
		
		return "Employee saved successfully";
	}

	public List<Employee> getEmployee() {
		
		return repo.findAll();
	}

	public String updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		repo.save(employee);
		return "Employee updated successfully";
	}

	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		try {
		repo.deleteById(id);
		return "Employee deletd successfully";
		}catch (Exception e) {
			// TODO: handle exception
			throw new EmployeeNotFoundException();
		}
	}

	public List<Employee> getEmployeeByCity(String city) {
		// TODO Auto-generated method stub
		
		return repo.findByCity(city);
	}
	
	

}
