abstract class Veiculo {
    private String modelo;
    private String marca;
    private int anoFabricacao;

    public Veiculo(String modelo, String marca, int anoFabricacao) {
        this.modelo = modelo;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void acelerar();

    public abstract void abastecer();

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}