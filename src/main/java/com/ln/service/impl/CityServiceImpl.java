package com.ln.service.impl;

import com.ln.entity.CityBean;
import com.ln.mapper.CityMapper;
import com.ln.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2020/8/17 11:06
 * 作者：薛金博 HP
 */
@Service
public class CityServiceImpl implements CityService {
    @Resource
    private CityMapper cityMapper;
    @Override
    public List<CityBean> insertCity() {
        List<CityBean> list = cityMapper.insertCity();
        return list;
    }

    @Override
    public List<CityBean> insertCityBypid(Integer pid) {
        List<CityBean> list=cityMapper.insertCityBypid(pid);
        return list;
    }
}
