package com.mycompany.semana11;

import java.util.Date;

public class Prestamo {
    private Date fechaPrestamo;
    private Date fechaVencimiento;
    private String libro;
    private boolean estado;

    public Prestamo(Date fechaPrestamo, Date fechaVencimiento, String libro, boolean estado) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaVencimiento = fechaVencimiento;
        this.libro = libro;
        this.estado = estado;
    }
    public void info(){
        System.out.println("fecha de prestamo: "+this.fechaPrestamo);
        System.out.println("fecha de vencimiento: "+this.fechaVencimiento);
        System.out.println("Libro: "+this.libro);
        if(this.estado){
            System.out.println("Estado: vigente");
        } else{
            System.out.println("Estado: vencido");
        }
    }
}
