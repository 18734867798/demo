package com.example.service;

import com.example.dao.PeopleMapper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by think on 2017/8/26.
 */
@Service
public class PoepleServiceImpl implements PeopleService{
    @Autowired
    private PeopleMapper peopleMapper;
    public PageInfo findAll(){
     return null;
    }
}
