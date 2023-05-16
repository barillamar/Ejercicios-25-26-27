package com.example.sesionesdel22al27.services;

import com.example.sesionesdel22al27.entities.Coche;
import com.example.sesionesdel22al27.repositories.CochesDB;
import com.example.sesionesdel22al27.repositories.CochesDBMemoria;

import java.util.ArrayList;

public class Coches {
    CochesDB cochesDB = new CochesDBMemoria();

    public void Coches(CochesDB cochesDB) {
        this.cochesDB = cochesDB;
    }

    private void Coches() {}

    public ArrayList<Coche> listarCoches() {
        return cochesDB.obtener();
    }

    public Coche obtenerCoche(String nombre) {
        Coche coche = new Coche();
        coche.modelo = nombre;

        return cochesDB.buscar(coche);
    }

    public void crearCoche(Coche coche) {
        if (cochesDB.buscar(coche) != null) {
            return;
        }
        cochesDB.insertar(coche);
    }

    public void borrarCoche(String nombre) {
        Coche coche = new Coche();
        coche.modelo = nombre;

        cochesDB.borrar(coche);
    }
}
