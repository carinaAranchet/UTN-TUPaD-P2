/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
a. Crear una clase Gallina con los atributos: idGallina, edad, huevosPuestos
 */
public class MainEj4 {
    public static void main(String[] args) {
        
        Gallina g1 = new Gallina();
        g1.idGallina = 1;
        g1.edad = 2;
        g1.huevosPuestos = 0;
        g1.mostrarEstado();

        Gallina g2 = new Gallina();
        g2.idGallina = 2;
        g2.edad = 1;
        g2.huevosPuestos = 0;
        g2.mostrarEstado();
        
        g1.ponerHuevo();
        g1.ponerHuevo();
        g1.envejecer();

        g2.ponerHuevo();
        g2.envejecer();
        g2.envejecer();

        g1.mostrarEstado();
        g2.mostrarEstado();
    }
}

