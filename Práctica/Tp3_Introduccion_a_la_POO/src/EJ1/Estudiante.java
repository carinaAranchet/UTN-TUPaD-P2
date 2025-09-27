package EJ1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carina Aranchet
 */
public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    double calificacion; 


    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
        System.out.println("------------------------------");
    }

    
    public void subirCalificacion(double puntos) {
        calificacion += puntos;
        if (calificacion > 10) calificacion = 10;
    }


    public void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
    }
}
