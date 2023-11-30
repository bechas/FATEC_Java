class Eletronico extends Produto {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public void ligar() {
        System.out.println("Ligando o dispositivo eletrônico.");
    }

    @Override
    public void conectarWiFi() {
        System.out.println("Conectando o dispositivo eletrônico ao Wi-Fi.");
    }
}