package Samuel;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.time.LocalDate;
import java.util.Scanner;

public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    //Leer datos
    public static Cita leerDatos(){
        Scanner s  = new Scanner(System.in);
        Cita c = new Cita();
        c.fechaCita = LocalDate.parse(s.nextLine());
        c.motivo = s.nextLine();
        return c;
    }

}
