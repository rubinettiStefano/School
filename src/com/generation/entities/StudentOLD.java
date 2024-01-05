package com.generation.entities;

import java.time.LocalDate;

import com.generation.library.List;

public class StudentOLD
{

    private int id;
    private String name,surname;
    private LocalDate dob;
    private List<Double> grades = new List<Double>();
    private int year;
    
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
    public List<Double> getGrades() {
        return grades;
    }
    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    
}
