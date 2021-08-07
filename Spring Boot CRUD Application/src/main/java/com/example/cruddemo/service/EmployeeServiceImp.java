package com.example.cruddemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.cruddemo.dao.EmployeeDAO;
import com.example.cruddemo.entity.Employee;


@Service
public class EmployeeServiceImp implements EmployeeService{
	
	
	private EmployeeDAO theEmployeeRepository;
	 
	@Autowired
	public EmployeeServiceImp(EmployeeDAO theEmployeeRepository) {
	
		this.theEmployeeRepository = theEmployeeRepository;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return theEmployeeRepository.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theid) {
		
		Employee theemployee=null;
		
		 theemployee = theEmployeeRepository.findById(theid);
		
		
		
		
		return theemployee;
	}

	@Override
	@Transactional
	public void save(Employee theemployee) {
		theEmployeeRepository.save(theemployee);
		
	}

	@Override
	@Transactional
	public void deleteById(int theid) {
		theEmployeeRepository.deleteById(theid);
		
	}
	
	
	
	

}
