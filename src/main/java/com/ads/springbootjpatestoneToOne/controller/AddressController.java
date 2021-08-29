package com.ads.springbootjpatestoneToOne.controller;

import com.ads.springbootjpatestoneToOne.dto.CityCount;
import com.ads.springbootjpatestoneToOne.model.Address;
import com.ads.springbootjpatestoneToOne.model.CityCountJpa;
import com.ads.springbootjpatestoneToOne.model.StreetCountJpa;
import com.ads.springbootjpatestoneToOne.repo.AddressRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    final
    AddressRepo addressRepo;

    public AddressController(AddressRepo addressRepo) {
        this.addressRepo = addressRepo;
    }

    @GetMapping("/addresses")
    public List<Address> findAddresses(){
        return addressRepo.findAll();
    }

    @GetMapping("/findAddrOfDoorName")
    public List<Address> findAddressOfDoorNumber(){
        return addressRepo.findAddressOfDoorNumber();
    }

    @GetMapping("/findCityByParam/{city}")
    public Integer findCityByParam(@PathVariable String city){
        return addressRepo.countCity(city);
    }

    @GetMapping("/findCitySQL")
    public List<CityCount> findCityCount(){
        return addressRepo.cityCountSQL();
    }

    @GetMapping("/findCityJpql")
    public List<CityCountJpa> findCityJpql(){
        return addressRepo.cityCountJPQL();
    }

    @GetMapping("/findStreetJPQL")
    public List<StreetCountJpa> findStreet(){
        return addressRepo.streetCountJPQL();
    }

    @GetMapping("/findAddAndEmpl")
    public List<Address> find(){
        return addressRepo.findAddressAndEmployees();
    }
}
