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
public class Ejecicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); // Se cambio nextInt por nextLine
        System.out.println("Hola, " + nombre);
    }
    
}
