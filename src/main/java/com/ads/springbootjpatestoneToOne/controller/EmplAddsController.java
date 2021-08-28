package com.ads.springbootjpatestoneToOne.controller;

import com.ads.springbootjpatestoneToOne.dto.EmployeeAddressDto;
import com.ads.springbootjpatestoneToOne.service.MapEmplAdds;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmplAddsController {

    final
    MapEmplAdds mapEmplAdds;

    public EmplAddsController(MapEmplAdds mapEmplAdds) {
        this.mapEmplAdds = mapEmplAdds;
    }

    @GetMapping("/gets")
    public List<EmployeeAddressDto> findDto(){
        return mapEmplAdds.findEmplAddsDto();
    }
}
