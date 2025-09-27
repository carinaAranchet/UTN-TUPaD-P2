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

public class Ej2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int c = sc.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
        sc.close();
    }
    
}
