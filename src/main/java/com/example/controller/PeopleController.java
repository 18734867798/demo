package com.example.controller;

import com.example.dao.PeopleMapper;
import com.example.po.People;
import com.example.po.PeopleExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.Request;

import java.util.List;

/**
 * Created by think on 2017/8/26.
 */
@RestController
@RequestMapping(value = "/people", method = RequestMethod.GET)
public class PeopleController {

    @Autowired
    private PeopleMapper peopleMapper;

    @RequestMapping(value ="/findAll/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public PageInfo findAll(@PathVariable(name = "pageNum")  String  pageNum, @PathVariable(name = "pageSize" ) String  pageSize){

        //前台默认传来的是字符串，需要转换
        pageNum = pageNum == null ? "1" : pageNum;
        pageSize = pageSize == null ? "3" : pageSize;

        //转换
        Integer num=new Integer(pageNum);
        Integer size=new Integer(pageSize);

        //age = age ==null ? null : age;
        //1设置起始页，和每页大小
        PageHelper.startPage(num, size,true);
        //2设置查询条件
        PeopleExample peopleExample=new PeopleExample();
        PeopleExample.Criteria criteria = peopleExample.createCriteria();
        //criteria.andAgeEqualTo(age);
        //3调用逆向工程生成代码
        List<People> list = peopleMapper.selectByExample(peopleExample);
        //4将查询到的条件集合传给PageInfo
        PageInfo pageInfo = new PageInfo(list);
        Page page = (Page) list;
        return pageInfo;
    }

    @RequestMapping(value = "/findById/{peopleId}",method = RequestMethod.GET)
    public People  findPepleById(@PathVariable(name="peopleId") String peopleId){
        return peopleMapper.selectByPrimaryKey(peopleId);
    }
//    @RequestMapping
//    public void  addPeople(){
//
//    }
//    @RequestMapping
//    public void  deletePeople(){
//
//    }

}
