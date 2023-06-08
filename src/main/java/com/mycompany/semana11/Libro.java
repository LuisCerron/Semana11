package com.mycompany.semana11;
public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int numCopias;

    public Libro(String titulo, String autor, String genero, int numCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numCopias = numCopias;
    }
    public void info(){
        System.out.println("titulo: "+this.titulo);
        System.out.println("autor: "+this.autor);
        System.out.println("genero: "+this.genero);
        System.out.println("numCopias: "+this.numCopias);
    } 
}
