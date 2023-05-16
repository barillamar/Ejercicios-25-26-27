package com.example.sesionesdel22al27.repositories;

import com.example.sesionesdel22al27.entities.Coche;

import java.util.ArrayList;

public class CochesDBMemoria extends CochesDB {
    private ArrayList<Coche> coches = new ArrayList();

    public ArrayList<Coche> obtener() {
        return coches;
    }

    @Override
    public Coche buscar(Coche coche) {
        for (Coche nombre : obtener()) {
            if (nombre.modelo.equalsIgnoreCase(coche.modelo)) {
                return nombre;
            }
        }
        return null;
    }

    public void insertar(Coche coche) {
        for (Coche nombre : coches) {
            if (nombre.modelo.toLowerCase().equals(coche.modelo.toLowerCase())) {
                return;
            }
        }

        coches.add(coche);
    }

    public void borrar(Coche coche) {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).modelo.equalsIgnoreCase(coche.modelo)) {
                coches.remove(i);
            }
        }

    }

}
