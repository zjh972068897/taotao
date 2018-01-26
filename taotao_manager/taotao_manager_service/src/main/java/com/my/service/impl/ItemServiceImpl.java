package com.my.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.my.common.pojo.EasyUIDataGridResult;
import com.my.mapper.TbItemMapper;
import com.my.pojo.TbItem;
import com.my.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;
    @Override
    public EasyUIDataGridResult getItemList(Integer page,Integer rows) {
        //分页
        //设置分页
        PageHelper.startPage(page,rows);//紧跟着第一查询才会被个分页
        List<TbItem> tbItems = itemMapper.selectByExample(null);
        //构建分页的对象 里面包括了总记录数
        PageInfo<TbItem> info = new PageInfo<>(tbItems);
        long total = info.getTotal();
        //创建EasyUIDataGridResult对象 封装属性(total rows)
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setTotal(info.getTotal());
        result.setRows(info.getList());
        return result;
    }
}
