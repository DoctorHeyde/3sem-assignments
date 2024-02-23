package lyngby.RecyclingExercise;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lyngby.HibernateConfig;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory(false, "recycling");

        Driver driver1 = new Driver("John", "Doe", new BigDecimal(12500));
        Driver driver2 = new Driver("David", "Rasmussen", new BigDecimal(8839));

        try (var em = emf.createEntityManager();) {
            em.getTransaction().begin();
            em.persist(driver1);
            em.persist(driver2);
            em.getTransaction().commit();
        }
    }
}
