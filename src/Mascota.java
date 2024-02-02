import java.time.LocalDate;

public class Mascota {
    protected String nombre;
    protected String tipo;
    protected String númeroIdentificación;
    protected LocalDate fechaNacimiento;





    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNúmeroIdentificación() {
        return númeroIdentificación;
    }

    public void setNúmeroIdentificación(String númeroIdentificación) {
        this.númeroIdentificación = númeroIdentificación;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}
