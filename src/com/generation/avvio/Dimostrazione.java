package com.generation.avvio;

import com.generation.entities.ClasseVuota;
import com.generation.entities.Teacher;
import com.generation.library.Console;
import com.generation.library.List;

public class Dimostrazione 
{
    public static void main(String[] args) 
    {
        
        Teacher tn = new Teacher();
        tn.setId(1);
        tn.setName("Stefano");
        tn.setSurname("Rubinetti");
        tn.setDob("1995-08-27");
        tn.setFieldOfCompetence("C.S.");
        List<String> specializzazioni = new List<String>();
        specializzazioni.add("Java");
        specializzazioni.add("PHP");
        tn.setSpecializations(specializzazioni);

        //Console.print(tn.toString());

        ClasseVuota a = new ClasseVuota();
        
        Console.print(a);
    }
}
