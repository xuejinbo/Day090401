package com.ln.controller;

import com.ln.entity.ShopBean;
import com.ln.service.ShopService;
import com.ln.utils.Result;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 创作时间：2020/8/24 11:02
 * 作者：薛金博 HP
 */
@RestController
@RequestMapping("/ShopController")
public class ShopController {
    @Resource
    private ShopService shopService;
    @RequestMapping("/getAll")
    public Object getAll(){
        List<ShopBean> list=shopService.getAll();
        return list;
    }
    @RequestMapping("/addShop")
    public Result addShop(@RequestBody ShopBean shopBean) {
        try {
            shopService.addShop(shopBean);
            return new Result(Result.RESULTTRUE, "保存成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Result.RESULTFALSE, "保存失败");
        }
    }
    @RequestMapping("/delShop")
    public Result delShop(@RequestBody Long[] ids) {
        try {
            shopService.delShop(ids);
            return new Result(Result.RESULTTRUE, "删除成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Result.RESULTFALSE, "删除失败");
        }

    }

}
