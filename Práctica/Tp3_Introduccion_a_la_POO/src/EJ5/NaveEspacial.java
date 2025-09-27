/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ5;

/**
Crear una clase NaveEspacial con los atributos: nombre, combustible.
Métodos requeridos: despegar(), avanzar(distancia),
recargarCombustible(cantidad), mostrarEstado().
Reglas: Validar que haya suficiente combustible antes de avanzar y evitar que
se supere el límite al recargar
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private final int MAX_COMBUSTIBLE = 100; // límite máximo

    
    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = combustibleInicial;
    }

    public void despegar() {
        if (combustible >= 10) {
            combustible -= 10; // gastar 10 en el despegue
            System.out.println(nombre + " despego(consumio 10 de combustible)");
        } else {
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }

    public void avanzar(int distancia) {
        int consumo = distancia * 2; //2 unidades por cada distancia
        if (combustible >= consumo) {
            combustible -= consumo;
            System.out.println(nombre + " avanzo " + distancia + " km (consumio " + consumo + " de combustible).");
        } else {
            System.out.println("Combustible insuficiente para avanzar " + distancia + " km.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad > MAX_COMBUSTIBLE) {
            combustible = MAX_COMBUSTIBLE;
            System.out.println("Se recargo hasta el maximo (" + MAX_COMBUSTIBLE + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave: " + nombre);
        System.out.println("Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
        System.out.println("----------------------------");
    }
}
