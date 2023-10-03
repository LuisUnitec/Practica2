package luis;

import java.time.LocalDate;
import java.util.Scanner;

public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    //Metodo leer datos

    public static Cita leerDato() {
        Cita C = new Cita();
        Scanner s = new Scanner(System.in);
        System.out.println("fechaCita:");
        C.fechaCita = LocalDate.parse(s.nextLine());
        System.out.println("motivo");
        C.motivo = s.nextLine();
        return C;


    }

    @Override

    public String toString() {
        return "{\"Fecha Cita\":\"" + fechaCita + "\",}";
    }
}
