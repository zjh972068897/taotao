package com.my.service.impl;

import com.my.common.pojo.TreeNode;
import com.my.mapper.TbItemCatMapper;
import com.my.pojo.TbItemCat;
import com.my.pojo.TbItemCatExample;
import com.my.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ItemCatServiceImpl implements ItemCatService {
    @Autowired
    private TbItemCatMapper mapper;
    @Override
    public List<TreeNode> getItemCatListByParentId(Long parentId) {
        //1.注入
        //2.创建examle 对象封装查询条件
        TbItemCatExample example = new TbItemCatExample();
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //3.执行查询获取到结果
        List<TbItemCat> tbItemCats = mapper.selectByExample(example);
        //4.转成List<TreeNode> 返回
        ArrayList<TreeNode> nodes = new ArrayList<>();
        for (TbItemCat itemCat : tbItemCats) {
            TreeNode node = new TreeNode();
            node.setId(itemCat.getId());
            node.setText(itemCat.getName());
            node.setState(itemCat.getIsParent()?"closed":"open");
            nodes.add(node);
        }

        return nodes;
    }
}
