class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Gerente realizando tarefa de gerenciamento.");
    }
}