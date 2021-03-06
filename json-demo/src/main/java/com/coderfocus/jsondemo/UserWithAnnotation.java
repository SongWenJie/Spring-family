package com.coderfocus.jsondemo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class UserWithAnnotation {
    @JsonProperty("userName")
    private String name;
    private Integer age;

    @JsonFormat(pattern = "yyyy年MM月dd日")
    private Date birthday;

    @JsonIgnore
    private String email;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString(){
        return name + "|" + age + "|" + birthday + "|" + email;
    }
}
