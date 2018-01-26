package com.my.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * s首页
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String showIndex(){
        return "index";
    }
    //展示商品列表页面
    //url:item-list
    @RequestMapping("/{page}")
    public String showItemList(@PathVariable(value="page") String page){
        return page;
    }
}
