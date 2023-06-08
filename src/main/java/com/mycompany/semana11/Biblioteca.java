package com.mycompany.semana11;

import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {

    ArrayList<Libro> listaLibros = new ArrayList<Libro>();
    ArrayList<Lector> listaLectores = new ArrayList<Lector>();

    public void añadirLibro(String titulo, String autor, String genero, int numCopias) {
        listaLibros.add(new Libro(titulo, autor, genero, numCopias));
    }

    public void añadirLector(String nombre, int numID, Date fechaNacimiento) {
        listaLectores.add(new Lector(nombre, numID, fechaNacimiento));
    }

    public void prestamo(int numID, Date fechaPrestamo, Date fechaVencimiento, String libro, boolean estado) {
        listaLectores.get(numID).añadirPrestamo(fechaPrestamo, fechaVencimiento, libro, estado);
    }

    public void getLibros() {
        for (Libro i : listaLibros) {
            i.info();
        }
    }

    public void getLectores() {
        for (Lector e : listaLectores) {
            e.infoLector();
        }
    }
    public void getPrestamos(int numID){
        listaLectores.get(numID).infoPrestamos();
    }
}
