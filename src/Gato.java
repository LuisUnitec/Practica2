import java.util.Scanner;

public class Gato extends Mascota {
   private int numeroIdentificacion;
   private boolean tipo;
    private boolean estaEstarilizado;

    public boolean isEstaEstarilizado() {
        return estaEstarilizado;
    }

    public void setEstaEstarilizado(boolean estaEstarilizado) {
        this.estaEstarilizado = estaEstarilizado;
    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del gato");
        nombre = s.nextLine(); // Lee una cadena de texto desde el teclado
        System.out.println("Teclea el numeroIdentificacion: ");
        numeroIdentificacion = s.nextInt();
        System.out.println("Teclea la dirección ");
        tipo = s.nextBoolean();
    }
}


