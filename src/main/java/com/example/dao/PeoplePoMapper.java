package com.example.dao;

import com.example.po.People;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by git on 2017/8/28.
 */
@Mapper
public interface PeoplePoMapper {
    public List<People> findByConditionAndPagination();
}
