import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cédula: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese nombres: ");
        String nombres = sc.nextLine();

        System.out.print("Ingrese teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Ingrese email: ");
        String email = sc.nextLine();

        if (cedula.isEmpty() || nombres.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
            System.out.println("Error: todos los campos son obligatorios.");
        } else {
            System.out.println("\n--- FICHA DEL CLIENTE ---");
            System.out.println("Cédula: " + cedula);
            System.out.println("Nombres: " + nombres);
            System.out.println("Teléfono: " + telefono);
            System.out.println("Email: " + email);
        }
    }
}
