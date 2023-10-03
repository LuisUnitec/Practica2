package luis;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    public static Cita leerDatos(){
        Scanner s = new Scanner(System.in);
        Cita c = new Cita();
        System.out.println("Ingresa la fecha de tu cita formato AAAA-MM-DD");
        c.fechaCita = LocalDate.parse(s.nextLine());
        System.out.println("Ingresa el motivo de tu cita");
        c.motivo = s.nextLine();

        return c;
    }


}
