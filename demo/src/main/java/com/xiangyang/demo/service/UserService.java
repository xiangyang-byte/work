package com.xiangyang.demo.service;

import com.xiangyang.demo.demo.User;

public interface UserService {

    void insert(User user);

    User selectAll();

    User selectById(String id);

    User doLogin(String login_acct, String password);
}
