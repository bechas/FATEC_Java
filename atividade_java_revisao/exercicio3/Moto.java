class Moto extends Veiculo {
    public Moto(String modelo, String marca, int anoFabricacao) {
        super(modelo, marca, anoFabricacao);
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando.");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo a moto com gasolina.");
    }
}