package operadores;

import java.util.Scanner;

public class EjercicioDescuentos {
    public static void main(String[] args) {
        System.out.println("*** Sistemas De Descuentos VIP ***");
        final var NoProdusctosDescuento = 10;
        var consola = new Scanner(System.in);

        System.out.println("Cuantos productos compraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.println(" Tienes la membresia de la tienda (true/false) ? ");

        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esViableDescuento =
                cantidadProductos >= NoProdusctosDescuento && tienesMembresia;

        System.out.println("Es viable el descuento = " + esViableDescuento);

    }
}
