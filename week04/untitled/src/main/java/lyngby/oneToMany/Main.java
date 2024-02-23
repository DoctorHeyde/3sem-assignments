package lyngby.oneToMany;

import jakarta.persistence.EntityManagerFactory;
import lyngby.HibernateConfig;


public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory(false, "onetomany");

        Students students = new Students("Alex", 21);
        Students students1 = new Students("Lauritz", 25);
        Classroom classroom = new Classroom("2A");

        classroom.addStudent(students);
        classroom.addStudent(students1);

        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(classroom);
            em.persist(students);
            em.persist(students1);
            em.getTransaction().commit();
        }
    }
}
