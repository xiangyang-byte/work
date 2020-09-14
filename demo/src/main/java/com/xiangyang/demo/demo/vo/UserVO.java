package com.xiangyang.demo.demo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@ApiModel
@Data
public class UserVO implements Serializable {

    private static final long serialVersionUID = -3596636959099181661L;

    @ApiModelProperty("访问令牌，请妥善保管，以后每次请求都要带上")
    //令牌 登录后会分配给当前用户一个临时令牌值。以后对系统的任何访问必须携带这个令牌。否则，拒绝访问。必须去登录。
    private String accessToken;
    @ApiModelProperty("账号")
    private String loginAcct;
    @ApiModelProperty("密码")
    private String passwd;
    @ApiModelProperty("用户名称")
    private String userName;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("验证状态")
    private String authStatus;
    @ApiModelProperty("用户类型")
    private String userType;
    @ApiModelProperty("真实姓名")
    private String realName;
    @ApiModelProperty("身份证ID")
    private String idCard;
    @ApiModelProperty("用户类型")
    private String acctType;

}
