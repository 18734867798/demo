package com.example.service;

import com.example.dao.CountryMapper;
import com.example.po.Country;
import com.example.po.CountryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by git on 2017/8/18.
 */
@Service
public class CountryServiceImpl implements CountryService{
    @Autowired
    private CountryMapper countryMapper;
    @Override
    public List<Country> findAll() {
        CountryExample countryExample=new CountryExample();
        return  countryMapper.selectByExample(countryExample);
    }
}
