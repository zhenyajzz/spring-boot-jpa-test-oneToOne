package com.ads.springbootjpatestoneToOne.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="address")
@Getter
@Setter
public class Address {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
     
    @Column(name="doornumber")
    private String doorNumber;
     
    @Column(name="street")
    private String street;
     
    @Column(name="city")
    private String city;

}