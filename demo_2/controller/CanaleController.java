package com.example.demo_2.controller;

import com.example.demo_2.domain.Canale;
import com.example.demo_2.domain.Tv;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CanaleController {
    @GetMapping("/canale")
    public ResponseEntity<Canale> returnCanale(){
        Canale canale = new Canale("Rete 4", 4, 4);

        return new ResponseEntity<>(canale, HttpStatus.OK);
    }
    @PutMapping("/canale/{id}")
    public ResponseEntity<?> updateTv(@PathVariable long id_canale, @RequestBody Canale canale){
        Canale canale2 = new Canale("tv8", 8, 8);
        if (canale2.getId() == id_canale)
            return new ResponseEntity<>(canale2, HttpStatus.OK);
        return new ResponseEntity<>(canale, HttpStatus.NO_CONTENT);
    }
    @PostMapping("/canale")
    public ResponseEntity<?> createCanale(@RequestBody Canale canale){
        Canale canale1 = canale;
        return new ResponseEntity<>(canale1, HttpStatus.CREATED);
    }


}
