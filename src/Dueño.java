import java.io.File;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Dueño {
private String nombre;
private int edad;
private String numeroTelefono;
private String direccion;

private List<Mascota> listaMascotas;


@Override
public String toString(){
 return nombre + " - telefono: " + numeroTelefono;
}

public void leerDatos(){
    Scanner s = new Scanner(System.in);
    System.out.println("Teclea el nombre del dueño");
    nombre = s.nextLine(); //Leer una cadena de texto desde teclado
    System.out.println("Teclea el numero del telefono");
    numeroTelefono= s.nextLine();
    System.out.println("Teclea la direccion");
    direccion = s.nextLine();
    System.out.println("Teclea la edad del dueño");
    edad = s.nextInt();;
}

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    /*Una lista permite almacenar una cantidad idenfinida de objetos
    asi es como un dueño va a poder tener un registro de muchas mascotas */
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
