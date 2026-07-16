package fr.diginamic;

import javax.persistence.*;

public class ConnexionJpa {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = entityManagerFactory.createEntityManager();

        Emprunt emprunt = em.find(Emprunt.class, 1);
        System.out.println(emprunt);

        for(Livre livre : emprunt.getLivres()){
            System.out.println(livre);
        }

        em.close();
        entityManagerFactory.close();
    }
}