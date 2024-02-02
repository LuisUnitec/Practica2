import java.util.Scanner;

public class Gato extends Mascota {
    private boolean estaEsterilizado;

    @Override
    public String toString(){
        return nombre + " - Telefono:" + estaEsterilizado;
    }

    public void leerDatosgato(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre de la mascota:");
        nombre = s.nextLine();
        System.out.println("Teclea el tipo de mascota:");
        tipo = s.nextLine();
        System.out.println("Teclea el numero de identificacion:");
        numeroIdentificacion = s.nextLine();
        System.out.println("Esterilizado");
        estaEsterilizado = s.nextBoolean();

    }
    }

    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
}
