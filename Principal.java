import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Telefono telefonoAntiguo = new Telefono("Samsung", +57 3206784510, "Samsung", 128, true, "Negro");
        Telefono telefonoNuevo = new Telefono("iphone", +57 3036781452, "iPhone", 256, false, "Morado");
       
        telefonoUno.mostrarInfo();
        System.out.println("\n");
        telefonoDos.mostrarInfo();
        System.out.println("\n");
    }
}
