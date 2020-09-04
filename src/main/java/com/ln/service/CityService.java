package com.ln.service;

import com.ln.entity.CityBean;

import java.util.List;

/**
 * 创作时间：2020/8/17 11:05
 * 作者：薛金博 HP
 */
public interface CityService {
    List<CityBean> insertCity();

    List<CityBean> insertCityBypid(Integer pid);
}
