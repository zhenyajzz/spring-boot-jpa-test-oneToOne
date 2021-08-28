package com.ads.springbootjpatestoneToOne.dao;

import com.ads.springbootjpatestoneToOne.dto.EmployeeAddressDto;
import com.ads.springbootjpatestoneToOne.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee emp);
    public Employee updateEmployee(Employee emp);
    public Employee getEmployee(Long empId);
    public void deleteEmployee(Long empId);
    public List<Employee> getAllEmployee();
}