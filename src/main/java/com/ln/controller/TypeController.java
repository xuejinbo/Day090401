package com.ln.controller;

import com.ln.entity.TypeBean;
import com.ln.service.TypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2020/8/24 11:02
 * 作者：薛金博 HP
 */
@RestController
@RequestMapping("/TypeController")
public class TypeController {
    @Resource
    private TypeService typeService;
    @RequestMapping("/getType")
    public Object getType(){
        List<TypeBean> typelist=typeService.getType();
        return typelist;
    }

}
