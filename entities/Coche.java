package com.example.sesionesdel22al27.entities;

public class Coche {
    public String modelo;
    public String marca;
    public int velocidad;
    public boolean luces;
    public boolean bateria;

    @Override
    public String toString() {
        return "modelo: " + modelo + "\r\n"
                + "marca: " + marca + "\r\n"
                + "velocidad " + velocidad + "\r\n"
                + "luces: " + luces + "\r\n"
                + "bateria: " + bateria + "\r\n";
    }


}

