package com.utkarsh;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @Column(name= "rollNo")
    private int rollNo;

    @Column(name= "sName")
    private String sName;

    @Column(name= "sAge")
    private int sAge;


    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    @Override
    public String toString(){
        return "Student{" + "rollNo=" + rollNo + ", sName='" + sName + '\'' + ", sAge=" + sAge + '}';
    }

}
