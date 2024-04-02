import java.util.Scanner;
import java.util.Locale;

public class Bee1006{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, p1, p2, p3, media;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        p1 = 2.00;
        p2 = 3.00;
        p3 = 5.00;
        media = (A * p1 + B * p2 + C * p3) / (p1 + p2 + p3);

        System.out.printf("MEDIA = %.1f%n", media);
    }
}