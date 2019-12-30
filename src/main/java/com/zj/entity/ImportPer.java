package com.zj.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
@Data
@ToString
public class ImportPer implements Serializable {
    private Integer id;
    private String roles;
    private String name;
    private String account;
    private String ondate;
    private String offdate;
    private String type;
}
