package com.company;

import utilidades.EntradaDatos;
import utilidades.Fichero;

import java.util.Date;

public class Main {

    private static ListaEquipos misEquipos;
    private static Fichero miFicheroEquipos;

    public static void main(String[] args) {
        miFicheroEquipos = new Fichero("basket.xml");
        misEquipos = (ListaEquipos) miFicheroEquipos.leer();

        if (misEquipos == null) {
            misEquipos = new ListaEquipos();
        }
        boolean salir = true;
        do {
            menu();
            int opcion = EntradaDatos.pedirEntero("Elige una opción.");
            switch (opcion) {
                case 1:
                    altaEquipo();
                    break;
                case 2:
                    altaJugador();
                    break;
                case 3:
                    //consultaJugador();
                    break;
                case 4:
                    //consultaEquipo();
                    break;
                case 5:
                    salir = false;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (salir);

    }

    public static void menu() {
        System.out.println("Menu principal");
        System.out.println("1- Alta a un equipo.");
        System.out.println("2- Alta a un jugador.");
        System.out.println("3- Consultas de equipo.");
        System.out.println("4- Consultas de jugador.");
        System.out.println("5- Salir.");
    }

    public static void altaEquipo() {
        int id = EntradaDatos.pedirEntero("Introduce la id de equipo:");
        String nombre = EntradaDatos.pedirCadena("Introduce el nombre del equipo:");
        String localidad = EntradaDatos.pedirCadena("Introduce la localidad del equipo:");
        Date fundado = devolverDate("Introduce la fecha de fundación:");
        System.out.println(fundado);
        Equipo e = new Equipo(id, nombre, localidad, fundado);
        misEquipos.altaEquipo(e);
        miFicheroEquipos.grabar(misEquipos);
        System.out.println("Equipo dado de alta.");
    }

    public static Date devolverDate(String msg) {
        System.out.println(msg);
        int dia = EntradaDatos.pedirEntero("Introduce el dia");
        int mes = EntradaDatos.pedirEntero("Introduce el mes");
        int anyo = EntradaDatos.pedirEntero("Introduce el año");
        Date fecha = new Date(anyo, mes, dia);
        return fecha;
    }

    private static void altaJugador() {
        String nombreEquipo = EntradaDatos.pedirCadena("Introduce el nombre de tu equipo:");
        Equipo e = comprobarExistEquipo(nombreEquipo);
        if (e == null) {
            System.out.println("El equipo no está registrado.");
        } else {
            int id = EntradaDatos.pedirEntero("Introduce la id de jugador:");
            String nombre = EntradaDatos.pedirCadena("Nombre: ");
            String posicion = EntradaDatos.pedirCadena("Posicion: ");
            Date nacido = devolverDate("Introduce la fecha de fundación:");
            int idEquipo = EntradaDatos.pedirEntero("Introducir id equipo");
            Jugador j = new Jugador(id, nombre, nacido, (int) (Math.random() * 40), (int) (Math.random() * 40), (int) (Math.random() * 40), posicion);
            e.altaJugador(j);
            miFicheroEquipos.grabar(misEquipos);
        }
    }

    public static Equipo comprobarExistEquipo(String equipo) {
        for (Equipo e : misEquipos.getListaEquipo()) {
            if (e.getNombre().equalsIgnoreCase(equipo)) {
                return e;
            }
        }
        return null;
    }

}
