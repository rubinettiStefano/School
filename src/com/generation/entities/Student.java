package com.generation.entities;

import com.generation.library.List;

public class Student extends Person
{
    private List<Double> grades = new List<Double>();
    private int year;
    
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
