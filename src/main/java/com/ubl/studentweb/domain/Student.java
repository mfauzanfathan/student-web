package com.ubl.studentweb.domain;

import java.time.LocalDate;

public class Student {
    private String fullName;
    private String address;
    private LocalDate dateOfBirth;
    private String nim;

    public Student(){    
    }

    public String getfullName(){
       return fullName;
    }
    public void setfullName(String fullName) {
        this.fullName = fullName;
    }
    public String getAddres() {
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public LocalDate getdateOfBirth() {
        return dateOfBirth;
    }
    public void setdateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public String getnim(){
        return nim;
    }
    public void setnim(String nim){
        this.nim = nim;
    }

}