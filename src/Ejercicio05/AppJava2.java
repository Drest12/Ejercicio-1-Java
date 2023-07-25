package Ejercicio05;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AppJava2 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de empleados:"));
        String[] nombres = new String[n];
        double[] sueldos = new double[n];
        for (int i = 0; i < n; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingrese el nombre del empleado " 
                    + (i + 1) + ":");
            sueldos[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado "
                    + (i + 1) + ":"));
        }
        double totalSueldos = 0;
        int indiceMayorSueldo = 0;
        for (int i = 0; i < n; i++) {
            totalSueldos += sueldos[i];
            if (sueldos[i] > sueldos[indiceMayorSueldo]) {
                indiceMayorSueldo = i;
            }
        }
        double promedioSueldos = totalSueldos / n;
        String nombreEmpleadoMayorSueldo = nombres[indiceMayorSueldo];

        String mensaje = "Promedio de sueldos: " + promedioSueldos +
                "\nEmpleado con mayor sueldo: " + nombreEmpleadoMayorSueldo;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
