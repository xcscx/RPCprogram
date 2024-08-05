package com.xtx.common.service;

import com.xtx.common.model.User;

/**
 * 用户服务
 */
public interface UserService {

    /**
     * 获取用户
     */
    User getUser(User user);

    /**
     * 获取数字
     */
    default short getNumber() {
        return 1;
    }

}
