import java.util.Scanner;
import java.util.Locale;
public class Bee1118{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod = 1;
        while (cod == 1){
            double X, media, soma = 0.00;
            while (true) {
                X = sc.nextDouble();
                if (X >= 0 && X <= 10) {
                    soma += X;
                    break;
                }
                else {
                    System.out.println("nota invalida");
                }
            }
            while (true) {
                X = sc.nextDouble();
                if (X >= 0 && X <= 10) {
                    soma += X;
                    break;
                }
                else {
                    System.out.println("nota invalida");
                }
            }
            media = soma / 2;
            System.out.printf("media = %.2f\n", media);
            System.out.println("novo calculo (1-sim 2-nao)");
            cod = sc.nextInt();
            if (cod != 1 && cod != 2) {
                while (true){
                    System.out.println("novo calculo (1-sim 2-nao)");
                    cod = sc.nextInt();
                    if (cod == 1){
                        break;
                    }
                    else if (cod == 2) {
                        break;
                    }
                }
            }
        }
    }
}