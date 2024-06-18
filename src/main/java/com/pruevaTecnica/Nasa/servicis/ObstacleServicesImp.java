package com.pruevaTecnica.Nasa.servicis;

import com.pruevaTecnica.Nasa.dto.ObstacleDto;
import com.pruevaTecnica.Nasa.models.Obstacle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.pruevaTecnica.Nasa.repository.ObstacleRepository;
@Service
public class ObstacleServicesImp implements ObstacleService {

    @Autowired
    private  ObstacleRepository ObstacleRepository;

    @Override
    public List<Obstacle> get() {
       return ObstacleRepository.findAll();
    }


}
