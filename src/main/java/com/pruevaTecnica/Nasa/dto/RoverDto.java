package com.pruevaTecnica.Nasa.dto;

import com.pruevaTecnica.Nasa.models.Direction;
import lombok.Data;

@Data
public class RoverDto {
    private int x;
    private int y;
    private Direction direction;
}
