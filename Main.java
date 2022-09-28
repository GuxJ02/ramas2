import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Escriba su nombre");
        nombre = leer.nextLine();
        System.out.println("Escriba su fecha de nacimiento");
        edad = leer.nextInt();
        System.out.println("Su nombre es " + nombre + " y tiene " + edad + " años");

    }
}