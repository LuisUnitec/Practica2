import java.util.Scanner;

public class Gato extends Mascota {
    private boolean estaEsterilizado;

    public boolean isEstaEsterilizado() {
        return estaEsterilizado;
    }

    public void setEstaEsterilizado(boolean estaEsterilizado) {
        this.estaEsterilizado = estaEsterilizado;
    }

    public void leerDatos() {
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del gato: ");
        nombre = s.nextLine();
        System.out.println("Teclea el tipo de gato: ");
        tipo = s.nextLine();
        System.out.println("Teclea el numero de identidficación: ");
        numeroIdentificacion = s.nextLine();
        System.out.println("Teclea la fecha de nacimiento: ");
        fechaNacimiento = null;
        System.out.println("El gato esta esterilizado (Si/No):");
        if (s.next() == "si"){
            estaEsterilizado = true;
        }else{
            estaEsterilizado = false;
        }

    }
    @Override
    public String toString() {
        return nombre + " - Es del tipo: " + tipo + " - Esta esterilizado: " + estaEsterilizado;
    }
}
