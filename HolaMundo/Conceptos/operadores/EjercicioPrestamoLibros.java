package operadores;

import java.util.Scanner;

public class EjercicioPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo Libros ***");

        final var DistanciaPermitidaKM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Cuentas con credencial de estudiante (true/false)? ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuanto km vives de la biblioteca? ");
        var distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());

        var esViablePrestamo =
                tienesCredencial || distanciaBibliotecaKm <= DistanciaPermitidaKM;

        System.out.println("Eres elegible para prestamo de libros? " + esViablePrestamo);
    }
}
