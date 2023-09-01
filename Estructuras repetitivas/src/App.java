import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner (System.in);

        System.out.println("Sentencias repetitovas");
        System.out.println("sentencia While");
        System.out.println("¿Qué tabla de multipilicar decea ver?");
        byte n = lector.nextByte();
        byte x = 1;
        while (n <= 0){
            System.out.println("No puede ingresar valores menores o iguales a 0");
            System.out.println("¿Qué tabla de multiplicar decea ver?");
            n = lector.nextByte();
        }
        while (x<=10){
            System.out.println(n + " x " + x + " = " + n*x);
            x++;
        }

        System.out.println("Despues del While");
        System.out.println("FIN");
        lector.close();   
    }
}
