package com.ln.mapper;

import com.ln.entity.CityBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 创作时间：2020/8/17 11:01
 * 作者：薛金博 HP
 */
public interface CityMapper {
    List<CityBean> insertCity();

    List<CityBean> insertCityByid(@Param("id") Integer id);

    List<CityBean> insertCityBypid(@Param("pid") Integer pid);
}
