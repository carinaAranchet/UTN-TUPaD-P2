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

public class Ej6 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, cer = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            int n = sc.nextInt();
            if (n > 0) pos++;
            else if (n < 0) neg++;
            else cer++;
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cer);
        sc.close();
    }
    
}
