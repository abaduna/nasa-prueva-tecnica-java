package com.pruevaTecnica.Nasa.repository;

import com.pruevaTecnica.Nasa.models.Obstacle;
import com.pruevaTecnica.Nasa.models.Rover;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoverRepository extends JpaRepository<Rover,Long> {
}
