import java.util.List;
import java.util.Scanner;

public class Dueño {
    private String nombre;
    private int edad;
    private String numeroTelefonico;
    private String direccion;


    /*una lista permite almacenar una cantidad indefinida de objetos
    asi es como un dueño va a poder tener un registro de muchas mascotas*/

    private List<Mascota> listaMascota;

     @Override
     public String toString(){
         return nombre+ " - Telefono: "  + numeroTelefonico;
     }

     public void leerDatos(){
         Scanner s=new Scanner(System.in);
         System.out.println("Teclea el Nombre del Dueño");
         nombre = s.nextLine(); //lee una cadena de texto desde teclado
         System.out.println("Teclea el numero de Telefono");
         numeroTelefonico = s.nextLine();
         System.out.println("Teclea la Direccion");
         direccion = s.nextLine();
         System.out.println("Teclea la edad del Dueño");
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }

    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
