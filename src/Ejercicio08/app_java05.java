
package Ejercicio08;

import javax.swing.JOptionPane;
import java.util.Random;

public class app_java05 {

    public static double calculateInverseAverage(int[] array) {
        double sumInverse = 0.0;
        for (int number : array) {
            double inverse = 1.0 / number;
            sumInverse += inverse;
        }
        return sumInverse / array.length;
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        // Generar el array con números aleatorios entre 5 y 12 (ambos incluidos)
        StringBuilder arrayMessage = new StringBuilder("Array generado:\n");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(8) + 5;
            arrayMessage.append(array[i]).append(" ");
        }

        // Calcular el promedio de las inversas de las cantidades
        double inverseAverage = calculateInverseAverage(array);

        // Mostrar el resultado del array generado y el promedio
        String resultMessage = arrayMessage.toString() + "\n\nEl promedio aritmético de las inversas es: \n\n" + inverseAverage;
        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
