package operadores;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // Precedencia de Operadores en Java:
        // 1. Parentesis y Corchetes
        // 2. Operadores unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=, *=, etc

        // Expresion
        // Paso 1. Division 12 / 3 = 4 , porque va de izquiera a derecha y tienes la misma prioridad que *
        // Paso 2. Multiplicacion 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9
        var a = 12 / 3 + 2 * 3 - 1;
        // var a = 12 / 3 + 2 * (3 - 1); = 8 , se toma como prioridad la operacion en parentesis
        System.out.println("a = " + a);


    }

}
