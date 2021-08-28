package com.ads.springbootjpatestoneToOne.service;

import com.ads.springbootjpatestoneToOne.dto.EmployeeAddressDto;
import com.ads.springbootjpatestoneToOne.model.Address;
import com.ads.springbootjpatestoneToOne.model.Employee;
import com.ads.springbootjpatestoneToOne.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MapEmplAdds {

    final
    EmployeeRepo employeeRepo;

    public MapEmplAdds(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public List<EmployeeAddressDto> findEmplAddsDto(){
        return employeeRepo.findAll()
                .stream()
                .map(this::conversionEmplAdds)
                .collect(Collectors.toList());
    }

    public EmployeeAddressDto conversionEmplAdds(Employee employee){
        EmployeeAddressDto employeeAddressDto = new EmployeeAddressDto();
        employeeAddressDto.setEmployeeName(employee.getEmployeeName());
        employeeAddressDto.setDesignation(employee.getDesignation());
        Address address = employee.getAddress();
        employeeAddressDto.setCity(address.getCity());
        employeeAddressDto.setStreet(address.getStreet());
        return employeeAddressDto;
    }
}
