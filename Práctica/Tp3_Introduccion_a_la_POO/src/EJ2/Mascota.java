/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;

/**
 Tarea: Crear un libro, intentar modificar el año con un valor inválido y luego con
uno válido, mostrar la información final.
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;


    public void mostrarInfo() {
        System.out.println("Mascota: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("---------------------------");
    }

    public void cumplirAnios() {
        edad++;
    }
}