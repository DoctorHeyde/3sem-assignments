package lyngby.oneToManyBidirectional;

import jakarta.persistence.EntityManagerFactory;
import lyngby.HibernateConfig;

public class Main {
    public static void main(String[] args){
        EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory(false, "onetomanyBidirectional");

        Company company = new Company("Apple");
        Car car1 = new Car("Corella");
        Car car2 = new Car("Honda");
    }
}
