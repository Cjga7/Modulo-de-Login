import java.util.Date;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApellido;
    String CI;
    Date fechaNacimiento;
    String direccion;
    int celular;
    int telefono;
    String email;

    public Persona(){

    }

    public Persona(String nombre, String primerApellido, String segundoApellido, String CI, Date fechaNacimiento, String direccion, int celular, int telefono, String email) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.CI = CI;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.celular = celular;
        this.telefono = telefono;
        this.email = email;
    }

}
