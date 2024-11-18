package OperadorTernario;

import java.util.Scanner;

public class EjercicioFitness {
    public static void main(String[] args) {

        final var metaPasosDiario = 10000;
        final var caloriasPasos = 0.04;


        var consola = new Scanner(System.in);

        System.out.println("Cual es tu nombre ?");
        var nombreUsuario = consola.nextLine();

        System.out.println("Cuantos pasos has caminado hoy ? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        var metaAlcanzada = (pasosDiarios >= metaPasosDiario) ? "si :) " : "No :(";

        var caloriasQuemadas = pasosDiarios + caloriasPasos ;

        System.out.printf("Usuario: " + nombreUsuario
                            + "\nPasos dados hoy : " + pasosDiarios
                            + "\nCalorias quemadas : " + caloriasQuemadas + "Kcal"
                            + "\nMeta de pasos diarios : " + metaAlcanzada
                            + "\nLa meta de pasos diarios es : " + metaPasosDiario);

    }
}
