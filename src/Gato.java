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
        return "El nombre del gato es: " + nombre + "El número de identificación es: " + numId + "¿El gato está esterilizado?" + estaEsterilizado;
    }
    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del gato");
        nombre = s.nextLine();
        System.out.println("Teclea el número de identificación del gato");
        numId = s.nextLine();
        System.out.println("Teclea 'true' si el gato está esterilizado y 'false' si no lo está");
        estaEsterilizado = s.nextBoolean();
    }

}


