package com.ads.springbootjpatestoneToOne.repo;

import com.ads.springbootjpatestoneToOne.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
