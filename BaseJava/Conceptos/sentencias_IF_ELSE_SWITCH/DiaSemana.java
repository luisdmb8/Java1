package sentencias_IF_ELSE_SWITCH;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("*** Dia de la semana con Switch ***");
        var dia = 2;
        switch (dia){
            case 1 :
                System.out.println("Lunes");
                break;
            case 2 :
                System.out.println("Martes");
                break;
            case 3 :
                System.out.println("Miercoles");
                break;
            case 4 :
                System.out.println("Jueves");
                break;
            case 5 :
                System.out.println("Viernes");
                break;
            case 6 :
                System.out.println("Sabado");
                break;
            case 7 :
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia Invalido");
                break;

        }
        // Se usa desde java 12 en Adelante
        //      switch (dia){
        //      case 1 -> System.out.println("Lunes");
        //      case 2 -> System.out.println("Martes");
        //      case 3 -> System.out.println("Miércoles");
        //      case 4 -> System.out.println("Jueves");
        //      case 5 -> System.out.println("Viernes");
        //      case 6 -> System.out.println("Sábado");
        //      case 7 -> System.out.println("Domingo");
        //      default -> System.out.println("Día inválido: " + dia);
        //      }
    }
}
