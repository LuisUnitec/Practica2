import java.time.LocalDate;

public class Mascota {

    protected String nombre, tipo, número_de_identificación;
    protected LocalDate  fecha_de_nacimiento;

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

    public String getNúmero_de_identificación() {
        return número_de_identificación;
    }

    public void setNúmero_de_identificación(String número_de_identificación) {
        this.número_de_identificación = número_de_identificación;
    }

    public LocalDate getFecha_de_nacimiento() {
        return fecha_de_nacimiento;
    }

    public void setFecha_de_nacimiento(LocalDate fecha_de_nacimiento) {
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }
}
