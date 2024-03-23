import java.util.Scanner;
public class Bee1071{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int X, Y, Maior, Menor, soma;
        X = sc.nextInt();
        Y = sc.nextInt();
        Maior = ((X + Y + (Math.abs(X - Y))) / 2);
        Menor = ((X + Y - (Math.abs(X - Y))) / 2);
        soma = 0;
        for (int i = Menor + 1; i < Maior; i++){
            if(i % 2 != 0){
                soma += i;
            }
        }
        System.out.println(soma);
        sc.close();
    }
}