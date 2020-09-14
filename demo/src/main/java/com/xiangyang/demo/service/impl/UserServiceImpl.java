package com.xiangyang.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xiangyang.demo.demo.User;
import com.xiangyang.demo.demo.vo.UserVO;
import com.xiangyang.demo.mapper.UserMapperInfo;
import com.xiangyang.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapperInfo userMapperInfo;

    @Override
    public void insert(User user) {
        userMapperInfo.insert(user);
    }

    @Override
    public User selectAll() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        List<User> userList = userMapperInfo.selectList(wrapper);
        if(userList != null){
            for (User user : userList) {
                //return user;
                System.err.println(user);
            }
        }
        throw new RuntimeException("请求错误，请从新操作");
    }

    @Override
    public User selectById(String id) {
        User user = userMapperInfo.selectById(id);
        if(user != null){
            System.err.println(user);
            return user;
        }
       throw new RuntimeException("没有该用户信息");
    }

    @Override
    public User doLogin(String login_acct, String password) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("login_acct",login_acct);
        //查询一条登录信息
        User user = userMapperInfo.selectOne(wrapper);
        if(user != null){
            return user;
        }
        return null;
    }
}
