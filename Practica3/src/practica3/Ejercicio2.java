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
public class Ejercicio2 {

    public static void main(String[] args) {
        byte i = 0;

        do {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el primer número"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingrese el segundo número"));

            if (num1 != num2) {
                JOptionPane.showMessageDialog(null, "Los dos"
                        + "números son diferentes, ingrese dos números nuevamente");
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "Los dos"
                        + "números son iguales, el proceso se detendrá");
                i = 0;
            }
        } while (i > 0);
    }
}
