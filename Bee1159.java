import java.util.Scanner;
public class Bee1159{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int X, soma = 0;
        X = sc.nextInt();
        while (X != 0){
            if (X % 2 == 0){
                for (int i = 0; i < 5; i++){
                    soma += X;
                    X += 2;
                }
            }
            else {
                X++;
                for (int i = 0; i < 5; i++){
                    soma += X;
                    X += 2;
                }
            }
            System.out.println(soma);
            soma = 0;
            X = sc.nextInt();
        }
    }
}
