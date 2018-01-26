package com.my.controller;

import com.my.common.pojo.EasyUIDataGridResult;
import com.my.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDataGridResult getItemList(Integer page,Integer rows){
        //引入
        //注入
        //调用
        EasyUIDataGridResult result = itemService.getItemList(page, rows);
        return result;
    }
}
