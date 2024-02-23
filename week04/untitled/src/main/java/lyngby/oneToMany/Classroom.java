package lyngby.oneToMany;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "classroom")
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "classroom_name")
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "classroom_id")
    private static Set<Students> students = new HashSet<>();

    public Classroom(String name){
        this.name = name;
    }

    public void addStudent(Students student){
        if(student != null){
            students.add(student);
        }
    }


}