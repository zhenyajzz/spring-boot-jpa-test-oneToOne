package com.ads.springbootjpatestoneToOne.service;

import java.util.List;
import java.util.Optional;

import com.ads.springbootjpatestoneToOne.dao.EmployeeDao;
import com.ads.springbootjpatestoneToOne.model.Employee;
import com.ads.springbootjpatestoneToOne.repo.EmployeeRepo;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService implements EmployeeDao {

    private final EmployeeRepo employeeRepository;

    public EmployeeService(EmployeeRepo employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee createEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public Employee updateEmployee(Employee emp) {
        return employeeRepository.save(emp);
    }

    @Override
    public Employee getEmployee(Long empId) {
        Optional<Employee> optionalEmp = employeeRepository.findById(empId);
        if (optionalEmp.isPresent()) {
            return optionalEmp.get();
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }
}