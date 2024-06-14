package com.pruevaTecnica.Nasa.controlers;

import com.pruevaTecnica.Nasa.dto.ObstacleDto;
import com.pruevaTecnica.Nasa.dto.RoverDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ObstacleController {
    @PostMapping("api/obstacle/")
    public void create(@RequestBody ObstacleDto obstacle){
        System.out.println(obstacle);
    }
}
