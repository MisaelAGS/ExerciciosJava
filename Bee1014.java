import java.util.Scanner;
import java.util.Locale;

public class Bee1014{
    public static void main(String[]args){

        //Entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int km;
        double qtd_litros, km_l;
        km = sc.nextInt();
        qtd_litros = sc.nextDouble();

        //Processamento de dados
        km_l = (double) km / qtd_litros;

        //Saída de dados
        System.out.printf("%.3f km/l\n", km_l);

        sc.close();
    }
}