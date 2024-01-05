package com.generation.entities;

import java.time.LocalDate;

import com.generation.library.List;

public class Student extends Person
{
    private List<Double> grades = new List<Double>();
    private int year;

    //public Student() {}

    public Student(int id, String name, String surname, LocalDate dob, int year)
    {
        super(id,name,surname,dob); //questa è una chiamata a metodo, 
                                    //passo i parametri che gli servono 
        this.year=year;             //completo con la proprietà che non c'è in person               
    }
    
    
    public List<Double> getGrades() {
        return grades;
    }
    public Student(int id, String name, String surname, LocalDate dob, List<Double> grades, int year) {
        super(id, name, surname, dob);
        this.grades = grades;
        this.year = year;
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

    //posso richiamare i metodi del supertipo
   @Override
   public String toString()
   {
        String res = super.toString();//qua ho ripreso 
                                        //"Ciao mi chiamo "+name+" "+surname+", la mia data di nascità "+dob;
        res+= "\nSono uno studente dell'anno "+year; //ho aggiunto le proprietà di student
        res+= "i voti che ho ottenuto "+grades;
        return res;
   } 

   @Override 
   public boolean isValid()
   {
        return  super.isValid()      &&
                year>=1  && year<=5    ;
   }
}//abbiamo riutilizziamo il metodo nella nuova versione
//posso richiamare i metodi del mio supertipo con super.nomeMetodo
//lo usiamo se il metodo del supertipo va bene ma non è completo