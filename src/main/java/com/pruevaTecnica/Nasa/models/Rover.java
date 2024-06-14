package com.pruevaTecnica.Nasa.models;

import lombok.Data;

@Data
public class Rover {
    private  long id;
    private int x;
    private int y;
    private Direction direction;

}
