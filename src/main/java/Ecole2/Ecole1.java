package Ecole2;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="etudiantByEcole")
public class Ecole1 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEcole;
    private String nom;
    private String description;

    @OneToMany
    @JoinTable(name="ecole_etudiant",
    joinColumns = @JoinColumn(name="idEcole"),
    inverseJoinColumns=@JoinColumn(name="id"))
    List<Etudiant1> etudiant1;

    public Ecole1() {
    }

    public Ecole1(String nom, String description, List<Etudiant1> etudiant1) {
        this.nom = nom;
        this.description = description;
        this.etudiant1 = etudiant1;
    }

    public List<Etudiant1> getEtudiant1() {
        return etudiant1;
    }

    public void setEtudiant1(List<Etudiant1> etudiant1) {
        this.etudiant1 = etudiant1;
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
