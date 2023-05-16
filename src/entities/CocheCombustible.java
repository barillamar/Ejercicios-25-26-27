package com.example.sesionesdel22al27.entities;

import com.example.sesionesdel22al27.repositories.CochesDB;

public class CocheCombustible extends Coche {

    public void llenarTanque(){
        System.out.println("Llenando el tanque del coche de combustible");
        int capacidadDeposito = 100;
    }
}
