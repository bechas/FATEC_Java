import java.util.ArrayList;

public class SistemaGerenciamentoVeiculos {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Civic", "Honda", 2022));
        veiculos.add(new Moto("CBR500R", "Honda", 2021));
        veiculos.add(new Caminhao("Actros", "Mercedes-Benz", 2020));

        for (Veiculo veiculo : veiculos) {
            System.out.println("Modelo: " + veiculo.getModelo());
            System.out.println("Marca: " + veiculo.getMarca());
            System.out.println("Ano de Fabricação: " + veiculo.getAnoFabricacao());

            veiculo.acelerar();
            veiculo.abastecer();

            System.out.println();
        }
    }
}