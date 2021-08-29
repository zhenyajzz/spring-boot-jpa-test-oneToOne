package com.ads.springbootjpatestoneToOne.dao;

import com.ads.springbootjpatestoneToOne.model.Employee;

import java.util.List;

public interface EmployeeDao {
    public Employee createEmployee(Employee emp);
    public Employee updateEmployee(Employee emp);
    public Employee getEmployee(Long empId);
    public void deleteEmployee(Long empId);
    public List<Employee> getAllEmployee();
}