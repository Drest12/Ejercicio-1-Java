/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

import javax.swing.JOptionPane;

public class Triangulo {
    private double base;
    private double height;

    public Triangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return (base * height) / 2;
    }

    public void displayTriangle() {
        String message = "Triángulo:\nBase: " + base + "\nAltura: " + height;
        JOptionPane.showMessageDialog(null, message, "Triángulo", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String baseInput = JOptionPane.showInputDialog(null, "Ingrese la base del triángulo:", "Triángulo", JOptionPane.QUESTION_MESSAGE);
        double base = Double.parseDouble(baseInput);

        String heightInput = JOptionPane.showInputDialog(null, "Ingrese la altura del triángulo:", "Triángulo", JOptionPane.QUESTION_MESSAGE);
        double height = Double.parseDouble(heightInput);

        Triangulo triangle = new Triangulo(base, height);

        double area = triangle.calculateArea();

        triangle.displayTriangle();
        JOptionPane.showMessageDialog(null, "Área del triángulo: " + area, "Área", JOptionPane.INFORMATION_MESSAGE);
    }
}

