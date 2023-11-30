class Roupa extends Produto {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void ligar() {
        System.out.println("Não é possível ligar uma peça de roupa.");
    }

    @Override
    public void conectarWiFi() {
        System.out.println("Esta peça de roupa não pode se conectar ao Wi-Fi.");
    }
}