package com.company;

public class Dancer extends Person {

   private String groupname;
    String job;

    public Dancer(String name, String job, String designation, String groupname) {
        super(name, job, designation);
        this.groupname = groupname;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    @Override
    public String toString() {
        return super.toString()  +
                ", groupname: " + groupname;
    }

    void dancing() {
        System.out.println(name + " likes dancing tango");
    }
}

