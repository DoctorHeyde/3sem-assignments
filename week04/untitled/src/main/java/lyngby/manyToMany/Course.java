package lyngby.manyToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "course")
@NoArgsConstructor
@ToString
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private int duration;

    public Course(String name, int duration){
        this.name = name;
        this.duration = duration;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Set<Students> students = new HashSet<>();

    public  void addStudent(Students st){
        if(st != null){
            students.add(st);
            st.addCourse(this);
        }
    }
}