package variables;

import java.util.Scanner;

public class MyScanner {
    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in);
        String usuario = consola.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo = ");
        String titulo = consola.nextLine();
        System.out.println("Resultado = " + titulo + " " + usuario);
    }
}

