import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //numero de estudiantes
        System.out.print("¿Cuantos estudiantes desea evaluar? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEstudiante " + i + ":");
            System.out.print("Ingrese edad: ");
            int edad = sc.nextInt();

            System.out.print("Ingrese altura (en metros): ");
            double altura = sc.nextDouble();

            if (edad <= 0 || altura <= 0) {
                System.out.println("Error: edad y altura deben ser positivas.");
            } else if (edad >= 18 && altura >= 1.60) {
                System.out.println("Cumple");
            } else {
                System.out.println("No cumple");
            }
        }
    }
}
