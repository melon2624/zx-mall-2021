package com.zx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author：  zhangxin
 * @date：  2021-07-04 13:50
 */

/**
 * 后台用户表
 */
@Data
@TableName(value = "ums_member")
public class UmsMember implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;

    /**
     * 头像
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 昵称
     */
    @TableField(value = "nick_name")
    private String nickName;

    /**
     * 备注信息
     */
    @TableField(value = "note")
    private String note;

    /**
     * 创建时间
     */
    @TableField(value = "gmt_create")
    private Date gmtCreate;

    /**
     * 最后登录时间
     */
    @TableField(value = "login_time")
    private Date loginTime;

    /**
     * 帐号启用状态：0->禁用；1->启用
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 最近修改时间时间
     */
    @TableField(value = "gmt_modified")
    private Date gmtModified;

    private static final long serialVersionUID = 1L;
}