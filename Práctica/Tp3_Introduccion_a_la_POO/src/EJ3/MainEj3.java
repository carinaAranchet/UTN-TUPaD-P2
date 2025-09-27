/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author Carina Aranchet
 */
public class MainEj3 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Libro 1", "Carina Aranchet", 1967);

        libro1.mostrarInfo();

        libro1.setAnioPublicacion(-1500);

        libro1.setAnioPublicacion(1985);

        libro1.mostrarInfo();
    }
}

