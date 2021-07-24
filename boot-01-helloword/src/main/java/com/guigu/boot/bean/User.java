package com.guigu.boot.bean;

public class User {
    private String name;
    private String age;

    public User(){}
    public User(String name,String age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String nametoString(){
        return "name = " + name;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getAge(){
        return age;
    }

    public String agetoString(){
        return "name = " + age;
    }
}
