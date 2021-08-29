package com.ads.springbootjpatestoneToOne.repo;

import com.ads.springbootjpatestoneToOne.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address,Long> {

    @Query(value = "SELECT * FROM address GROUP BY doornumber HAVING doornumber > 30",nativeQuery = true)
    List<Address> findAddressOfDoorNumber();
}
