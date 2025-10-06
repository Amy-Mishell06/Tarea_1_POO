import java.util.Scanner;

public class Estudiantes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        double nota1;
        double nota2;
        double nota3;

        //Pide nombre y notas al usuario
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese la primera nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la tercera nota: ");
        nota3 = entrada.nextDouble();

        //Formula para calcular el promedio
        double promedio = (nota1+nota2+nota3)/3;

        //Salida de datos al usuario
        System.out.println("\n --- Resultados ---");
        System.out.println("Estudiante: "+nombre);
        System.out.println("Promedio: "+promedio);

        if (promedio >= 7) {
            System.out.println("Estado: Aprobado ");
        } else {
            System.out.println("Estado: Reprobado ");
        }

        entrada.close();

    }
    
}
