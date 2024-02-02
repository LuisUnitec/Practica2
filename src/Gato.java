import java.util.Scanner;

public class Gato extends Mascota{
    private boolean estaEsterelizado;

    public boolean isEstaEsterelizado() {
        return estaEsterelizado;
    }

    public void setEstaEsterelizado(boolean estaEsterelizado) {
        this.estaEsterelizado = estaEsterelizado;
    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingresa el nombre del gato: ");
        nombre = s.nextLine(); //Lee una cadena de texto desde el teclado
        System.out.println("Ingresa el tipo de gato: ");
        tipo = s.nextLine();
        System.out.println("Ingresa el número de identificación: ");
        no_identificación = s.nextLine();
        //System.out.println("Ingresa la fecha de nacimiento del michi: ");
        //fecha_nacimiento = s.n();
        System.out.println("Esta esterilizado? :");
        estaEsterelizado = s.nextBoolean();
    }
}
