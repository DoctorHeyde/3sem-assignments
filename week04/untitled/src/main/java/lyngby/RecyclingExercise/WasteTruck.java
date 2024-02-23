package lyngby.RecyclingExercise;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "truck")
public class WasteTruck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "capactiy", nullable = false)
    private int capacity;

    @Column(name = "is_avaible")
    private boolean isAvaible;

    @Column(name = "registration_number", nullable = false)
    private int registationNumber;

    public WasteTruck(String brand, int capacity, int registationNumber){
        this.brand = brand;
        this.capacity = capacity;
        this.registationNumber = registationNumber;
    }

    public WasteTruck(String id) {

    }
}