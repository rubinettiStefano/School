package com.generation.entities;

import java.time.LocalDate;

//Anche se non lo vedete implicitamente c'è scritto
public class Person extends Object
{
    //public          -> visto e utilizzato ovunque

    //protected       -> visibilità di package + può essere visto e utilizzato da tutti i sottotipi, dovunque essi siano

    //default/package ->  visto e utilizzato solo dentro lo stesso package della classe
    //private         -> visto e utilizzato solo nella classe stessa


    protected int id;
    protected String name,surname;
    protected LocalDate dob;
    
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


    //POLIMORFISMO DI METODI
    //OVERLOAD -> più metodi con la stessa FIRMA ma parametri DIVERSI
    //OVERRIDE  -> un sottotipo può dire "Grazie supertipo per il metodo che mi hai gratuitamente fornito"
    //              ma mi fa schifo, non rispetta le mie esigenze, lo voglio sovrascrivere
    //              voglio avere una versione tutta mia del metodo
    public void setDob(LocalDate dob) 
    {
        this.dob = dob;
    }

    //accettiamo string formattate come yyyy-mm-dd
    public void setDob(String dob_string)
    {
        this.dob = LocalDate.parse(dob_string);
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public String toString()
    {
        return "Ciao sono una persona di nome "+name+", cognome "+surname+" nata il "+dob;
    }
    
}
