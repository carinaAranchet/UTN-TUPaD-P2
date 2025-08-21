/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author Carina Aranchet
 */
public class PrimerEjecicio {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int anioNacimiento,anioActual,edadUsuario;
        anioActual = 2025;
        
        System.out.print("Ingrese anio de nacimiento: ");
        anioNacimiento = Integer.parseInt(input.nextLine());
        
        edadUsuario = anioActual - anioNacimiento;
        
        System.out.println("Tu edad es "+ edadUsuario+" anios");
    }
    
}
