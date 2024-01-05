package com.generation.entities;

import com.generation.library.List;

//La Classe Teacher è una SPECIALIZZAZIONE della Classe Person
//Un teacher è tutto quello che è una Person e qualcosa in più
//quando scrivo "extends" di fianco alla classe
//dico EREDITÀ tutto dal tuo SUPERTIPO

//SUPERTIPO -> Classe più Generica
//SOTTOTIPO -> Classe più Specializzata

//SOTTOTIPO extends SUPERTIPO
public class Teacher extends Person
{
    //QUI NON LE VEDIAMO ESPLICITAMENTE
    //Ma teacher ha un id,un nome, un cognome e una dob
    //le ha perchè È una persona, una persona più specializzata
    //e noi abbiamo detto che ogni persona ha un id,un nome, un cognome e una dob
    private String fieldOfCompetence;
    private List<String> specializations = new List<String>();
    
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
