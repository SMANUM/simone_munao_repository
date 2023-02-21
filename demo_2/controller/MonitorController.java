package com.example.demo_2.controller;

import com.example.demo_2.domain.Canale;
import com.example.demo_2.domain.Monitor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {
    @GetMapping("/monitor")
    public ResponseEntity<Monitor> returnMonitor(){
        Monitor monitor = new Monitor("apple", "rosso");
        return new ResponseEntity<>(monitor, HttpStatus.OK);
    }
    @PostMapping("/canale")
    public ResponseEntity<?> createMonitor(@RequestBody Monitor monitor){
        Monitor monitor1 = monitor;
        return new ResponseEntity<>(monitor1, HttpStatus.CREATED);
    }
}

