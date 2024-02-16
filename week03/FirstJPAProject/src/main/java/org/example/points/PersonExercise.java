package org.example.points;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonExercise {
    private String firstName;
    private String lastName;
    private int age;
}