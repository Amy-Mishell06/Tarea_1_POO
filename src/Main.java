//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}

import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "AMD1", contra = " ";



        System.out.println("1. Ver tabla de multiplicar");
        System.out.println("2. Salir");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese un número para la tabla de multiplicar: ");
                int m = sc.nextInt();
                for (int i = 1; i < 12; i++) {
                    System.out.println("- " + m + "*" + i + "=" + (m * i));
                }
                break;
            case 2:
                String usuario = "Amy";
                String password1 = "Amy1";
                System.out.println("Ingrese su nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Ingrese su contrasena: ");
                String apellido = sc.nextLine();

                if (usuario.equals(nombre) && apellido.equals(password1)) {
                    System.out.println("Acceso concedido");
                } else {
                    System.out.println("Acceso no concedido");
                }
                break;

            case 3: while(!(password.equals(contra))){
                System.out.println("Ingrese su contraseña: ");
                contra = sc.nextLine();
            }

            default:
                System.out.println("Opción no válida.");
        }

        sc.close();

    }
}