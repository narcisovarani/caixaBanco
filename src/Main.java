import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner scan = new Scanner(System.in);
        caixa1.setUsuarios();
        caixa1.logar("324.360.618-74", "123");
        caixa1.registra("123.123.123-00", "000", "novo");
    }
}
