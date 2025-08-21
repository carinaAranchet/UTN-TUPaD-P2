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
public class Ejercicio4 {
    
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        System.out.println("Hola " + nombre + ", tienes " + edad + " anios.");
        
        
    }

}
