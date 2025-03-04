package Etudient;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {


        EntityManagerFactory emf = Persistence.createEntityManagerFactory("etudiantET");
        EntityManager em = emf.createEntityManager();

        etudiant E = new etudiant("mostafa", "akajdid", 22);

        //add
        em.getTransaction().begin();
        em.persist(E);
        em.getTransaction().commit();




        // remove
        em.getTransaction().begin();
        etudiant ETR = em.find(etudiant.class, 4);
        if (ETR != null) {
            em.remove(ETR);
            System.out.println("etudient removed : " + ETR);
        } else {
            System.out.println("etudient Not found " + 4);
        }
        em.getTransaction().commit();


        // modify
        em.getTransaction().begin();
        etudiant ETA = em.find(etudiant.class, 5);
        if (ETA != null) {
            ETA.setNom("said");
            ETA.setPrenom("raba7");
            ETA.setAge(5);
            System.out.println("etudient modifier: " + ETA);
        } else {
            System.out.println("not found this etudient: " + 5);
        }
        em.getTransaction().commit();
    }



}
