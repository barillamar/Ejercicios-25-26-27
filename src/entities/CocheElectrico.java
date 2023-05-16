package com.example.sesionesdel22al27.entities;

public class CocheElectrico extends Coche{
    private int capacidadBateria;

    public void cargarBateria(int cantidad) {
        System.out.println("Cargando la batería del coche eléctrico con " + cantidad + " kWh");
        capacidadBateria += cantidad;
    }
}
