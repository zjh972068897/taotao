package com.my.service;

import com.my.common.pojo.TreeNode;

import java.util.List;

public interface ItemCatService {
    public List<TreeNode> getItemCatListByParentId(Long parentId);
}
