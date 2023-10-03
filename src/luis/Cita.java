package luis;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    public static Cita leerDatos() {
        Scanner s = new Scanner(System.in);
        Cita c = new Cita();
        System.out.println("Fecha de la cita: ");
        c.fechaCita = LocalDate.parse(s.nextLine());
        System.out.println("Motivo de la cita ");
        c.motivo = s.nextLine();
        return c;
    }
    @Override
    public String toString() {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();//formato a la salida
        Gson g = builder.create();
        return g.toJson(this);
    }
}
