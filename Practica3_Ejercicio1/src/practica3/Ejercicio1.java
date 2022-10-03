/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;


/**
 *
 * @author danic
 * Daniela Cubillo
 * Leonardo Cordoba
 * Andrew Bocker
 * Kevin Ramirez
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        // Solicitud de números
        int numero1 = 0;
        int numero2 = 1;
       
        while (numero1 !=numero2){
            System.out.println("Introduzca el numero 1:");
            numero1 = Teclado.LeerEntero();

            System.out.println("Introduzca el numero 2:");
            numero2 = Teclado.LeerEntero();
        }
        System.out.println("Finalmente...Los numeros son iguales =)");
    }
}
    
    

