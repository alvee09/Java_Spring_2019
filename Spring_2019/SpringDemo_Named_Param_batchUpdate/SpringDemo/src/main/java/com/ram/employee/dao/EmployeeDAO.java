package com.ram.employee.dao;

import java.util.List;

import com.ram.employee.model.Employee;

public interface EmployeeDAO 
{
	public void batchInsert(List<Employee> employeeList);
}