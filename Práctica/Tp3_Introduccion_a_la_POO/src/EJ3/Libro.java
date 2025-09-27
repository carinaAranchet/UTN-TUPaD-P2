/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
a. Crear una clase Libro con atributos privados: titulo, autor,
añoPublicacion.
Métodos requeridos: Getters para todos los atributos. Setter con validación
para añoPublicacion.
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); 
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

     public void setAnioPublicacion(int anio) {
        if (anio > 0 && anio <= 2025) { 
            this.anioPublicacion = anio;
        } else {
            System.out.println("️Anio de publicacion invalido: " + anio);
        }
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio de publicacion: " + anioPublicacion);
        System.out.println("---------------------------");
    }
    
    
    
}
