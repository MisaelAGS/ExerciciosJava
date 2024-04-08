import java.util.Scanner;

public class Bee1013{
    public static void main(String[]args){

        //Entrada de dados
        Scanner sc = new Scanner(System.in);
        int A, B, C, X, Y;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        //Processamento de dados
        X = (A + B + Math.abs(A - B)) / 2;
        Y = (X + C + Math.abs(X - C)) / 2;

        //Saída de dados
        System.out.printf("%d eh o maior\n", Y);

        sc.close();
    }
}