package com.example.demo_2.domain;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Data

public class Tv extends Monitor{
    public Tv (){
    super();
}
    public Tv(String marca, String colore,ArrayList<Canale> canales){
        super(marca, colore);
        this.canales = canales;
    }
    private List<Canale> canales = new ArrayList<Canale>();

    public void addChannel(Canale canale){
        try{
            for (Canale can : canales){
                if (can.getNome().equals(canale.getNome())){
                    throw new Exception("Canale già esistente");
                }
            }
            canales.add(canale);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void rimuoviCanale(String nome){
        for(int i=0; i < canales.size(); i++){
            if(canales.get(i).getNome().equals(nome)) {
                canales.remove(i);
            }
        }
    }

}
