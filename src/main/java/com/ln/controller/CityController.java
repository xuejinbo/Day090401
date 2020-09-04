package com.ln.controller;

import com.ln.entity.CityBean;
import com.ln.mapper.CityMapper;
import com.ln.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2020/8/24 11:02
 * 作者：薛金博 HP
 */
@RestController
@RequestMapping("/CityController")
public class CityController {
    @Resource
    private CityService cityService;
    @RequestMapping("/insertCity")
    public Object insertCity(){
        List<CityBean> list=cityService.insertCity();
        return list;
    }

    @RequestMapping("/insertCityBypid")
    public Object insertCityBypid(Integer pid){
        List<CityBean> list=cityService.insertCityBypid(pid);
        return list;
    }
}
