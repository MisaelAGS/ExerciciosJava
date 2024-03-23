import java.util.Scanner;
import java.util.Locale;
public class Bee1117{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        while(true){
            nota1 = sc.nextDouble();
            if(0 <= nota1 && nota1<= 10){
                break;
            }
            else{
                System.out.println("nota invalida");
            }
        }
        while(true){
            nota2 = sc.nextDouble();
            if(0 <= nota2 && nota2 <= 10){
                break;
            }
            else{
                System.out.println("nota invalida");
            }
        }
        media = (nota1 + nota2) / 2;
        System.out.printf("media = %.2f\n", media);
    }
}