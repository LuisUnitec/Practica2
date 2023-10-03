package luis;

import java.time.LocalDate;
import java.util.Scanner;

public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    public static Cita leerDatos() {
        Scanner s = new Scanner(System.in);
        Cita c = new Cita();

        System.out.println("Motivo de la cita");
        c.motivo = s.nextLine();
        System.out.println("Fecha de la cita (AAAA-MM-DD)");
        c.fechaCita = LocalDate.parse(s.nextLine());

        return c;
    }
}
