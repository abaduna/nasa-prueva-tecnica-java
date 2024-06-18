package com.pruevaTecnica.Nasa.controlers;

import com.pruevaTecnica.Nasa.dto.ObstacleDto;
import com.pruevaTecnica.Nasa.dto.RoverDto;
import com.pruevaTecnica.Nasa.models.Obstacle;
import com.pruevaTecnica.Nasa.servicis.ObstacleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class ObstacleController {

    @Autowired
   private ObstacleService ObstacleService;


    @GetMapping("api/obstacle/")
    public List<Obstacle> get(){
       return ObstacleService.get();

    }
}
