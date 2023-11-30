import java.util.ArrayList;


public class SistemaGestaoFuncionarios {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("João", 5000.0));
        funcionarios.add(new Desenvolvedor("Maria", 4000.0));
        funcionarios.add(new Gerente("Carlos", 5500.0));

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());

            funcionario.realizarTarefa();

            System.out.println();
        }
    }
}