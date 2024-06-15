package com.pruevaTecnica.Nasa.models;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name ="rover")
public class Rover {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @Column(name ="posX")
    private int x;
    @Column(name ="posY")
    private int y;
    @Column(name = "Direction")
    private String direction;

}
