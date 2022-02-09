package com.company;

public class Singer extends Person {

    String bandName;

    public Singer(String name, String job, String designation, String bandName) {
        super(name, job, designation);
        this.bandName = bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bandName: " + bandName;
    }

    void singing(){
        System.out.println(name+" is singing wery well");

    }
    void playGitar(){
        System.out.println(name + " likes playing guitar");

    }
}
