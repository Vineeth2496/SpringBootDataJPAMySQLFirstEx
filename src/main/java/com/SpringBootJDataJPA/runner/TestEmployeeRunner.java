package com.SpringBootJDataJPA.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.SpringBootJDataJPA.model.Employee;
import com.SpringBootJDataJPA.repo.EmployeeRepository;
@Component
public class TestEmployeeRunner implements CommandLineRunner {

	@Autowired
	private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.save(new Employee(102, "Margott Robbie", 60000.00));
	}

}
