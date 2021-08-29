package com.ads.springbootjpatestoneToOne.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CityCountJpa implements Serializable {

    private Long citycount;

    private String city;
}
