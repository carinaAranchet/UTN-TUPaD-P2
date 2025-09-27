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

public class Ej3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        String etapa;
        if (edad < 12) etapa = "Ninio";
        else if (edad <= 17) etapa = "Adolescente";
        else if (edad <= 59) etapa = "Adulto";
        else etapa = "Adulto mayor";

        System.out.println("Eres un " + etapa + ".");
        sc.close();
    }
    
}
