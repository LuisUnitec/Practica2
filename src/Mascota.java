import java.time.LocalDate;
import java.util.Date;

public class Mascota {
    //nombre, tipo, número de identificación y fecha de nacimiento.
    protected String nombre;
    protected String tipo;
    protected String no_identificación;
    protected LocalDate fecha_nacimiento;

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

    public String getNo_identificación() {
        return no_identificación;
    }

    public void setNo_identificación(String no_identificación) {
        this.no_identificación = no_identificación;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }
}
