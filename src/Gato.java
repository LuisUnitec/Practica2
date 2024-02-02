import java.util.Scanner;

public class Gato extends Mascota {
    private Boolean estaEsterilizado;

    @Override
    public String toString() {
        return nombre + " - Tipo: " + tipo;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserta el nombre del gato: ");
        nombre = s.nextLine();
        System.out.println("Inserta el tipo de gato: ");
        tipo = s.nextLine();
        System.out.println("Ingresa el numero de identificacion");
        numeroIdentificacion = s.nextLine();
        System.out.println("¿Esta esterilizado? ");
        estaEsterilizado = s.nextBoolean();

    }
    public Boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(Boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }
}
