/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;

/**
Tarea: Crear una nave con 50 unidades de combustible, intentar avanzar sin
recargar, luego recargar y avanzar correctamente. Mostrar el estado al final.
 */
public class MainEj5 {
    public static void main(String[] args) {
        NaveEspacial nave = new NaveEspacial("Free Roal", 50);
        nave.mostrarEstado();
        nave.avanzar(30); 
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(20);
        nave.mostrarEstado();
    }
}

