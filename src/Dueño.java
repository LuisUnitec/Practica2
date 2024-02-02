import java.util.List;
import java.util.Scanner;

public class Dueño {
    private String nombre;
    private int edad;
    private String numeroTelefono;
    private String direccion;

    /*Una lista permite almacenar una cantidad indefinida de objetos
    Así es comop un dueño va a poder tener un registro de muchas mascotas
     */
    @Override
    public String toString(){
        return nombre + " - Telefono: " + numeroTelefono;
    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del dueño: ");
        nombre = s.nextLine(); //Lee una cadena de texto desde el teclado
        System.out.println("Teclea el número de telefono: ");
        numeroTelefono = s.nextLine();
        System.out.println("Teclea la dirección: ");
        direccion = s.nextLine();
        System.out.println("Teclea la edad del dueño");
        edad = s.nextInt();
    }

    private List<Mascota>listaMascotas;

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public String getNombre() {
        return nombre;
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

