package com.hp.bean;

public class StudentInfo {
    private String name;

    @Override
    public String toString() {
        return "StudentInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", clazz='" + clazz + '\'' +
                '}';
    }

    private int age;

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

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    private String clazz;
}
