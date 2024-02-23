package lyngby.oneToOne;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "teacher_name")
    private String name;

    @OneToOne
    private Course course;

    public Teacher(String name) {
        this.name = name;
    }


    public void setCourse(Course course) {
        if (course != null) {
            this.course = course;
        }

    }

    public void addCourse(Course course) {
        this.course = course;
        if (course.getTeacher() != this) {
            course.setTeacher(this);
        }
    }
}
