/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio07;

import java.util.Random;
import javax.swing.JOptionPane;

public class app_java04 {

    
    private int[] array;

    public app_java04() {
        array = new int[8];
        generateRandomArray();
    }

    private void generateRandomArray() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5) + 5; // Números aleatorios entre 5 y 9 (ambos incluidos)
        }
    }

    public double calculateGeometricMean() {
        int product = 1;
        for (int number : array) {
            product *= number;
        }
        return Math.pow(product, 1.0 / array.length);
    }

    public int[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        app_java04 calculator = new app_java04();
        int[] array = calculator.getArray();

        String arrayMessage = "Array generado:\n";
        for (int number : array) {
            arrayMessage += number + " ";
        }

        double geometricMean = calculator.calculateGeometricMean();

        JOptionPane.showMessageDialog(null, arrayMessage, "Array generado", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "El Promedio Geométrico es: " + geometricMean, "Promedio Geométrico", JOptionPane.INFORMATION_MESSAGE);
    }
}

