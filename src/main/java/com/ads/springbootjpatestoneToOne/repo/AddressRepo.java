package com.ads.springbootjpatestoneToOne.repo;

import com.ads.springbootjpatestoneToOne.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {
}
