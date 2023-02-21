package com.example.demo_2.controller;

import com.example.demo_2.domain.Canale;
import com.example.demo_2.domain.Monitor;
import com.example.demo_2.domain.Tv;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.*;

@RestController
public class TvController {
    @GetMapping("/tv")public ResponseEntity<Tv> returnTv() {
        Tv tv= new Tv("samsung", "blu", new ArrayList<Canale>(Arrays.asList(new Canale("Rai 1",1, 1), new Canale("Rai 2",2, 2))));
        return new ResponseEntity<>(tv,HttpStatus.OK);
    }
    @PostMapping("/tv")
    public ResponseEntity<?> createTv(@RequestBody Tv tv){
        Tv tv1 = tv;
        return new ResponseEntity<>(tv1, HttpStatus.CREATED);
    }
    @PutMapping("/add")
    public ResponseEntity<Tv> addCh(@RequestBody Canale canale){
        Tv tv = new Tv("samsung", "blu", new ArrayList<Canale>(),
                new HashMap<String, String>(), LocalTime.of(9, 0));
        tv.addChannel(canale);
        return new ResponseEntity<>(tv, HttpStatus.OK);
    }
    @DeleteMapping()public ResponseEntity<Tv> deleteTv(@RequestBody String nome) {
        ArrayList<Canale> lista = new ArrayList<Canale>();
        lista.add(new Canale("Rai 1", 1, 1));
        lista.add(new Canale("La 7", 7, 7));
        Tv tv = new Tv();
        return new ResponseEntity<>(tv, HttpStatus.OK);}
}
