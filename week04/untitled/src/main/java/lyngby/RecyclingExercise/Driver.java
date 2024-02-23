package lyngby.RecyclingExercise;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Check;
import org.hibernate.mapping.CheckConstraint;
import org.hibernate.mapping.Constraint;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, columnDefinition = "ddMMyy-XX-XXL")
    private Integer id;


    @Temporal(TemporalType.DATE)
    @Column(name = "employment_date", columnDefinition = "ddMMyy_XX-XXL")
    private LocalDate employmentDate;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "salary", nullable = false)
    private BigDecimal salary;

    public Driver(String name, String surname, BigDecimal salary){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @ManyToOne
    @JoinColumn(name = "waste_truck_id")
    private WasteTruck wasteTruck;
    public Boolean validateDriverId(String driverId) {
        return driverId.matches("[0-9][0-9][0-9][0-9][0-9][0-9]-[A-Z][A-Z]-[0-9][0-9][0-9][A-Z]");
    }
}