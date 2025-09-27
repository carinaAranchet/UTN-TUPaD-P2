/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;

/**
 *
 * @author Carina Aranchet
 */
public class MainEj2 {
    public static void main(String[] args) {

        Mascota m1 = new Mascota();
        m1.nombre = "Luna";
        m1.especie = "Gato";
        m1.edad = 2;

        m1.mostrarInfo();

        m1.cumplirAnios();
        m1.cumplirAnios(); 

        m1.mostrarInfo();
    }
}

