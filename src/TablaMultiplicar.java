import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner multi = new Scanner(System.in);
        int numero;
        int resultado;

        System.out.println("Ingrese un numero del 1 al 10: ");
        numero=multi.nextInt();

        System.out.println("\n --- Tabla de multiplicar del " + numero + " --- ");

        for (int i=1; i <= 10; i++){
            resultado = numero * i;
            System.out.println(numero + " x " +i+ " = " +resultado);
        }

        multi.close();
    }
}
