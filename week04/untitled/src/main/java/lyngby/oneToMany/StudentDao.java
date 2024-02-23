package lyngby.oneToMany;

import jakarta.persistence.EntityManagerFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class StudentDao {

    private static EntityManagerFactory emf;

    private static StudentDao instance;

    public  static StudentDao getInstance(EntityManagerFactory emf){
        if(instance == null){
            emf = emf;
            instance = new StudentDao();
        }
        return instance;
    }
    public void create(Students students) {

    }
}
