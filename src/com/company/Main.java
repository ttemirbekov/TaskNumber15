package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Manas","Pilot", " Pilot");
        System.out.println(person);
        person.learn();
        person.walk();
        person.eat();
        System.out.println("____________________________________________________________");

        Programmer programmer = new Programmer("Bekmamat", "Programmer","Software engineer", "Nomad IT" );
        System.out.println(programmer);
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println("____________________________________________________________");

        Dancer dancer = new Dancer("Sherline", "Dancer","dancer", "BTS");
        System.out.println(dancer);
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();

        System.out.println("____________________________________________________________");

        Singer singer = new Singer("Kairat", "Singer","singer", "Zaman");
        System.out.println(singer);
        singer.learn();
        singer.walk();
        singer.eat();
        singer.singing();
        singer.playGitar();

    }
}
