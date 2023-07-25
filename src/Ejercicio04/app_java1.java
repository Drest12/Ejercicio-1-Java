
package Ejercicio04;

import javax.swing.JOptionPane;

public class app_java1 {
      public static void main(String[] args) {
        int[] numerosGenerados = generarNumerosAleatorios(5);

        String mensaje = "Números generados:\n";
        for (int numero : numerosGenerados) {
            mensaje += numero + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public static int[] generarNumerosAleatorios(int cantidad) {
        int[] numerosGenerados = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numerosGenerados[i] = (int) (Math.random() * 100);
        }
        return numerosGenerados;
    }
}
