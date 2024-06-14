package com.pruevaTecnica.Nasa.controlers;


import com.pruevaTecnica.Nasa.dto.ComandDto;
import com.pruevaTecnica.Nasa.dto.RoverDto;
import com.pruevaTecnica.Nasa.models.Rover;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoverConroller {
    @PostMapping("api/rover/")
    public void create(@RequestBody RoverDto rover){
       System.out.println(rover);
    }
    @PostMapping("api/rover/comand/")
    public void comand(@RequestBody ComandDto comands){
        System.out.println(comands);
    }
    @GetMapping("api/rover/")
    public Rover getRover(){
        return  null;
    }
}
