import java.util.Scanner;
public class Bee1146{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int X;
        while (true){
            X = sc.nextInt();
            if (X == 0){
                break;
            }
            for (int i = 1; i <= X; i++){
                if (i != X){
                    System.out.printf("%d ", i);
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
}