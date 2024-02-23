package lyngby.oneToOne;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "course_name")
    private String name;

    @OneToOne
    @MapsId
    private Teacher teacher;

    public Course(String name){this.name =name;}

    public void setTeacher(Teacher teacher){
        if(teacher !=null){
            this.teacher = teacher;
        }
        if(teacher.getCourse() != this) {
            teacher.setCourse(this);
        }
    }
}
