    public static void main(String[] args) {
        // Exemplo de uso
        Carro meuCarro = new Carro("Fusca", "Azul", 50);
        meuCarro.ligarMotor();
        meuCarro.acelerar(60);
        meuCarro.frear();
        meuCarro.desligarMotor();

        double precoGasolina = 4.50; // Preço fictício da gasolina
        double valorParaEncher = meuCarro.calcularValorParaEncherTanque(precoGasolina);
        System.out.println("Valor para encher o tanque: R$ " + valorParaEncher);
    }
}