import java.util.Scanner;
public class Bee1158{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N, X, Y, soma;
        N = sc.nextInt();
        for (int i = 0; i < N; i++){
            X = sc.nextInt();
            Y = sc.nextInt();
            soma = 0;
            if (X % 2 == 0){
                X++;
            }
            for (int j = 0; j < Y; j++){
                soma += X;
                X += 2;
            }
            System.out.println(soma);
        }
    }
}