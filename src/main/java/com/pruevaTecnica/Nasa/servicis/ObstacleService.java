package com.pruevaTecnica.Nasa.servicis;

import com.pruevaTecnica.Nasa.dto.ObstacleDto;
import com.pruevaTecnica.Nasa.models.Obstacle;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


public interface ObstacleService {
    public List<Obstacle> get();

}
