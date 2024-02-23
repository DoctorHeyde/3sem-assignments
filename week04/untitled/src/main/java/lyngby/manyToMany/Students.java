package lyngby.manyToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "students")
@NoArgsConstructor
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "age", nullable = false)
    private  int age;

    public Students(String name, int age){
        this.name = name;
        this.age = age;
    }

    @ManyToMany(mappedBy = "students")
    @ToString.Exclude
    private Set<Course> courses = new HashSet<>();

    public void addCourse(Course course){
    }
}