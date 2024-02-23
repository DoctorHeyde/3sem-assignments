package lyngby.oneToOne;

import jakarta.persistence.EntityManagerFactory;
import lyngby.HibernateConfig;
;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory(false, "relations");

        Teacher teacher = new Teacher("Teacher 1");
        Teacher teacher2 = new Teacher("Teacher 2");
        Course course = new Course("Course 1");
        course.setTeacher(teacher);
        teacher.addCourse(course);

        try (var em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(teacher2);
            em.merge(course);
            em.getTransaction().commit();
            //System.out.println(course1.getTeacher().getName());
        }

        /*try (var em = emf.createEntityManager()) {
            Course course1 = em.find(Course.class, 1);
            em.getTransaction().begin();
            course1.setTeacher(teacher2);
            em.persist(teacher2);
            em.merge(course);
            em.getTransaction().commit();
            //System.out.println(course1.getTeacher().getName());
        }*/
    }
}
