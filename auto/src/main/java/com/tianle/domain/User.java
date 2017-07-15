package com.tianle.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;

/**
 * Created by win7 on 2017/4/27.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User()
    {

    }

    private String username;
    private String password;

    @Min(value = 18, message = "未成年不允许注册！")
    private Integer age;


    public String getMobileno() {
        return mobileno;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    private String mobileno;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", mobileno='" + mobileno + '\'' +
                '}';
    }
}

