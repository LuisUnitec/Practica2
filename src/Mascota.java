import java.time.LocalDate;

public class Mascota {
    protected String nombre;
    protected String tipo;
    protected String numeroIdentificacion;
    protected LocalDate fechadeNacimiento;

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

    public String getNumeroIdentidentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentidentificacion(String numeroIdentidentificacion) {
        this.numeroIdentificacion = numeroIdentidentificacion;
    }

    public LocalDate getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }
}
