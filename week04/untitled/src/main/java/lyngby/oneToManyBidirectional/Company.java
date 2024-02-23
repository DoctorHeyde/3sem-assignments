package lyngby.oneToManyBidirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "company")
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    public Company(String companyName){
        this.companyName = companyName;
    }

    @OneToMany(mappedBy = "company", cascade = CascadeType.PERSIST)
    private Set<Car> cars = new HashSet<>();

    public void addCar(Car car){
        if(car != null){
            cars.add(car);
            car.setCompany(this);
        }
    }
}