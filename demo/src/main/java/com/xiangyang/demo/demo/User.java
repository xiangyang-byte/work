package com.xiangyang.demo.demo;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private Long id;

    private String login_acct;

    private String password;

    private String name;

    private Integer age;

    private String email;


}
