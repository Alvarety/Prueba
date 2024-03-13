import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Multiplicar los dos números
        double resultado = num1 * num2;

        // Mostrar el resultado
        System.out.println("El resultado de la multiplicación es: " + resultado);

        scanner.close();
    }
}