import java.util.Scanner;

public class Numeros_pares {
    public static void main(String[] args) {
        Scanner numeros = new Scanner (System.in);

        int cantidad;
        int pares = 0; //contador de numeros pares
        int numero;

        System.out.println("¿Cuantos numeros desea ingresar?: ");
        cantidad = numeros.nextInt();

        for (int i=1; i<= cantidad; i++){
            System.out.println("Ingrese los numeros "+i+ ": ");
            numero = numeros.nextInt();

            if (numero % 2 == 0) {
                pares++;
            }
        }

        System.out.println("\n --- Resultados --- ");
        System.out.println("Cantidad de numeros ingresados: "+cantidad);
        System.out.println("Cantidad de numeros pares ingresados: "+pares);

        numeros.close();
    }
}
