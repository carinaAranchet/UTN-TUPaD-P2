/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacion_estructurada;

/**
 *
 * @author Carina Aranchet
 */
public class Ej12 {

    // a. Declare e inicialice un array con los precios de algunos productos. 
    public static double[] inicializarPrecios() {
        return new double[]{199.99, 299.5, 149.75, 399.0, 89.99};
    }

    // b. Muestre los valores originales de los precios.
    public static void mostrarPrecios(double[] precios, String mensaje) {
        System.out.println(mensaje);
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    }

    // c. Modifique el precio de un producto específico.
    public static void modificarPrecio(double[] precios, int indice, double nuevoValor) {
        if (indice >= 0 && indice < precios.length) {
            precios[indice] = nuevoValor;
        } else {
            System.out.println("Índice invalido, no se modifico ningún precio.");
        }
    }

    public static void main(String[] args) {

        double[] precios = inicializarPrecios();
        mostrarPrecios(precios, "Precios originales:");
        modificarPrecio(precios, 2, 129.99);
        mostrarPrecios(precios, "\nPrecios modificados:");
        
    }
}

