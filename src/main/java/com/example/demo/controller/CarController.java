package com.example.demo.controller;

import com.example.demo.models.Car;
import com.example.demo.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/cars")
public class CarController {
    @Autowired
    private CarRepo carRepo;

    @GetMapping
    public ResponseEntity<Iterable<Car>> Get(){
        return new ResponseEntity<>(carRepo.findAll(), HttpStatus.OK);
    }

}
