package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by git on 2017/8/18.
 */

@Controller
@RequestMapping(value="/")
public class IndexController {
    @RequestMapping
    public String index(){
        return  "index";
    }

}
