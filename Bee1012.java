import java.util.Locale;
import java.util.Scanner;

public class Bee1012{
    public static void main(String[]args){

        //Entrada de dados

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        //Processamento de dados

        //a)
        triangulo = (A * C) / 2;

        //b)
        circulo = 3.14159 * Math.pow(C, 2);

        //c)
        trapezio = (A + B) * C / 2;

        //d)
        quadrado = Math.pow(B, 2);

        //e)
        retangulo = A * B;


        //Saída de dados

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        sc.close();
    }
}