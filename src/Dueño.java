import java.util.List;
import java.util.Scanner;

public class Dueño {
    private String nombre;
    private int edad;
    private String no_tel;

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

    public String getNo_tel() {
        return no_tel;
    }

    public void setNo_tel(String no_tel) {
        this.no_tel = no_tel;
    }

    public String getDirección() {
        return dirección;
    }

    /*
    * Una lista permite almacenar una cantidad indefinida de objetos
    * Así es como un dueño va a poder tener un registro de muchas mascotas
    * */
    private List<Mascota> listaMascota;

    @Override // una bandera de compilador, para mi método de abajo
    public String toString(){
        return nombre + " - Teléfono: " + no_tel;
    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el nombre del dueño: ");
        nombre = s.nextLine(); //Lee una cadena de texto desde el teclado
        System.out.println("Teclea el numero de teléfono: ");
        no_tel = s.nextLine();
        System.out.println("Ingresa la dirección: ");
        dirección = s.nextLine();
        System.out.println("Ingresa la edad del dueño: ");
        edad = s.nextInt();
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    private String dirección;

    public List<Mascota> getListaMascota() {
        return listaMascota;
    }

    public void setListaMascota(List<Mascota> listaMascota) {
        this.listaMascota = listaMascota;
    }
}
