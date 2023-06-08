
package com.mycompany.semana11;

import java.util.Date;

public class Semana11 {

    public static void main(String[] args) {
        Biblioteca biblio1 = new Biblioteca();
        biblio1.añadirLector("Pedro", 0, new Date(2003,10,28));
        biblio1.añadirLibro("Caballero Carmelo", "Abraham Valdelomar", "Ficción", 5);
        biblio1.prestamo(0, new Date(2023,02,28), new Date(2023,10,28), "Caballero Carmelo", true);
        biblio1.getLibros();
        System.out.println("");
        System.out.println("");
        biblio1.getLectores();
        System.out.println("");
        System.out.println("");
        biblio1.getPrestamos(0);
    }
}
