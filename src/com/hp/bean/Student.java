package com.hp.bean;

import java.util.Date;

public class Student {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", isShen=" + isShen +
                '}';
    }

    public int getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public boolean isShen() {
        return isShen;
    }

    public void setShen(boolean shen) {
        isShen = shen;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  int id;
    private  int age;
    private String name;
    private Date birthday;
    private boolean isShen;
}
