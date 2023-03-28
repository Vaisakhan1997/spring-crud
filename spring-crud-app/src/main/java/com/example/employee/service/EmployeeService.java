package com.example.employee.service;

import java.util.List;

import com.example.employee.model.Employee;

public interface EmployeeService { 
List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(long id);
void deleteEmployee(long id);


}
