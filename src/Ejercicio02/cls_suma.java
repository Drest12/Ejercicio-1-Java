package Ejercicio02;
import java.util.Scanner;
public class cls_suma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número de 4 cifras: ");
        int numero = scanner.nextInt();

        int sumaCifrasPares = 0;
        int sumaCifrasImpares = 0;
        int cifra;

        while (numero > 0) {
            cifra = numero % 10; 
            if (cifra % 2 == 0) {
                sumaCifrasPares += cifra;
            } else {
                sumaCifrasImpares += cifra;
            }
            numero /= 10; 
        }

        System.out.println("La suma de las cifras pares es: " + sumaCifrasPares);
        System.out.println("La suma de las cifras impares es: " + sumaCifrasImpares);

        scanner.close();
    }

}
