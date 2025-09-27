package EJ1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Carina Aranchet
 */
public class MainEj1 {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante();
        e1.nombre = "Carina";
        e1.apellido = "A.";
        e1.curso = "Programacion 1";
        e1.calificacion = 7.5;

        e1.mostrarInfo();

        e1.subirCalificacion(1.0);   
        e1.mostrarInfo();

        e1.bajarCalificacion(3.0);   
        e1.mostrarInfo();
    }
}
