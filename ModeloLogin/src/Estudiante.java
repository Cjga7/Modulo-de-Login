import java.util.Date;

public class Estudiante extends Usuario {
    String codigo;

    public Estudiante(){

    }

    public Estudiante(String nombre, String primerApellido, String segundoApellido, String CI, Date fechaNacimiento, String direccion, int celular, int telefono, String email, String usuario, String contraseña, String codigo) {
        super(nombre, primerApellido, segundoApellido, CI, fechaNacimiento, direccion, celular, telefono, email, usuario, contraseña);
        this.codigo = codigo;
    }
}
