package com.ln.mapper;

import com.ln.entity.ShopBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 创作时间：2020/8/24 10:09
 * 作者：薛金博 HP
 */
public interface ShopMapper {
    List<ShopBean> getAll();

    void addShop(ShopBean shopBean);

    void delShop(@Param("id") Long id);
}
