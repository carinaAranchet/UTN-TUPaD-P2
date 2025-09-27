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

public class Ej5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0, n;
        do {
            System.out.print("Ingrese un numero (0 para terminar): ");
            n = sc.nextInt();
            if (n % 2 == 0) suma += n;
        } while (n != 0);
        System.out.println("La suma de los numeros pares es: " + suma);
        sc.close();
    }
    
}
