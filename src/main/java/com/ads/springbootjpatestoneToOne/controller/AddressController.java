package com.ads.springbootjpatestoneToOne.controller;

import com.ads.springbootjpatestoneToOne.model.Address;
import com.ads.springbootjpatestoneToOne.repo.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressRepo addressRepo;

    @GetMapping("/addresses")
    public List<Address> findAddresses(){
        return addressRepo.findAll();
    }
}
