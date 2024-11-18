package sentencias_IF_ELSE_SWITCH;

import java.util.Scanner;

public class EjercicioEnvio {

    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos ***");

        final var TARIFA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;
        var costo = 0.0;

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingresa el peso del paquete (en kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        switch (destino){
            case "nacional":
                costo = peso * TARIFA_NACIONAL;
                break;
            case "internacional":
                 costo = peso * TARIFA_INTERNACIONAL;
                break;
            default:
                System.out.println("Destino Invalido. Ingresa nacional/internacional");
            }
                System.out.println("El costo de envío de paquete es: $" + costo);
        }
    }
