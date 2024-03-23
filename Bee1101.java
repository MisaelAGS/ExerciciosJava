import java.util.Scanner;
public class Bee1101{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int M, N, soma;
        M = sc.nextInt();
        N = sc.nextInt();
        while (M > 0 && N > 0){
            soma = 0;
            if (M > N){
                int aux;
                aux = N;
                N = M;
                M = aux;
            }
            for (int i = M; i <= N; i++){
                System.out.printf("%d ", i);
                soma += i;
            }
            System.out.printf("Sum=%d\n", soma);
            M = sc.nextInt();
            N = sc.nextInt();
        }
    }
}