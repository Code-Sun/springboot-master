package org.spring.springboot.domain;

/**
 * 用户实体类
 *
 * Created by bysocket on 07/02/2017.
 */
public class User {

    /**
     * 用户编号
     */
    private int id;

    /**
     * 用户姓名
     */
    private String user_name;

    /**
     * 年龄
     */
    private int user_age;

    /**
     * 性别
     */
    private int user_gender;

    /**
     * 部门id
     */
    private int ep_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    public int getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(int user_gender) {
        this.user_gender = user_gender;
    }

    public int getEp_id() {
        return ep_id;
    }

    public void setEp_id(int ep_id) {
        this.ep_id = ep_id;
    }
}
