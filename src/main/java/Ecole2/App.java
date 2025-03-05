package Ecole2;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Etudiant1 etudiant1 = new Etudiant1("Mohamed", "Ben Ali", 22);
        Etudiant1 etudiant2 = new Etudiant1("Ahmed", "Hassan", 24);

        List<Etudiant1> etudiants = new ArrayList<>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);

        Ecole1 ecole1 = new Ecole1("FSTS", "Ecole des sciences et technologies", etudiants);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("etudiantET");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();

            // Persister les étudiants avant de persister l'école
            em.persist(etudiant1);
            em.persist(etudiant2);

            // Persister l'école
            em.persist(ecole1); // L'école et ses étudiants seront ajoutés à la base de données

            // Validation de la transaction
            em.getTransaction().commit();

            System.out.println("L'école et les étudiants ont été ajoutés avec succès!");

        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            e.printStackTrace();
        } finally {

            em.close();
            emf.close();
        }
    }
}
