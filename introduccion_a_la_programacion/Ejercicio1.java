package introduccion_a_la_programacion;

public class Ejercicio1 {
    public static void main(String[] args) {
        int resultado = suma(5, 13, 7);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        System.out.println(miCoche.puertas);

        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}
class Coche {
    int puertas = 4;

    public void incrementarPuertas() {
        puertas++;
    }
}