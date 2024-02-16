package org.example.points;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.awt.*;

@Entity
@Table(name = "points")
@NoArgsConstructor
@ToString
public class Points {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "x", nullable = true)
    private int x;

    @Column(name = "y", nullable = true)
    private int y;

    public Points(int x, int y){
        this.x = x;
        this.y = y;
    }
}
