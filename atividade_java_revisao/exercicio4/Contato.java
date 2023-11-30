abstract class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public abstract void exibirDetalhes();

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
