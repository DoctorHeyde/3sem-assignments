package org.example.jpql;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Query;

import java.util.List;

import static org.example.jpql.Employee.Department.IT;

public class Main {
    public static void main(String[] args) {
        EntityManager em = HibernateConfig.buildEntityFactoryConfig().createEntityManager();
        em.getTransaction().begin();



        em.createNamedQuery = ("Employee.findAll", Employee.class).getResultList().forEach(System.out.println());
        System.out.println("-----------------------------");

        em.close();
    }
}
