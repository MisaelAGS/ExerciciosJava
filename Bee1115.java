import java.util.Scanner;
public class Bee1115{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int X, Y;
        String quadrante;
        while (true){
            X = sc.nextInt();
            Y = sc.nextInt();
            if(X > 0 && Y > 0){
                quadrante = "primeiro";
            } else if(X > 0 && Y < 0){
                quadrante = "quarto";
            } else if(X < 0 && Y < 0){
                quadrante = "terceiro";
            } else if(X < 0 && Y > 0){
                quadrante = "segundo";
            } else{
                break;
            }
            System.out.println(quadrante);
        }
    }
}