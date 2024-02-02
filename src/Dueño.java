import java.util.List;
import java.util.Scanner;

public class Dueño {
    private String nombre;
    private int edad ;
    private String no_Tel ;
    private String direccion;

    /* una lista permite almacenar una cantidad definida de objetos
    asi el dueño va a poder tener un registro de muchas mascotas
    */
    private List<Mascota> ListaMascotas;

    @Override
    public String toString(){
        return nombre + " - Telefono: " + no_Tel;

    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println(" Teclee el nombre del dueño: ");
        nombre = s.nextLine();  //Lee una cadena de texto desdel teclado
        System.out.println(" Teclea el Numero de Telefono: ");
        no_Tel = s.nextLine();
        System.out.println(" Teclea la Direccion: ");
        direccion = s.nextLine();
        System.out.println(" Teclea la Edad del Dueño: ");
        edad = s.nextInt();


    }



    public List<Mascota> getListaMascotas() {
        return ListaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        ListaMascotas = listaMascotas;
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

    public String getNo_Tel() {
        return no_Tel;
    }

    public void setNo_Tel(String no_Tel) {
        this.no_Tel = no_Tel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
