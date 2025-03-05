package Entities;

import javax.persistence.*;

@Entity
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;
    private int age;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="idEcole")
    Ecole ecole;
    public Etudiant() {
    }

    public Etudiant(String nom, String prenom, int age, Ecole ecole) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.ecole = ecole;
    }

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Ecole getEcole() {
        return ecole;
    }
    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }
}
