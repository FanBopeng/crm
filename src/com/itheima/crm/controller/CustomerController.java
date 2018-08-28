package com.itheima.crm.controller;

import com.itheima.crm.pojo.BaseDict;
import com.itheima.crm.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.ContextLoaderListener;


import java.util.List;

    @Controller
    @RequestMapping("customer")
    public class CustomerController {

    @Autowired
    private BaseDictService baseDictService;

    @RequestMapping("list")
    public  String List(Model model){

        List<BaseDict> fromType=  baseDictService.getBaseDictByCode("002");
        List<BaseDict> industryType=  baseDictService.getBaseDictByCode("001");
        List<BaseDict> levelType=  baseDictService.getBaseDictByCode("006");


        model.addAttribute("fromType",fromType);
        model.addAttribute("industryType",industryType);
        model.addAttribute("levelType",levelType);


        return "customer";
    }
}
