package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Equipo implements Serializable {
    private int id;
    private String nombre;
    private String localidad;
    private Date creacion;
    private ArrayList listaJugadores;

    public Equipo() {
    }

    public Equipo(int numEquipo, String nombre, String localidad, Date creacion) {
        this.id = numEquipo;
        this.nombre = nombre;
        this.localidad = localidad;
        this.creacion = creacion;
        listaJugadores = new ArrayList();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Date getCreacion() {
        return creacion;
    }

    public ArrayList getListaJugadores() {
        return listaJugadores;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public void setListaJugadores(ArrayList listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public void altaJugador(Jugador j){
        listaJugadores.add(j);
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", nombre=" + nombre + ", localidad=" + localidad + ", creacion=" + creacion + '}' + "\n";
    }
}