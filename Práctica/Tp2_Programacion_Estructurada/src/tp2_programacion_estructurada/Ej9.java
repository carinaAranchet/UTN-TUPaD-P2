/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_programacion_estructurada;

/**
 *
 * @author Carina Aranchet
 */
import java.util.Scanner;

public class Ej9 {

    // a) Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5.0;
        } else if (zona.equalsIgnoreCase("Internacional")) {
            return peso * 10.0;
        } else {
            System.out.println("Zona inválida. Se considera costo 0.");
            return 0.0;
        }
    }

    // b) Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        System.out.print("Ingrese la zona de envio (Nacional/Internacional): ");
        String zona = sc.nextLine();


        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);


        System.out.println("El costo de envio es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
}

