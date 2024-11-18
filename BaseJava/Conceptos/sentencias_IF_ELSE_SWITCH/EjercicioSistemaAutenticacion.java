package sentencias_IF_ELSE_SWITCH;

import java.util.Scanner;

public class EjercicioSistemaAutenticacion {

    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        final var user = "admin";
        final var Pass = "123";

        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        var usuario = consola.nextLine().strip();

        System.out.print("Ingresa tu password: ");
        var password = consola.nextLine().strip();


        switch (usuario) {
            case "admin":
                switch (password) {
                    case "123":
                        System.out.println("Bienvenido al sistema");
                        break;
                    default:
                        System.out.println("Password incorrecto, favor de corregirlo!");
                        break;
                }
                break;
            default:
                switch (password) {
                    case "123":
                        System.out.println("Usuario incorrecto, pero la contraseña es correcta.");
                        break;
                    default:
                        System.out.println("Usuario y password incorrectos, favor de corregirlos!");
                        break;
                }
                break;
        }
    }

}
