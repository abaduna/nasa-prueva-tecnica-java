package com.pruevaTecnica.Nasa.servicis;

import com.pruevaTecnica.Nasa.dto.ComandDto;
import com.pruevaTecnica.Nasa.models.Rover;



public interface RoverService {
    public Rover getRover();
    public void comand(ComandDto comand);
}
