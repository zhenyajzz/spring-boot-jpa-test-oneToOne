package com.ads.springbootjpatestoneToOne.controller;

import com.ads.springbootjpatestoneToOne.model.Address;
import com.ads.springbootjpatestoneToOne.repo.AddressRepo;
import org.springframework.web.bind.annotation.GetMapping;
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
}
