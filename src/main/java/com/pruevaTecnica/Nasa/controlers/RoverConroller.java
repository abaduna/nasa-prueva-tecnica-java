package com.pruevaTecnica.Nasa.controlers;


import com.pruevaTecnica.Nasa.dto.ComandDto;
import com.pruevaTecnica.Nasa.dto.RoverDto;
import com.pruevaTecnica.Nasa.models.Rover;
import com.pruevaTecnica.Nasa.servicis.RoverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class RoverConroller {

    @Autowired
    private RoverService service;


    @PostMapping("api/rover/comand/")
    public void comand(@RequestBody ComandDto comands){
        service.comand(comands);
    }
    @GetMapping("api/rover/")
    public Rover getRover(){
       return service.getRover();
    }
}
