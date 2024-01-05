package com.generation.entities;

import java.time.LocalDate;

import com.generation.library.List;

public class Teacher 
{
    private int id;
    private String name,surname;
    private LocalDate dob;
    private String fieldOfCompetence;
    private List<String> specializations = new List<String>();
    
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
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getFieldOfCompetence() {
        return fieldOfCompetence;
    }
    public void setFieldOfCompetence(String fieldOfCompetence) {
        this.fieldOfCompetence = fieldOfCompetence;
    }
    public List<String> getSpecializations() {
        return specializations;
    }
    public void setSpecializations(List<String> specializations) {
        this.specializations = specializations;
    }

    
}
