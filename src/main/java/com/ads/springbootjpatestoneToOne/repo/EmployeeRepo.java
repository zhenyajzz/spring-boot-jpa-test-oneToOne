package com.ads.springbootjpatestoneToOne.repo;

import com.ads.springbootjpatestoneToOne.model.Address;
import com.ads.springbootjpatestoneToOne.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT * FROM employeedetails", nativeQuery = true)
    List<Employee> findEmployees();

    @Query(value = "SELECT * FROM employeedetails AS e ORDER BY e.employee_name desc", nativeQuery = true)
    List<Employee> findByEmployeeNameOrderByEmployeeNameDesc();

    //Need to do
    @Query(value = "SELECT a.id ,a.doornumber ,a.city ,a.street ,e.id ,e.designation ,e.employee_code ,e.employee_name ,e.addressid FROM employeedetails as e RIGHT JOIN address as a ON e.id = a.id",nativeQuery = true)
    List<Employee> findEmployeeAndAddress();
}
