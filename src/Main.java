import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CaixaBanco caixa1 = new CaixaBanco();
        Scanner scan = new Scanner(System.in);
        caixa1.setUsuarios();

        Integer escolha = -1;

        System.out.println("Caixa Eletronico");

        while (escolha != 5) {

            System.out.print("\n1-login\n2-registro\n3-saque\n4-deposito\n5-sair\n\n");

            escolha = scan.nextInt();
            scan.nextLine();

            switch (escolha) {

                case 1:
                    System.out.println("cpf: ");
                    String cpf = scan.nextLine();
                    System.out.println("senha: ");
                    String senha = scan.nextLine();
                    caixa1.logar(cpf, senha);

                    break;

                case 2:
                    System.out.println("cpf: ");
                    String cpf_ = scan.nextLine();
                    System.out.println("senha: ");
                    String senha_ = scan.nextLine();
                    System.out.println("nome: ");
                    String nome = scan.nextLine();
                    caixa1.registra(cpf_, senha_, nome);
                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:
                    System.out.println("Sistema finalizado");
                    break;
            }


        }
    }
}
