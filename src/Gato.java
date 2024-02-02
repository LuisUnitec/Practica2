import java.util.Scanner;

public class Gato extends Mascota{
    public  boolean estaEsterilizado;



    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Nombre del Gato: ");
        nombre = s.nextLine();
        System.out.println("Tipo de Gato");
        tipo = s.nextLine();
        System.out.println("Numero de identificacion; ");
        número_de_identificación = s.nextLine();
        // System.out.println("Fecha de nacimiento");
        // fecha_de_nacimiento = s.
        System.out.println("El gato esta esterilizado True/Falce");
        estaEsterilizado = s.nextBoolean();


    }

/*
    public void leerDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del dueño");
        nombre = s.nextLine(); // leer una cadena de texto desde el teclado
        numero_telefono = s.nextLine();
        System.out.println("Teclea la direccion: ");
        dirección = s.nextLine();
        System.out.println("Teclear la edad del dueño");
        edad = s.nextInt();
    }
  */

    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
}
