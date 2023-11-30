class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Desenvolvedor escrevendo código.");
    }
}