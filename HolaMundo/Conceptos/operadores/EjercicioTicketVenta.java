package operadores;

import java.util.Scanner;

public class EjercicioTicketVenta {
    public static void main(String[] args) {
        System.out.println("***Generacion Ticket De Venta***");

        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        // Cálculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Cálculo con impuestos (16%)
        var impuesto = subtotal * 0.16;

        // Cálculo total de la compra (con impuestos)
        var costoTotalCompra = subtotal + impuesto;

        System.out.printf("%nTicket de Venta\n" +
                        "---------------\n" +
                        "Subtotal: $%.2f\n" +  // Para el valor de tipo flotante %.2f
                        "Impuesto (16%%): $%.2f\n" +
                        "Costo total de la compra: $%.2f\n",
                subtotal, impuesto, costoTotalCompra);


    }
}
