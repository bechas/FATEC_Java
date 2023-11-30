class Carro extends Veiculo {
    public Carro(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo o carro com gasolina.");
    }
}