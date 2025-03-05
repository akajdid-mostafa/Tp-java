package Etudient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.SQLOutput;
import javax.persistence.*;

@Entity
public class partisaid {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nom;
    private String prenom;
    private int age;


    public partisaid() {
    }

    public partisaid(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }



}
