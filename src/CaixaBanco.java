import java.util.ArrayList;

public class CaixaBanco {
    private String usuarioLogado;
    private Boolean logado = false;
    /*private ArrayList<Object> usuarios = new ArrayList<>();*//**/

 Usuario user1 = new Usuario(2000.00, "324.360.618-74", "123", "Narciso");


    /*public CaixaBanco(ArrayList<Object> usuarios) {
        this.usuarios = usuarios;

        usuarios.add(new Usuario(2000.00, "324.360.618-74", "123", "Narciso"));*//**//*
    }*/

    /*public void setUsuarios(){
    usuarios.add(new Usuario(2000.00, "324.360.618-74", "123", "Narciso"));
}*/


    public Boolean verificaLogin(String cpf, String nomeDeUsuario, String senha) {
        if (logado) {
            if (user1.getCpf() == cpf) {
                return true;
            }
            else {
                logado=true;
                user1.setCpf(cpf);
                user1.setSenha(senha);
                this.usuarioLogado= user1.getNome();
                return true;
            }
        }

        logado=true;
        user1.setCpf(cpf);
        user1.setSenha(senha);
        this.usuarioLogado= user1.getNome();

        return true;
    }
    public void logar(String cpf, String senha, String nomeDeUsuario) {
        verificaLogin(cpf, nomeDeUsuario, senha);
        System.out.printf("usuario logado: %s", this.usuarioLogado);

    }

    public void depositar(Double valor){
        user1.setSaldo(valor + user1.getSaldo());
        System.out.printf("\nSaldo Atual: %.2f ", user1.getSaldo());
    }

    public void sacar(Double valor){
        if (user1.getSaldo()-valor<-600.00)
        {
            System.out.println("Saque nao realizado, voce ultrapassou seu limite de credito");

    }

        else {
            user1.setSaldo(user1.getSaldo() -valor);
            System.out.printf("saldo atual: %.2f", this.user1.getSaldo());
        }
    }
}