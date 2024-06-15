package com.pruevaTecnica.Nasa.servicis;

import com.pruevaTecnica.Nasa.models.Obstacle;
import com.pruevaTecnica.Nasa.models.Rover;
import com.pruevaTecnica.Nasa.repository.ObstacleRepository;
import com.pruevaTecnica.Nasa.repository.RoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoverServicesImp implements RoverService {
    @Autowired
    private RoverRepository repository;
    @Override
    public Rover getRover() {
        List<Rover> roverList = repository.findAll();
      return   roverList.get(0);

    }
}
