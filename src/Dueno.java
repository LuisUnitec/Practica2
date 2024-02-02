import java.util.List;
import java.util.Scanner;

public class Dueno {
    private String nombre;
    private int edad;
    private String numTel;
    private String direccion;
    private List<Mascota> listaMascotas;
    @Override
    public String toString(){
        return nombre + "- Telefono: " + numTel;
    }

    public void leerDatos(){
        Scanner s = new Scanner(System.in);
        System.out.println("Teclea el nombre del dueño:");
        nombre = s.nextLine();
        System.out.println("Teclea el número de teléfono del dueño");
        numTel = s.nextLine();
        System.out.println("Teclea la dirección del dueño");
        direccion = s.nextLine();
        System.out.println("Teclea la edad del dueño");
        edad = s.nextInt();

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(List<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }
}
