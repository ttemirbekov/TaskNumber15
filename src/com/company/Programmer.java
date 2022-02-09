package com.company;

public class Programmer extends Person {
    private String companyName;
    private  String job;

    public Programmer(String name, String job, String designation, String companyName) {
        super(name, job, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getJob() {
        return job;
    }

    @Override
    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Programmer's " +
                "name: " + name  +
                ", designation: " + designation + ", companyName: " + companyName;
    }

    void coding(){
        System.out.println(name + "is good at coding");
    }
}

