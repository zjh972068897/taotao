package com.my.common.pojo;

import java.io.Serializable;

public class TreeNode implements Serializable {
    private long id;//树控件的节点的id值
    private  String text;//显示节点文本
    private String state;//状态 closed open

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
