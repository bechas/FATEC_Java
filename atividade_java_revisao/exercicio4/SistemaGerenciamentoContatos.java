import java.util.ArrayList;

public class SistemaGerenciamentoContatos {
    public static void main(String[] args) {
        ArrayList<Contato> contatos = new ArrayList<>();

        contatos.add(new ContatoPessoal("João", "joao@gmail.com", "123-456-789"));
        contatos.add(new ContatoProfissional("Maria", "maria@gmail.com", "ABC Company"));

        for (Contato contato : contatos) {
            contato.exibirDetalhes();
            System.out.println();
        }
    }
}