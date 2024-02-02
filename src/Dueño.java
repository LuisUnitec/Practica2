import java.util.List;
import java.util.Scanner;

public class Dueño {
    private String nombre;

    private int edad;

    private String numeroTelefono;

    private String direccion;

    public String getNombre() {
        return nombre;
    }



    private List<Mascota> listaMascotas;

    @Override public String toString() {
        return nombre + " - Telefono: " + numeroTelefono;
    }

        public void leerDatos() {
            Scanner s = new Scanner(System.in);
            System.out.println("Teclea el nombre del dueño:");
        }

        public List<Mascota> getListaMascotas(){
        return listaMascotas;
        }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
