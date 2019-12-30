package com.zj.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class ImportPer implements Serializable {

    private Integer id;

    /**
     * 角色
     */
    private String roles;

    /**
     * 名称
     */
    private String name;

    /**
     * 手机号
     */
    private String account;

    /**
     * 开始时间
     */
    private String ondate;

    /**
     * 结束时间
     */
    private String offdate;

    /**
     * 类型
     */
    private String type;
}
