package com.pruevaTecnica.Nasa.controlers;

import com.pruevaTecnica.Nasa.dto.ObstacleDto;
import com.pruevaTecnica.Nasa.dto.RoverDto;
import com.pruevaTecnica.Nasa.models.Obstacle;
import com.pruevaTecnica.Nasa.servicis.ObstacleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ObstacleController {

    @Autowired
   private ObstacleService ObstacleService;

    @PostMapping("api/obstacle/")
    public void create(@RequestBody ObstacleDto obstacle){
        ObstacleService.create();
    }
    @GetMapping("api/obstacle/")
    public List<Obstacle> get(){
       return ObstacleService.get();

    }
}
