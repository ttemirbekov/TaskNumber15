package com.company;

public class Person {
    String name;
    String job;
    String designation;

    public Person(String name, String job, String designation) {
        this.name = name;
        this.job = job;
        this.designation = designation;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return job + "'s " +
                "name: " + name +
                ", designation: " + designation;
    }

    void learn() {
        System.out.println(name + " likes learning new things");

    }

    void walk() {
        System.out.printf("%s walks 3 miles in the morning\n", name);

    }

    void eat() {
        System.out.println(name + " doesn't like eating fast food");


    }
}