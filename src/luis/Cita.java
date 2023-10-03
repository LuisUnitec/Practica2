package luis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    public static Cita leerDatos() {
        Cita c = new Cita();
        Scanner s = new Scanner(System.in);
        System.out.println("Fecha de la cita:");
        c.fechaCita = LocalDate.parse(s.nextLine());
        System.out.println("Motivo:");
        c.motivo = s.nextLine();

        return c;
    }

}
