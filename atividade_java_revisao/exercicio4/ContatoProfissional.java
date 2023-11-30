class ContatoProfissional extends Contato {
    private String empresa;

    public ContatoProfissional(String nome, String email, String empresa) {
        super(nome, email);
        this.empresa = empresa;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Empresa: " + empresa);
    }
}
