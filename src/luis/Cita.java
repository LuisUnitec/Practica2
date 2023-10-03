package luis;

import java.time.LocalDate;
import java.util.Scanner;

public class Cita {
    public LocalDate fechaCita;
    public String motivo;

    public static Cita leerDatos() {
        Scanner s = new Scanner(System.in);
        Cita cita = new Cita();
        System.out.println("Teclea la fecha de tu cita (AAAA-MM-DD):");
        cita.fechaCita = LocalDate.parse(s.nextLine());
        System.out.println("Teclea el motivo de tu cita:");
        cita.motivo = s.nextLine();
        return cita;
    }

    public static void main(String[] args) {
        Cita cita = leerDatos();
        System.out.println("Cita programada para el " + cita.fechaCita + " por el motivo: " + cita.motivo);
    }
}