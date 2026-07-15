package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnexionJpa {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = entityManagerFactory.createEntityManager();

        // Find de la région d'identifiant 1
        Region region = em.find(Region.class, 1);

        // Affichage du nom
        System.out.println("Nom de la région : " + region.getNom());


        em.close();
        entityManagerFactory.close();
    }
}