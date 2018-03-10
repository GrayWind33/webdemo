package com.web.dao;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.web.bean.HelloBean;

@MapperScan
public interface TestMapper {
    public List<HelloBean> getTest();
}
