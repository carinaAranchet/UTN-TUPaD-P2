/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacion_estructurada;

/**
 *
 * @author Carina Aranchet
 */
public class Ej13 {

    // a. Declare e inicialice un array con los precios de algunos productos. 
    public static double[] inicializarPrecios() {
        return new double[]{199.99, 299.5, 149.75, 399.0, 89.99};
    }

    // b. Use una función recursiva para mostrar los precios originales. 
    public static void mostrarPreciosRecursivo(double[] precios, int indice, String mensaje) {
        if (indice == 0) { 
            System.out.println(mensaje);
        }
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPreciosRecursivo(precios, indice + 1, mensaje);
        }
    }

    // c. Modifique el precio de un producto específico. 
    public static void modificarPrecio(double[] precios, int indice, double nuevoValor) {
        if (indice >= 0 && indice < precios.length) {
            precios[indice] = nuevoValor;
        } else {
            System.out.println("Índice invalido, no se modificó ningún precio.");
        }
    }

    public static void main(String[] args) {

        double[] precios = inicializarPrecios();
        mostrarPreciosRecursivo(precios, 0, "Precios originales:");
        modificarPrecio(precios, 2, 129.99);
        mostrarPreciosRecursivo(precios, 0, "\nPrecios modificados:");
        
    }
}
