import java.util.Scanner;
import java.util.Locale;

public class Bee1009{
    public static void main(String[]args){

        //Entrada de dados

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        double salario_fixo, total_vendas, valor_comissao, total_recebido;

        nome = sc.nextLine();
        salario_fixo = sc.nextDouble();
        total_vendas = sc.nextDouble();
        valor_comissao = 0.15;

        //Processamento de dados

        total_recebido = salario_fixo + (total_vendas * valor_comissao);

        //Saída de dados

        System.out.printf("TOTAL = R$ %.2f%n", total_recebido);

        sc.close();

    }
}