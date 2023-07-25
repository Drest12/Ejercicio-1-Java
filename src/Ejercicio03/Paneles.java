
package Ejercicio03;

import javax.swing.JOptionPane;


public class Paneles {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "Ingrese su nombre:", "Input Example", JOptionPane.PLAIN_MESSAGE);
        String age = JOptionPane.showInputDialog(null, "Ingrese su edad:", "Input Example", JOptionPane.PLAIN_MESSAGE);

        if (name != null && age != null) {
            String message = "Nombre: " + name + "\nEdad: " + age;
            JOptionPane.showMessageDialog(null, message, "Datos ingresados", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
