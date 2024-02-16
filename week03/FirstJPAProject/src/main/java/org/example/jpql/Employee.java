package org.example.jpql;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "employees")
@NoArgsConstructor
@Getter
@NamedQueries({
        @NamedQuery(
                name = "Employee.findAll",
                query = "SELECT e FROM Employee e"
        ),
        @NamedQuery(
                name = "Employee.findByDepartment",
                query = "select e FROM Employee e where e.department = :department"
        ),
})
@ToString
//@Builder
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "salary", nullable = false)
    private int salary;

    @Enumerated(EnumType.STRING)
    private Department department;

    public Employee(String firstName, String lastName, Department department, int salary, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.email = email;
    }

    enum Department{
        HR,
        Finance,
        IT,
        Sales,
        Marketing
    }
}
