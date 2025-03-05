package Entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test1 {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("etudiantET");
        EntityManager em = emf.createEntityManager();
        Ecole ecole = new Ecole("fsts","hkl");
        Etudiant etudiant = new Etudiant("najwa","moukh",20,ecole);



        em.getTransaction().begin();
        //em.persist(ecole);
        //em.persist(etudiant);
        em.find(Etudiant.class, etudiant.getId());
        em.getTransaction().commit();
    }

}
