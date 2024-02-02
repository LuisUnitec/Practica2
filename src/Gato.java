import java.util.Scanner;

public class Gato extends Mascota{

    private boolean estaEsterilizado;

    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
    @Override
    public String toString(){
        return nombre + " - Tipo: " + tipo;
    }

    public void leerGato(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre de la mascota: ");
        nombre = s.nextLine();
        System.out.println("Ingresa el tipo: ");
        tipo = s.nextLine();
        System.out.println("Teclea el numero de identificación: ");
        numeroIdentificacion = s.nextLine();
        System.out.println("Esta esterilizado? \n Teclea \n True(Si) \n False(No)");
        estaEsterilizado = s.nextBoolean();
    }
}
