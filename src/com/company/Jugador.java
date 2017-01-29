package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Jugador {
    private int id;
    private String nombre;
    private String apellidos;
    private Date birthday;
    private Integer canastas;
    private Integer asistencias;
    private Integer rebotes;
    private String posicion;

    public Jugador() {
    }

    public Jugador(int numJugador, String nombre, Date nacimiento, String posicion) {
        this.id = numJugador;
        this.nombre = nombre;
        this.birthday = nacimiento;
        this.posicion = posicion;
    }
    public Jugador(int numJugador, String nombre, Date nacimiento, int canastas, int rebote, int asistencias, String posicion) {
        this(numJugador, nombre, nacimiento, posicion);
        this.canastas = canastas;
        this.rebotes = rebote;
        this.asistencias = asistencias;
        this.posicion = posicion;
    }

    public int getId() {return id;}
    public String getNombre() {return nombre;}
    public String getApellidos() {return apellidos;}
    public Date getBirthday() {return birthday;}
    public Integer getCanastas() {return canastas;}
    public Integer getAsistencias() {return asistencias;}
    public Integer getRebotes() {return rebotes;}
    public String getPosicion() {return posicion;}

    public void setId(int id) {this.id = id;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellidos(String apellidos) {this.apellidos = apellidos;}
    public void setBirthday(Date birthday) {this.birthday = birthday;}
    public void setCanastas(Integer canastas) {this.canastas = canastas;}
    public void setAsistencias(Integer asistencias) {this.asistencias = asistencias;}
    public void setRebotes(Integer rebotes) {this.rebotes = rebotes;}
    public void setPosicion(String posicion) {this.posicion = posicion;}

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", birthday=" + birthday +
                ", canastas=" + canastas +
                ", asistencias=" + asistencias +
                ", rebotes=" + rebotes +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}