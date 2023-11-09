public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void solicitarMaterial() {
        System.out.println(nome + " solicitou material.");
    }
}