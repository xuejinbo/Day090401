package com.ln.service;

import com.ln.entity.CityBean;
import com.ln.entity.ShopBean;

import java.util.List;

/**
 * 创作时间：2020/8/17 11:05
 * 作者：薛金博 HP
 */
public interface ShopService {
    List<ShopBean> getAll();
    void addShop(ShopBean shopBean);

    void delShop(Long[] ids);
}
