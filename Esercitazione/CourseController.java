package com.ntt.springbootdemo.controller;

import com.ntt.springbootdemo.domain.Course;
import com.ntt.springbootdemo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;
    @PostMapping("/corso1")public ResponseEntity<?> create(@RequestBody Course corso) {
        if (corso.getNome()!= corso.getNome()) {
            courseRepository.save(corso);
            return new ResponseEntity<>(corso, HttpStatus.CREATED);
        }
        System.out.println("error:duplicate");
        return new ResponseEntity<>(corso, HttpStatus.NO_CONTENT);
    }

    //controller
    @PostMapping("/corso2")
    public ResponseEntity<?> findAll() {
        List<Course> courseList = courseRepository.findAll();
        return new ResponseEntity<>(courseList, HttpStatus.OK);
    }

    @PostMapping("/corso3")public ResponseEntity<?> create1(@RequestBody Course corso) {
        if (corso.getNome().contains("corso_") && corso.getNome().length() > 8) {
            courseRepository.save(corso);
            return new ResponseEntity<>(corso, HttpStatus.CREATED);
        }
        return new ResponseEntity<>(corso, HttpStatus.NO_CONTENT);
    }
    @GetMapping("/corso4")
    public ResponseEntity<?> returnNumeri(){
        List<Course> listaCourse = courseRepository.findAll();
        return new ResponseEntity<>(listaCourse.size(), HttpStatus.OK);}

    @PostMapping("/corso5")public ResponseEntity<?> findAll2(@RequestBody Course corso) {
        if (corso.getNome().contains("corso_")) {
            List<Course> courseList = courseRepository.findAll();
            return new ResponseEntity<>(courseList, HttpStatus.OK);
        }
        return new ResponseEntity<>(corso, HttpStatus.NO_CONTENT);
    }

    @PostMapping("/corso6")public ResponseEntity<?> findAll3(@RequestBody Course corso) {
        if (corso.getDescrizione().length() < 20) {
            List<Course> courseList = courseRepository.findAll();
            return new ResponseEntity<>(courseList, HttpStatus.OK);
        }
        return new ResponseEntity<>(corso, HttpStatus.NO_CONTENT);
    }

}
