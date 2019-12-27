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

    public ClientStudent() {
    }

    public ClientStudent(int id, String name, int age, String arre) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.arre = arre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArre() {
        return arre;
    }

    public void setArre(String arre) {
        this.arre = arre;
    }
}
