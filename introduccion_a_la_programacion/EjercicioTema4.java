package introduccion_a_la_programacion;

import java.util.Scanner;

public class EjercicioTema4 {
    public static void main(String[] args) {
        int numeroIf;
        int numeroWhile = 0;

        Scanner scan = new Scanner(System.in);

        numeroIf = scan.nextInt();

        // CONDICIONAL IF
        if(numeroIf < 0) {
            System.out.println("es negativo");
        } else if (numeroIf > 0) {
            System.out.println("es positivo");
        } else {
            System.out.println("es cero");
        }

        // WHILE
        while(numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        // DO WHILE
        do {
            // ANTES
            System.out.println(numeroWhile);
            numeroWhile++;
            // DESPUES
            System.out.println(numeroWhile);
        }
        while(numeroWhile < 3);

        // FOR
        for(int numeroFor = 0; numeroFor <= 3 ;numeroFor++) {
            System.out.println(numeroFor);
        }

        // SWITCH
        String estacion = scan.next();
        switch (estacion) {
            case "VERANO":
                System.out.println("La estación es VERANO");
                break;
            case "OTOÑO":
                System.out.println("La estación es OTOÑO");
                break;
            case "INVIERNO":
                System.out.println("La estación es INVIERNO");
                break;
            case "PRIMAVERA":
                System.out.println("La estación es PRIMAVERA");
                break;
            default:
                System.out.println("El valor de la variable no es una estación");
        }
        scan.close();
    }
}
