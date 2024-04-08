import java.util.Scanner;
import java.util.Locale;

public class Bee1015{
    public static void main(String[]args){

        //Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double x1, x2, y1, y2, dist;
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        //Processamento de dados
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        //Saída de dados
        System.out.printf("%.4f%n", dist);

        sc.close();
    }
}