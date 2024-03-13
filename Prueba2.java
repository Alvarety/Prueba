import java.util.Scanner;

public class Prueba2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la longitud del array
        System.out.print("Ingrese la longitud del array: ");
        int longitud = scanner.nextInt();

        // Crear un array de enteros con la longitud especificada
        int[] numeros = new int[longitud];

        // Pedir al usuario que ingrese los números para llenar el array
        System.out.println("Ingrese los números para llenar el array:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar los números del array
        System.out.println("Los números ingresados en el array son:");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Número en la posición " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}