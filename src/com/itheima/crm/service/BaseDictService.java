package com.itheima.crm.service;

import com.itheima.crm.pojo.BaseDict;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BaseDictService {

    public List<BaseDict> getBaseDictByCode(String code);
}
