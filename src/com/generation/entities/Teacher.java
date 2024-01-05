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
    
    public String getPresentation()
    {
        return "Hello, my name is "+ name;
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

    //Dobbiamo riscrivere la FIRMA DEL METODO EREDITATO PARI PARI, uguale in tutto
    @Override
    public String toString()
    {
        return "Ciao sono un insegnante di nome "+name+", cognome "+surname+" nato il "+dob+" e insegno "
                + fieldOfCompetence +" e le mie specializzazioni sono: "+specializations;
    }


}


//Ereditarietà è un rapporto di IDENTITÀ
//Teacher EXTENDS Person
//Teacher SOTTOTIPO di Person
//Un Teacher È una Persona
//Teacher is_a Person


//Rapporti di composizione o di uso
//Database, 1-N N-N, padri e figli