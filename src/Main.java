import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner  scan = new Scanner(System.in);
/*        *//**//*caixa1.logar("111.222.333-11",  "22", "Narciso ");
        *//**//*caixa1.depositar(100.00);
       *//**//*caixa1.sacar(5000.00);*/


        System.out.printf("Saldo: %.2f", caixa1.user1.getSaldo());

        caixa1.depositar(100.00);
    }
}
