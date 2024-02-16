package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import org.example.points.PersonExercise;
import org.example.points.Points;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactoryConfig();
        var em = emf.createEntityManager();
        Person person = new Person("Maria", "Maria@gmail.com", Person.Gender.FEMALE);
         //em.create(person);

        //Person person = em.find(Person.class, 1);
        System.out.println(person);
        /*public void something() {
            em.getTransaction().begin(); // start transaction
            em.persist(person); // save the person
            em.getTransaction().commit(); // commit transaction
            em.close(); // close the entity manager
        }*/



        // LOMBOK EXERCISES
                PersonExercise personExercise = new PersonExercise(" Alexander", " Rasmussen", 21);
                System.out.println(personExercise);

                personExercise.setAge(50);
                System.out.println(personExercise.getAge());
    }
}
