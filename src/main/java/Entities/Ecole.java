package Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Ecole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEcole;
    private String nom;
    private String description;

    public Ecole() {
    }
    public Ecole(String nom, String description) {
        this.nom = nom;
        this.description = description;
    }
    public int getIdEcole() {
        return idEcole;
    }
    public void setIdEcole(int idEcole) {
        this.idEcole = idEcole;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
