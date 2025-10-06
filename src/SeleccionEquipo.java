import java.util.Scanner;

public class SeleccionEquipo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;
        double altura;

        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su altura en metros (por ejemplo 1,75): ");
        altura = entrada.nextDouble();

        System.out.println("\n --- Resultado --- ");
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");

        if (edad > 18 && altura > 1.60) {
            System.out.println("Aceptado para el equipo");
        } else {
            System.out.println("No cumple los requisitos");
        }

    }
}
