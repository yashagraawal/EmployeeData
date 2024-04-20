package com.test.service;

import java.util.List;

import com.test.model.Employee;

public interface EmpService {
	List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void saveEmployee(Employee employee);

    void deleteEmployee(Long id);
}
