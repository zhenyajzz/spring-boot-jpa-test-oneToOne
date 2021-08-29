package com.ads.springbootjpatestoneToOne.repo;

import com.ads.springbootjpatestoneToOne.dto.CityCount;
import com.ads.springbootjpatestoneToOne.model.Address;
import com.ads.springbootjpatestoneToOne.model.CityCountJpa;
import com.ads.springbootjpatestoneToOne.model.StreetCountJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address,Long> {

    @Query(value = "SELECT * FROM address GROUP BY doornumber HAVING doornumber > 30",nativeQuery = true)
    List<Address> findAddressOfDoorNumber();

    @Query(value = "SELECT COUNT(*) FROM address WHERE city = ?1 ",nativeQuery = true)
    Integer countCity(String city);

    @Query(value = "SELECT a.city as city, count(*) as citycount FROM Address as a GROUP BY a.city",nativeQuery = true)
    List<CityCount> cityCountSQL();

    @Query(value = "SELECT new com.ads.springbootjpatestoneToOne.model.CityCountJpa(COUNT(a), a.city)  FROM Address as a GROUP BY a.city")
    List<CityCountJpa> cityCountJPQL();

    @Query(value = "SELECT new com.ads.springbootjpatestoneToOne.model.StreetCountJpa(COUNT(a), a.street)FROM Address as a GROUP BY a.street")
    List<StreetCountJpa> streetCountJPQL();

}
