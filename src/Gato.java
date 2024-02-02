import java.util.Scanner;

public class Gato extends Mascotas {
    private boolean estaEsterilzado;

    public boolean isEstaEsterilzado() {
        return estaEsterilzado;
    }

    public void setEstaEsterilzado(boolean estaEsterilzado) {
        this.estaEsterilzado = estaEsterilzado;
    }

    public void leerDatos2(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del gato: ");
        nombre = s.nextLine(); // Lee una cadena de texto desde el teclado
        System.out.println("Responde si tu gato esta operado,diciendo true(verdadero) o false(si no lo esta) ");
         estaEsterilzado= s.nextBoolean();
        Boolean first = new Boolean(false);
        Boolean second = new Boolean("True");






    }



}
