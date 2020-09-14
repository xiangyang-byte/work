package com.xiangyang.demo.controller;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xiangyang.demo.demo.User;
import com.xiangyang.demo.demo.vo.UserVO;
import com.xiangyang.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(value="用户管理")
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    @ApiOperation(value = "添加用户")
    public void insert(@RequestBody User user){
        userService.insert(user);
    }

    @GetMapping("select")
    @ApiOperation(value = "查询用户信息")
    public void select(){
        userService.selectAll();
    }


    @GetMapping("selectById")
    @ApiOperation(value = "查询一条数据信息")
    public void selectById(@RequestParam("id")String id){
        userService.selectById(id);
    }

    @PostMapping("login")
    @ApiOperation(value = "用户登录")
    public String login(@RequestParam("login_acct")String login_acct,
                        @RequestParam("password")String password){
        User user = userService.doLogin(login_acct, password);
        if(user != null){
            String jsonUser = JSON.toJSONString(user);
            System.out.println(jsonUser);
            return jsonUser;
        }
        return "fail";
    }

}
