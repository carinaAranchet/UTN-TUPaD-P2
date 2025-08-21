/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1_introduccion_java;

import java.util.Scanner;

/**
 *
 * @author Carina Aranchet
 */
public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Primer numero entero: ");
        int num1 = scanner.nextInt();
        System.out.print("Segundo numero entero: ");
        int num2 = scanner.nextInt();  
        
        int divisionEntera = num1 / num2;
        
        double divisionDecimal = (double) num1 / num2;
        
        System.out.println("Resultado con int: " + divisionEntera);
        System.out.println("Resultado con double: " + divisionDecimal);
        
    }
    
    
}
