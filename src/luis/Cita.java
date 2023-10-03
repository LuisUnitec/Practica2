package luis;

import java.time.LocalDate;
import java.util.Scanner;

public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    //leer datos

    public static Cita datosCita(){

        Cita c = new Cita();
        Scanner s = new Scanner(System.in);
        System.out.println("Fecha de cita:  ");
        c.fechaCita = LocalDate.parse(s.nextLine());
        System.out.println("Motivo de cita: ");
        c.motivo=s.nextLine();

        return c;
    }
}
