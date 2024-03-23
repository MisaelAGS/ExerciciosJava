import java.util.Scanner;
public class Bee1114{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int senha_correta = 2002;
        int senha_digitada;
        String msg;
        do {
            senha_digitada = sc.nextInt();
            if(senha_digitada == senha_correta){
                msg = "Acesso Permitido";
            }
            else{
                msg = "Senha Invalida";
            }
            System.out.println(msg);
        }while (msg.equals("Senha Invalida"));
    }
}