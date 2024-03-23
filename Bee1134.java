import java.util.Scanner;
public class Bee1134{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int alccol = 0, gasolina = 0, diesel = 0, num;
        while(true){
            num = sc.nextInt();
            if(num == 1){
                alccol++;
            }
            else if(num == 2){
                gasolina++;
            }
            else if(num == 3){
                diesel++;
            }
            else if(num == 4){
                break;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alccol);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);
    }
}