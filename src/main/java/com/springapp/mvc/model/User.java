package com.springapp.mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by heval-Computer on 26.7.2015.
 */

@Entity
public class User {
    private long id;
    private String userName;
    private String email;
    private String password;
    private short age;

    public User() {

    }

    public User(String userName, String email, String password, short age) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.age = age;
    }

    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Column(name = "user_mail")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "user_password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "user_age")
    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

}
