package com.example.controller;

import com.example.po.Country;
import com.example.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by git on 2017/8/18.
 */
@RestController
@RequestMapping(value = "/country",method = RequestMethod.GET)
public class CountryController {
    @Autowired
    private CountryService countryService;
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<Country> findAll(){
        return  countryService.findAll();
    }
}
