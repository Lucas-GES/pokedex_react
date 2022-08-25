package com.luck.pokedex.controllers;

import com.luck.pokedex.dto.RegionDTO;
import com.luck.pokedex.services.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/region")
public class RegionController {

    @Autowired
    private RegionService service;

    @GetMapping
    public List<RegionDTO> findAll(){
        return service.findAll();
    }

}
