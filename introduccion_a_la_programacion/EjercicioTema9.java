package introduccion_a_la_programacion;

public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setEdad(25);
        cliente.setNombre("Sergio");
        cliente.setTelefono("3672869523");
        cliente.setCredito(23.548);

        String nombreCliente = cliente.getNombre();
        String telefonoCliente = cliente.getTelefono();
        int edadCliente = cliente.getEdad();
        double creditoCliente = cliente.getCredito();

        System.out.println(nombreCliente);
        System.out.println(telefonoCliente);
        System.out.println(edadCliente);
        System.out.println(creditoCliente);

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(32);
        trabajador.setNombre("Oscar");
        trabajador.setTelefono("3578142564");
        trabajador.setSalario(86.214);

        String nombreTrabajador = trabajador.getNombre();
        String telefonoTrabajador = trabajador.getTelefono();
        int edadTrabajador = trabajador.getEdad();
        double salarioTrabajador = trabajador.getSalario();

        System.out.println(nombreTrabajador);
        System.out.println(telefonoTrabajador);
        System.out.println(edadTrabajador);
        System.out.println(salarioTrabajador);
    }
}

class Persona2 {
    private int edad;
    private String telefono;
    private String nombre;

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

class Cliente extends Persona2 {
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }
    public double getCredito() {
        return this.credito;
    }
}

class Trabajador extends Persona2 {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getSalario() {
        return this.salario;
    }
}
