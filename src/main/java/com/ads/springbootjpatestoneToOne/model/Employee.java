package com.ads.springbootjpatestoneToOne.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Table(name="employeedetails")
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
     
    @Column(name="EmployeeName")
    private String employeeName;
     
    @Column(name="EmployeeCode")
    private String employeeCode;
     
    @Column(name="Designation")
    private String designation;
     
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="addressid")
    private Address address;
}