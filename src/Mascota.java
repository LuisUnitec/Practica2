import java.time.LocalDate;

public class Mascota {
    protected String nombre;
    protected String tipo;
    protected String numeroIdentifiacion;
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

    public String getNumeroIdentifiacion() {
        return numeroIdentifiacion;
    }

    public void setNumeroIdentifiacion(String numeroIdentifiacion) {
        this.numeroIdentifiacion = numeroIdentifiacion;
    }

    public LocalDate getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }
}


