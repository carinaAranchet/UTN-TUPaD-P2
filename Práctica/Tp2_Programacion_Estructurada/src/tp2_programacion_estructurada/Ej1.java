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

public class Ej1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un anio: ");
        int anio = sc.nextInt();

        boolean bisiesto = (anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);

        System.out.println("El anio " + anio + (bisiesto ? " es bisiesto." : " no es bisiesto."));
        sc.close();
    } 
}
