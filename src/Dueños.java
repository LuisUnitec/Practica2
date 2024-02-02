import java.util.List;
import java.util.Scanner;

public class Dueños {

   private String nombre, dirección,  numero_telefono;
   private int edad;

   private List<Mascota> listaMascota;

   /* Una lista permite almacenar una cantidad indefinida de onjetos
   asi es como un dueño va a poder tener un registro de muchas mascotas
    */

    @Override
    public String toString() {
        return nombre + "-Telefono: " + numero_telefono;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del dueño");
        nombre = s.nextLine(); // leer una cadena de texto desde el teclado
        numero_telefono = s.nextLine();
        System.out.println("Teclea la direccion: ");
        dirección = s.nextLine();
        System.out.println("Teclear la edad del dueño");
        edad = s.nextInt();
    }

    public List<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(List<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


}
