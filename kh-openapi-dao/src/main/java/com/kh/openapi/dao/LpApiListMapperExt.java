package com.kh.openapi.dao;

import com.kh.openapi.model.LpApiList;
import org.apache.ibatis.annotations.Param;

public interface LpApiListMapperExt extends LpApiListMapper {

    LpApiList getApiList(@Param("apiName") String apiName);
}