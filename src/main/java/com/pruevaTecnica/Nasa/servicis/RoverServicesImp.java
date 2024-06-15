package com.pruevaTecnica.Nasa.servicis;

import com.pruevaTecnica.Nasa.dto.ComandDto;

import com.pruevaTecnica.Nasa.models.Obstacle;
import com.pruevaTecnica.Nasa.models.Rover;

import com.pruevaTecnica.Nasa.repository.ObstacleRepository;
import com.pruevaTecnica.Nasa.repository.RoverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class RoverServicesImp implements RoverService {
    @Autowired
    private RoverRepository repository;

    @Autowired
    private ObstacleRepository ObstacleRepository;
    @Override
    public Rover getRover() {
        List<Rover> roverList = repository.findAll();
      return   roverList.get(0);

    }
    private  boolean colision(int x,int y){
       List<Obstacle> obtacle = ObstacleRepository.findAll();

        for (Obstacle obstacle : obtacle) {
            if (obstacle.getX() == x && obstacle.getY() == y) {
                return true;
            }
        }
        return  false;
    }
    @Override
    public void comand(ComandDto comand) {
        Optional<Rover> optionalRover = repository.findById(1L);
        if (Objects.equals(comand.getDirection(), "N")){
            if (optionalRover.isPresent()) {

                Rover existingRover = optionalRover.get();

                existingRover.setY(existingRover.getY() + 100);

                if (colision(existingRover.getX(), existingRover.getY() + 100)){
                    System.out.println("colision");
                    return;
                }
                repository.save(existingRover);
            }
        } else if (Objects.equals(comand.getDirection(), "S")) {
            if (optionalRover.isPresent()) {

                Rover existingRover = optionalRover.get();

                existingRover.setY(existingRover.getY() -100);

                if (colision(existingRover.getX(), existingRover.getY() -100)){
                    System.out.println("colision");
                    return;
                }
                repository.save(existingRover);
            }
        } else if (Objects.equals(comand.getDirection(), "W")) {
            if (optionalRover.isPresent()) {

                Rover existingRover = optionalRover.get();

                existingRover.setX(existingRover.getX() -100);

                if (colision(existingRover.getX() -100,existingRover.getY())){
                    System.out.println("colision");
                    return;
                }
                repository.save(existingRover);
            }
        } else if (Objects.equals(comand.getDirection(), "E")) {
            if (optionalRover.isPresent()) {

                Rover existingRover = optionalRover.get();

                existingRover.setX(existingRover.getX() +100);

                if (colision(existingRover.getX() + 100,existingRover.getY())){
                    System.out.println("colision");
                    return;
                }
                repository.save(existingRover);
            }
        }


    }
}
