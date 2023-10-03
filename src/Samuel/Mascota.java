package Samuel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mascota {
    public String nombre;
    public String tipo;
    public int noIdentificacion;
    public LocalDate fechaNacimiento;
    public List<Cita> citasPendientes;

    public static Mascota leerDatos() {
        Mascota m = new Mascota();
        Scanner s = new Scanner(System.in);
        System.out.println("Nombre:");
        m.nombre = s.nextLine();
        System.out.println("tipo:");
        m.tipo = s.nextLine();
        System.out.println("Fecha de Nacimiento (AAAA-MM-DD)");
        m.fechaNacimiento = LocalDate.parse(s.nextLine()); // Convertimos el texto YYYY-MM-DD a LocalDate
        System.out.println("Número de identificación");
        m.noIdentificacion = s.nextInt();
        m.citasPendientes = new ArrayList<>();

        return m;
    }
    @Override
    public String toString(){
         return "{\"Nombre\":\"" + nombre + "\",}";
    }
}
