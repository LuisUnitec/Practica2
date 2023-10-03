package luis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dueño {
    public String nombre;
    public String telefono;
    public int edad;
    public String direccion;
    public List<Mascota> listaMascotas;

    public static Dueño leerDatos() {
        Scanner s = new Scanner(System.in);
        Dueño d = new Dueño();
        System.out.println("Teclea el nombre del dueño");
        d.nombre = s.nextLine();
        System.out.println("Teclea el número de teléfono de contacto");
        d.telefono = s.nextLine();
        System.out.println("Teclea la dirección");
        d.direccion = s.nextLine();
        System.out.println("Teclea la edad");
        d.edad = s.nextInt();
        d.listaMascotas = new ArrayList<>();  // Inicializamos a vació la lista de mascotas
        // Mientras no lo inicialicemos, no se puede usar la lista, porque mandaría un error

        return d;
    }

    @Override
    public String toString() {
        //return nombre + " Tel: ####" + telefono.substring(3) + " Mascotas: " + listaMascotas;
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();// da formato a la salida
        Gson g = builder.create();
        //Gson g = new Gson();
        return g.toJson(this);
    }
}
