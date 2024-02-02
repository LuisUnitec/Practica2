import java.util.Scanner;

public class Gato extends Mascotas {
    private boolean estaEsterilizado;

    @Override
    public String toString(){
        return nombre + " - Tipo: " + tipo;
    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del gato:");
        nombre = s.nextLine();
        System.out.println("Teclea el tipo de gato:");
        tipo = s.nextLine();
        System.out.println("Teclea el numero de identificacion:");
        numeroIdentificacion =s.nextLine();
        System.out.println("Esta esterilizado:");
        estaEsterilizado = s.nextBoolean();

    }

    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
}
