import java.util.Scanner;

public class Gato extends Mascota{

    private boolean estaEsterelizado;


    @Override
    public String toString(){
        return nombre+ " - Telefono: ";
    }

    public void leerDatos(){
        Scanner s=new Scanner(System.in);
        System.out.println("Teclea el Nombre del Gato");
        nombre = s.nextLine();
        System.out.println("Teclea el tipo de raza");
        tipo = s.nextLine();
        System.out.println("Teclea el numero de identificacion");
        numeroIdentificacion = s.nextLine();
        System.out.println("Esta esterilizado el gato");
        estaEsterelizado = s.nextBoolean();
    }



    public boolean isEstaEsterelizado() {
        return estaEsterelizado;
    }

    public void setEstaEsterelizado(boolean estaEsterelizado) {
        this.estaEsterelizado = estaEsterelizado;
    }
}


