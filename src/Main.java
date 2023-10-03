import Samuel.Dueño;
import Samuel.Mascota;

import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {

    private static Logger logger = configurarLogs();

    /* Inicio del programa */
    public static void main(String[] args) {


        Dueño dueñoRegistrado = null;

        int opcion;
        do {
            opcion = imprimirMenu();
            switch(opcion) {
                case 1:
                    dueñoRegistrado = Dueño.leerDatos();
                    break;
                case 2:
                    if(dueñoRegistrado == null) {
                        logger.log(Level.SEVERE, "Se trató de añadir una mascota sin tener dueño");
                        System.out.println("Primer necesitas capturar los datos del dueño");
                    } else {
                        // Imprimir los datos del dueño
                        System.out.println(dueñoRegistrado);
                        // Leer los datos de la mascota y agregarlos a la lista de mascotas del dueño
                        Mascota mascotaLeida = Mascota.leerDatos();
                        dueñoRegistrado.listaMascotas.add(mascotaLeida);
                    }
                    break;
                case 3: break;
                case 4: break;
                default:
                    logger.log(Level.INFO, "Usuario seleccionó opción incorrecta: " + opcion);
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 4);
    }

    /* Menú de opciones para el usuario */
    public static int imprimirMenu() {
        Scanner s = new Scanner(System.in);

        System.out.println("Sistema de control de citas - El Borrego Viudo");
        System.out.println("Elija una opción:");
        System.out.println("1.- Registrar nuevo dueño");
        System.out.println("2.- Registrar mascota");
        System.out.println("3.- Registrar registrar cita");
        System.out.println("4.- Salir");

        return s.nextInt();
    }

    /* Configuración de los logs */
    private static Logger configurarLogs() {

        Logger logger = null;
        try {
            logger = Logger.getLogger(Main.class.getName());
            logger.setUseParentHandlers(false);
            FileHandler fh = new FileHandler("veterinaria.log");
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        } catch (Exception ignored) { }
        return logger;
    }
}