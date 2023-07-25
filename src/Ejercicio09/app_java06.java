
package Ejercicio09;

public class app_java06 {
     public static void main(String[] args) {
        double b = 5;
        double c = 4;

        double a = calcularHipotenusa(b, c);
        double perimetro = calcularPerimetro(a, b, c);
        double area = calcularArea(b, c);

        System.out.println("Perímetro del triángulo rectángulo: " + perimetro);
        System.out.println("Área del triángulo rectángulo: " + area);
    }


    public static double calcularHipotenusa(double b, double c) {
        return Math.sqrt(b * b + c * c);
    }

    public static double calcularPerimetro(double a, double b, double c) {
        return a + b + c;
    }

    public static double calcularArea(double b, double c) {
        return (b * c) / 2;
    }
}
