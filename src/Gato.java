import java.util.Scanner;

public class Gato extends Mascota {
    private Boolean estaEsterelizado;

    @Override
    public String toString(){
        return estaEsterelizado + " Esterelizado " + estaEsterelizado;

    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println(" Teclee el nombre de la Mascota: ");
        nombre = s.nextLine();  //Lee una cadena de texto desdel teclado
        System.out.println(" Teclea el tipo de mascota: ");
        tipo = s.nextLine();
        System.out.println(" Teclea su Numero de Identificacion: ");
        númeroIdentificación = s.nextLine();

        System.out.println(" Esterelizado ");
        estaEsterelizado = s.nextBoolean();  //Lee una cadena de texto desdel teclado

    }

    public Boolean getEstaEsterelizado() {
        return estaEsterelizado;
    }

    public void setEstaEsterelizado(Boolean estaEsterelizado) {
        this.estaEsterelizado = estaEsterelizado;
    }
}
