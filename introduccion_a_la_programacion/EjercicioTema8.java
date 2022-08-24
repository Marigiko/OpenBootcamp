package introduccion_a_la_programacion;

public class EjercicioTema8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(22);
        persona.setNombre("Mario");
        persona.setTelefono("3629778654");

        String nombre = persona.getNombre();
        String telefono = persona.getTelefono();
        int edad = persona.getEdad();

        System.out.println(nombre);
        System.out.println(telefono);
        System.out.println(edad);
    }

}

class Persona {
    private int edad;
    private String telefono;
    private String nombre;

    /*
    Persona(byte edad, int telefono, String nombre) {
        this.edad = edad;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    */

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getTelefono() {
        return this.telefono;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
}
