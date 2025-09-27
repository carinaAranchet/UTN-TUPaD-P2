/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
 *
 * @author Carina Aranchet
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
 
    public void ponerHuevo(){
        this.huevosPuestos++;
    }
    
    public void envejecer(){
        this.edad++;
    }
    
    public void mostrarEstado() {
        System.out.println("Gallina ID: " + idGallina);
        System.out.println("Edad: " + edad + " anios");
        System.out.println("Huevos puestos: " + huevosPuestos);
        System.out.println("----------------------------");
    }
}
