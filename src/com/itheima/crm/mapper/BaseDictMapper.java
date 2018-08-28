package com.itheima.crm.mapper;

import com.itheima.crm.pojo.BaseDict;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BaseDictMapper {

      public List<BaseDict> getBaseDictByCode(String code);

      public String   getBaseDictBycode(String  name);
}
