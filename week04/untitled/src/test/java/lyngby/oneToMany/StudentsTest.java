package lyngby.oneToMany;

import jakarta.persistence.EntityManagerFactory;
import lyngby.HibernateConfig;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    private static EntityManagerFactory emfTest;
    private static StudentDao studentDao;

    @BeforeEach
    void setUp() {
        emfTest = HibernateConfig.getEntityManagerFactory(true, "onetomany");
        studentDao = StudentDao.getInstance(emfTest);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getName() {
    }

    @Test
    void getAge() {
    }
}