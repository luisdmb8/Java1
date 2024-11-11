package operadores;

import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro Rango ***");
        // definir los limnites

        final var Minimo = 0;
        final var Maximo = 5;

        //Solicitar un valor
        System.out.println("Proporciona un numero para evaluar si entra entre 0 y 5 :  ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());

        // Verifica si el valor esta dentro del rango

        var estaDentroRango = dato >= Minimo && dato <= Maximo;
        System.out.println("Esta Dentro de rango = " + estaDentroRango);

    }
}
