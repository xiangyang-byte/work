package com.xiangyang.demo.demo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Achievement implements Serializable {

    private int id;

    private String china_achievement;

    private String master_achievement;

    private String ens_achievement;

}
