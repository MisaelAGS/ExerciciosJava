import java.util.Locale;
import java.util.Scanner;
public class Bee1154{
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int idade, soma = 0, count = 0;
        double media;
        while (true){
            idade = sc.nextInt();
            if (idade >= 0){
                soma += idade;
                count ++;
            }
            else{
                break;
            }
        }
        media = (double) soma / count;
        System.out.printf("%.2f\n", media);
    }
}