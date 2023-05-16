package com.example.sesionesdel22al27.repositories;

import com.example.sesionesdel22al27.entities.Coche;

import java.util.ArrayList;

abstract public class CochesDB {

    abstract public ArrayList<Coche> obtener();

    abstract public Coche buscar(Coche coche);

    abstract public void insertar(Coche coche);

    abstract public void borrar(Coche coche);

}
