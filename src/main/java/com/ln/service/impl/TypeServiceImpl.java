package com.ln.service.impl;

import com.ln.entity.ShopBean;
import com.ln.entity.TypeBean;
import com.ln.mapper.ShopMapper;
import com.ln.mapper.TypeMapper;
import com.ln.service.ShopService;
import com.ln.service.TypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2020/8/17 11:06
 * 作者：薛金博 HP
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    private TypeMapper typeMapper;

    @Override
    public List<TypeBean> getType() {
        return typeMapper.getType();
    }
}
