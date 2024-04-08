import java.util.Locale;
import java.util.Scanner;

public class Bee1011{
    public static void main(String[]args){

        //Entrada de dados

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio, pi, volume;
        raio = sc.nextDouble();
        pi = 3.14159;

        //Processamento de dados

        volume = (4.0 / 3) * pi * Math.pow(raio, 3);

        //Saída de dados

        System.out.printf("VOLUME = %.3f%n", volume);

        sc.close();
    }
}