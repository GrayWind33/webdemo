package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.bean.HelloBean;
import com.web.dao.TestMapper;

@Controller
@RequestMapping("/") 
public class HelloController {
    
    @Autowired
    private TestMapper testMapper;
    
    @RequestMapping(value="/hello",method=RequestMethod.GET)
    public String getHello() {
        return "hello";
    }
    
    @RequestMapping(value="/hellostring",method=RequestMethod.GET)
    @ResponseBody
    public String getHi() {
        return "hi";
    }
    
    @RequestMapping(value="/hellobean",method=RequestMethod.GET)
    @ResponseBody
    public HelloBean getBean() {
        HelloBean hello = new HelloBean();
        hello.setId("21312");
        hello.setTxt("sdfhuisf");
        return hello;
    }
    
    @RequestMapping(value="/hellolist",method=RequestMethod.GET)
    @ResponseBody
    public List<HelloBean> getBeanList() {
        return testMapper.getTest();
    }
}
