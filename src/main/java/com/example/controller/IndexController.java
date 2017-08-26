package com.example.controller;

import com.example.po.People;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by git on 2017/8/18.
 */

@Controller
@RequestMapping(value="/")
public class IndexController {
    @RequestMapping
    public String index(){
//        People people1=new People();
//        people1.setId("1");
//        people1.setName("三胖");
//        people1.setSex("male");
//        people1.setAge("38");
//        People people2=new People();
//        people2.setId("2");
//        people2.setName("特朗普");
//        people2.setSex("male");
//        people2.setAge("78");
//        model.addAttribute("people",people1);
//        List<People> person=new ArrayList<>();
//        person.add(people1);
//        person.add(people2);
//        model.addAttribute("person",person);
        return  "people";
    }



}
