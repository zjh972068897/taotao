package com.my.controller;

import com.my.common.pojo.TreeNode;
import com.my.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ItemCatController {
    //url:/item/cat/list
    //参数:id
    //返回值,json
    @Autowired
    private ItemCatService itemCatService;
    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<TreeNode> getItemCatList(@RequestParam(value="id",defaultValue = "0") Long parentId){
        List<TreeNode> list = itemCatService.getItemCatListByParentId(parentId);
        return list;
    }
}
