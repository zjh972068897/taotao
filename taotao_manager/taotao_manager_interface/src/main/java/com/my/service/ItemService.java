package com.my.service;

import com.my.common.pojo.EasyUIDataGridResult;

public interface ItemService {
    public EasyUIDataGridResult getItemList(Integer page,Integer rows);
}
