/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;
import javax.swing.JOptionPane;


/**
 *
 * @author danic
 * Daniela Cubillo
 * Leonardo Cordoba
 * Andrew Bocker
 * Kevin Ramirez
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        
        //Variables de usuario
        int num = 0;

        //Variables de sistema
        int posit = 0;
        int negat = 0;
        int suma = 0;

        for (int i = 1; i <=10; i++) {
            System.out.print("Digite el número " + i + ": ");
            num = Teclado.LeerEntero(); //Llamado de la clase Teclado y lectura de numeros ingresados
            suma = suma + num; //Suma de los números

            //Conteo de positivos y negativos
            if (num > 0) {
                posit++;
            } else {
                negat++;
            }
        }
        JOptionPane.showMessageDialog(null, "La suma de los 10 números es: " + suma
        + "\nCantidad de números positivos: " + posit + "\nCantidad de números negativos: " + negat);
    }
}