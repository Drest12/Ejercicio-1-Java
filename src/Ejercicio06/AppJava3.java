
package Ejercicio06;

import javax.swing.JOptionPane;


public class AppJava3 {
public static void main(String[] args) {
        double baseMayor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese  la base mayor del trapecio:"));
        double baseMenor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese  la base menor del trapecio:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura del trapecio:"));

        Trapecio trapecio = new Trapecio(baseMayor, baseMenor, altura);
        double areaTrapecio = trapecio.calcularArea();

        String mensaje = "El área del trapecio es: " + areaTrapecio;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
