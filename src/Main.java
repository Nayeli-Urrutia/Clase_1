import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void holaMundo() {
        System.out.println("Hola, Mundo!");
    }

    public static void sumaNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
    }

    public static void ParoImpar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero es Par: " + numero);
        }
        else
        {
            System.out.println("El numero es Impar: " + numero);

        }
    }


    public static void NumeroFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("La factorial es: " + fact);
    }


    public static void tablaMultiplicar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();

        System.out.println("Tabla de multiplicar de " + num + " en orden ascendente:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("Tabla de multiplicar de " + num + " en orden descendente:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú de Ejercicios:");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Número par o impar");
            System.out.println("4. Factorial de un número");
            System.out.println("5. Tabla de multiplicar");
            System.out.println("6. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    sumaNumeros();
                    break;
                case 3:
                    ParoImpar();
                    break;
                case 4:
                    NumeroFactorial();
                    break;
                case 5:
                    tablaMultiplicar();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 6);

        scanner.close();
    }
}
