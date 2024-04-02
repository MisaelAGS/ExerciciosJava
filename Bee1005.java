import java.util.Scanner;
import java.util.Locale;

public class Bee1005{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, p1, p2, media;

        A = sc.nextDouble();
        B = sc.nextDouble();
        p1 = 3.50;
        p2 = 7.50;
        media = (A * p1 + B * p2) / (p1 + p2);

        System.out.printf("MEDIA = %.5f%n", media);
    }
}