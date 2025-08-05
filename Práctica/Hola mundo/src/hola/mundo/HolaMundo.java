/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;


import java.util.Scanner;
/**
 *
 * @author Carina Aranchet
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //String s = "Primer comentario \n";
        //System.out.print(s);
        //System.out.println("Holis, ahora si me salio");
        /*String a = "Hola"; // aca si o si va doble comilla
        int r = 1;
        double coma = 33.2;
        char car = 'w'; // va con comilla simples
        
        System.out.println("Lo que defini: "+ a +" "+ r +" "+ coma +" "+ car+" .");*/
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre= input.nextLine();
        
        System.out.print("Edad:");
        int edad;
        edad = Integer.parseInt(input.nextLine())   ;
        
        System.out.println("El nombre ingresado es: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("\"Hola, esto es una cita\"");
        
    }
    
}
