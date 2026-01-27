import java.util.Scanner;

//SUM EXERCISE

public class exercise_sum {

    public static void main(String[] args) {
        
        int numero1 = 0;
        int numero2 = 0;
        int resultado;

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        numero1 = reader.nextInt();

        System.out.println("Introduce el segundo numero:");
        numero2 = reader.nextInt();

        resultado = numero1 + numero2;

        System.out.println("La suma es: " + numero1 + " + " + numero2 + " = " + resultado + "");

        reader.close();
    }
}