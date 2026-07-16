package fr.diginamic;

import javax.persistence.*;

public class ConnexionJpa {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = entityManagerFactory.createEntityManager();

        Client client = em.find(Client.class, 1);
        System.out.println(client);

        for (Emprunt emprunt : client.getEmprunts()) {
            System.out.println(emprunt);
        }

        em.close();
        entityManagerFactory.close();
    }
}