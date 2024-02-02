import java.sql.SQLOutput;
import java.util.Scanner;

public class Gato extends Mascota {
    private boolean estaEsterilizado;

    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }
    @Override
    public String toString(){
        return nombre + "  " + tipo;
    }

    public void leerGatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del gato");
        nombre = s.nextLine(); //Leer una cadena de texto desde teclado
        System.out.println("Teclea el tipo de gato");
        tipo= s.nextLine();
        System.out.println("Teclea  el numero de Identifiacion");
        numeroIdentifiacion = s.nextLine();
        System.out.println("Esta esterilizado");
        estaEsterilizado= s.nextBoolean();
    }
    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
}
