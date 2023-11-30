class ContatoPessoal extends Contato {
    private String telefone;

    public ContatoPessoal(String nome, String email, String telefone) {
        super(nome, email);
        this.telefone = telefone;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + telefone);
    }
}