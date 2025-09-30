import java.util.Scanner;

public class ej03 {
    public static void main(String[] args) {
       System.out.println("¿Cúantos años tienes?");
       Scanner sc = new Scanner(System.in);
       int edad = sc.nextInt();
       System.out.println("Tienes " + edad + " años"); 
    }
}