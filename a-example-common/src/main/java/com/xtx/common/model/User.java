package com.xtx.common.model;

import java.io.Serializable;

/**
 * 用户信息
 */
public class User implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
