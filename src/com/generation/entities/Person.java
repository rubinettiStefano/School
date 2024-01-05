package com.generation.entities;

import java.time.LocalDate;

//Anche se non lo vedete implicitamente c'è scritto
//Lo scopo di questa Classe è di fare da Modello, Da Fattor Comune
//Per altre Classi

//Una Classe Astratta è una Classe che riteniamo troppo generica per poter essere istanziata
//una classe il cui UNICO scopo è quello di essere ESTESA, di fare da supertipo
//con abstract IMPEDIAMO la creazione di oggetti di classe Person
public abstract class Person extends Object
{
    //public          -> visto e utilizzato ovunque

    //protected       -> visibilità di package + può essere visto e utilizzato da tutti i sottotipi, dovunque essi siano

    //default/package ->  visto e utilizzato solo dentro lo stesso package della classe
    //private         -> visto e utilizzato solo nella classe stessa


    protected int id;
    protected String name,surname;
    protected LocalDate dob;
    
    // public Person() //versione estesa del costruttore vuoto
    // {
    //     super(); //viene sempre richiamato il costruttore del supertipo
    //             //anche se di solito IMPLICITAMENTE
    // }
    public Person(){}
    public Person(int id, String name, String surname, LocalDate dob) 
    {
        super();  //questo c'è sempre, ma implicito
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }


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
        return "Ciao mi chiamo "+name+" "+surname+", la mia data di nascità "+dob;
    }

    public boolean isValid()
    {
        return id>0 && name!=null && !name.isBlank() &&
                surname!=null && !surname.isBlank()  &&
                dob!=null;
    }
    
}