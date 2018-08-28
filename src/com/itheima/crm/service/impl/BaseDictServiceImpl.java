package com.itheima.crm.service.impl;

import com.itheima.crm.mapper.BaseDictMapper;
import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseDictServiceImpl  implements BaseDictService{

    @Autowired
    private BaseDictMapper baseDictMapper;

    @Override
    public List<BaseDict> getBaseDictByCode(String code) {




        return         baseDictMapper.getBaseDictByCode(code);

    }
}
