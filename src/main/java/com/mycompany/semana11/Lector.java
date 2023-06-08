package com.mycompany.semana11;

import java.util.ArrayList;
import java.util.Date;

public class Lector {
    private String nombre;
    private int numID;
    private Date fechaNacimiento;
    ArrayList<Prestamo> listaPrestamos = new ArrayList<Prestamo>();

    public Lector(String nombre, int numID, Date fechaNacimiento) {
        this.nombre = nombre;
        this.numID = numID;
        this.fechaNacimiento = fechaNacimiento;
    }
    public void añadirPrestamo(Date fechaPrestamo, Date fechaVencimiento, String libro, boolean estado){
        listaPrestamos.add(new Prestamo(fechaPrestamo,fechaVencimiento,libro,estado));
    }
    public void infoLector(){
        System.out.println("nombre: "+this.nombre);
        System.out.println("ID: "+this.numID);
        System.out.println("fecha de nacimiento: "+this.fechaNacimiento);
    }
    public void infoPrestamos(){
        for (Prestamo e : listaPrestamos) {
            e.info();
        }
    }
}
