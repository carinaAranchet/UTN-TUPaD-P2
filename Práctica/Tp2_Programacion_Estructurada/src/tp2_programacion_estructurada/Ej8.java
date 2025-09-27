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

public class Ej8 {


    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto / 100 ) - (precioBase * descuento / 100 );
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
        double descuento = sc.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }
}
