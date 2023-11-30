class Caminhao extends Veiculo {
    public Caminhao(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Caminhão acelerando.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo o caminhão com diesel.");
    }
}