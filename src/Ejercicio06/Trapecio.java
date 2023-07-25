package Ejercicio06;

public class Trapecio {

    double baseMayor;
    double baseMenor;
    double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
}
