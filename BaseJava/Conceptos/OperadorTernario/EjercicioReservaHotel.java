package OperadorTernario;

import java.util.Scanner;

public class EjercicioReservaHotel {
    public static void main(String[] args) {

        var cuartoNoVistaMar = 150.50;
        var cuartoVistaMar = 190.50;

        var consola = new Scanner(System.in);

        System.out.print("Cual es tu nombre? = ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Dias de estadia en el Hotel= ");
        var diasHotel = Integer.parseInt(consola.nextLine());

        System.out.print("Quieres cuarto con vista al mar ? true/false = ");
        var vistaMar = Boolean.parseBoolean(consola.nextLine());

        var costoTotal = vistaMar ? (cuartoVistaMar * diasHotel) : (cuartoNoVistaMar * diasHotel) ;

        var habitacionVistaMar = vistaMar ? "Si :)" : "No :(";

        System.out.println("-----------------RESERVA----------------");

        System.out.printf("Cliente: %s\nDias de estadia: %d\nCosto Total: $%.2f\nHabitacion Con vista al Mar: %s\n",
                nombreUsuario, diasHotel, costoTotal, habitacionVistaMar);







    }

}
