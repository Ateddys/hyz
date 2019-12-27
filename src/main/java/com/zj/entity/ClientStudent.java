package com.zj.entity;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author : hyz
 * @program : onecode
 * @description :
 * @date : 2019-12-27 09:03
 **/
@Data
@ToString
public class ClientStudent implements Serializable {

    private int id;

    private String name;

    private int age;

    private String arre;
}
