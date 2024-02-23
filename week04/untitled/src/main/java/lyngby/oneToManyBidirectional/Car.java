package lyngby.oneToManyBidirectional;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "car")
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "car_name", nullable = false)
    private String carName;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    public Car(String carName){
        this.carName = carName;
    }

    public void setCompany(Company company){

    }

}