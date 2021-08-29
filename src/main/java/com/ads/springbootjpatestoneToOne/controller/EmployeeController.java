package com.ads.springbootjpatestoneToOne.controller;

import com.ads.springbootjpatestoneToOne.dao.EmployeeDao;
import com.ads.springbootjpatestoneToOne.model.Employee;
import com.ads.springbootjpatestoneToOne.repo.EmployeeRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    final
    EmployeeRepo employeeRepo;

    private final EmployeeDao employeeDao;

    public EmployeeController(EmployeeDao employeeDao, EmployeeRepo employeeRepo) {
        this.employeeDao = employeeDao;
        this.employeeRepo = employeeRepo;
    }

    @PostMapping(consumes = "application/json", produces = "application/json", path = "/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(employeeDao.createEmployee(emp), HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json", produces = "application/json", path = "/employee")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee emp) {
        return new ResponseEntity<>(employeeDao.updateEmployee(emp), HttpStatus.CREATED);
    }

    @DeleteMapping(produces = "application/json", consumes = "text/plain", path = "/employee/{empId}")
    public ResponseEntity<String> deleteEmployee(@PathVariable(value = "empId") Long empId) {
        employeeDao.deleteEmployee(empId);
        return new ResponseEntity<>("Employee with EmployeeId : " + empId + " deleted successfully", HttpStatus.OK);
    }

    @GetMapping(path = "/employee/{empId}", produces = "application/json")
    public ResponseEntity<Employee> getEmployee(@PathVariable(value = "empId") Long empId) {
        return new ResponseEntity<>(employeeDao.getEmployee(empId), HttpStatus.OK);
    }

    @GetMapping(path = "/employees", produces = "application/json")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeDao.getAllEmployee(), HttpStatus.OK);
    }

    @GetMapping("/findEmployeeOrderByEmployeeName")
    public List<Employee> findByEmployeeNameOrderByEmployeeNameDesc(){
        return employeeRepo.findByEmployeeNameOrderByEmployeeNameDesc();
    }

    @GetMapping("/findEmployees")
    public List<Employee> findEmp(){
        return employeeRepo.findEmployees();
    }

    @GetMapping("/findEmplAndAddr")
    public List<Employee> findEmpAndAddr(){
        return employeeRepo.findEmployeeAndAddress();
    }
}