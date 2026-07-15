package fr.diginamic;

import javax.persistence.*;
import java.util.List;

public class ConnexionJpa {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
        EntityManager em = entityManagerFactory.createEntityManager();

        // Find simple
        Livre livre = em.find(Livre.class, 1);
        System.out.println(livre);

        // TypedQuery pour extraire tous les livres
        TypedQuery<Livre> query = em.createQuery("SELECT l FROM Livre l", Livre.class);
        List<Livre> livres = query.getResultList();

        // Boucle d'affichage
        for (Livre l : livres) {
            System.out.println(l);
        }

        em.close();
        entityManagerFactory.close();
    }
}