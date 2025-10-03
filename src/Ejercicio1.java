import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //productos para registrar
        System.out.print("¿Cuántos productos desea registrar? ");
        int n = sc.nextInt();
        sc.nextLine();

        double valorTotal = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nProducto " + i + ":");
            System.out.print("Nombre: ");
            String producto = sc.nextLine();

            System.out.print("Precio unitario: ");
            double precio = sc.nextDouble();

            System.out.print("Cantidad en stock: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            if (precio <= 0 || cantidad < 0) {
                System.out.println("Error: precio y cantidad deben ser positivos.");
            } else {
                double subtotal = precio * cantidad;
                valorTotal += subtotal;
                System.out.println("Subtotal producto: $" + subtotal);
            }
        }

        System.out.println("\nValor total en stock: $" + valorTotal);
    }
}
