package operadores;

import java.util.Scanner;

public class EjercicioSistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");

        var user = "admin";
        var password = "12345";

        var consola = new Scanner(System.in);

        System.out.println("Cual es tu usuario? ");
        var user1 = consola.nextLine();

        System.out.println("Cual es tu password? ");
        var password1 = consola.nextLine();

        boolean datosCorrectos = user1.equals(user) && password1.equals(password);

        System.out.println("Datos son correctos ? " + datosCorrectos);

    }


}
