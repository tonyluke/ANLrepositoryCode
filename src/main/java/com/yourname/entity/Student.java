package com.yourname.entity;

public class Student {

    private int id;
    private String name;
    private String lname;

    public Student(int id, String name, String lname) {
        this.id = id;
        this.name = name;
        this.lname = lname;
    }

    public Student(){}

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

    public String getlname() {
        return lname;
    }

    public void setlname(String lname) {
        this.lname = lname;
    }
}
