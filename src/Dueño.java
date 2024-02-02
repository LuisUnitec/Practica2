import java.util.List;
import java.util.Scanner;

public class Dueño {
    private String nombre;
    private int edad;
    private String numeroTelefono;
    private String direccion;
/* Una lista permite almacenar una cantidad indeficina de objetos asi como es dueño
va a poder tener un registro de muchas mascotas */

    private List<Mascota> listaMascotas;

    @Override
    public String toString(){
        return nombre+ "- Telefono:" + numeroTelefono;
    }
    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del dueño:");
        nombre =s.nextLine();
        System.out.println("Teclea el numero de telefono");
        numeroTelefono = s.nextLine();
        System.out.println("Teclea la Direccion");
        direccion =s.nextLine();
        System.out.println("Teclea la edad del dueño");
        edad = s.nextInt();
    }
    public String getNombre() {
        return nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

