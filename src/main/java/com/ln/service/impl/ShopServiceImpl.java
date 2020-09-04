package com.ln.service.impl;

import com.ln.entity.CityBean;
import com.ln.entity.ShopBean;
import com.ln.mapper.CityMapper;
import com.ln.mapper.ShopMapper;
import com.ln.service.CityService;
import com.ln.service.ShopService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2020/8/17 11:06
 * 作者：薛金博 HP
 */
@Service
public class ShopServiceImpl implements ShopService {
    @Resource
    private ShopMapper shopMapper;

    @Override
    public List<ShopBean> getAll() {
        return shopMapper.getAll();
    }

    @Override
    public void addShop(ShopBean shopBean) {
        shopMapper.addShop(shopBean);
    }

    @Override
    public void delShop(Long[] ids) {
        for (Long id : ids) {
            shopMapper.delShop(id);
        }
    }
}
