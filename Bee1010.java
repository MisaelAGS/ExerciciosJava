import java.util.Scanner;
import java.util.Locale;

public class Bee1010{
    public static void main(String[]args){

        //Entrada de dados

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod_p1, cod_p2, qtd_p1, qtd_p2;
        double valor_p1, valor_p2, valor_pagar;
        cod_p1 = sc.nextInt();
        qtd_p1 = sc.nextInt();
        valor_p1 = sc.nextDouble();
        cod_p2 = sc.nextInt();
        qtd_p2 = sc.nextInt();
        valor_p2 = sc.nextDouble();

        //Processamento de dados

        valor_pagar = (qtd_p1 * valor_p1) + (qtd_p2 * valor_p2);

        //Saída de dados

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor_pagar);

        sc.close();
    }
}