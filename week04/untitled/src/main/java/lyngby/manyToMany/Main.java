package lyngby.manyToMany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import lyngby.HibernateConfig;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory(false, "manytomany");

        Course math = new Course("math", 5);
        Course danish = new Course("danish", 3);
        Course english = new Course("english", 6);

        Students Peter = new Students("Peter", 22);
        Students Donald = new Students("Donald", 23);

        Peter.addCourse(math);
        Donald.addCourse(danish);
        Peter.addCourse(english);
        Donald.addCourse(english);

        try (var em = emf.createEntityManager();) {
            em.getTransaction().begin();
            em.persist(math);
            em.persist(danish);
            em.persist(english);
            em.persist(Peter);
            em.persist(Donald);
        }
    }
}
