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

public class Ej4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoria (A/B/C): ");
        String cat = sc.next().trim().toUpperCase();

        double pct = switch (cat) {
            case "A" -> 0.10;
            case "B" -> 0.15;
            case "C" -> 0.20;
            default -> 0.0;
        };

        double descuento = precio * pct;
        double finalP = precio - descuento;

        System.out.println("Descuento aplicado: " + (pct * 100) + "%");
        System.out.println("Precio final: " + finalP);
        sc.close();
    }
    
}
