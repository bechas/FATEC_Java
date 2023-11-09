public class Carro {
    private String modelo;
    private String cor;
    private double capacidadeTanque;
    private double nivelCombustivel;
    private boolean motorLigado;
    private int velocidade;

    public Carro(String modelo, String cor, double capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
        this.nivelCombustivel = 0; // Carro começa sem combustível
        this.motorLigado = false; // Carro começa com o motor desligado
        this.velocidade = 0; // Carro começa parado
    }

    // Métodos getters e setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getNivelCombustivel() {
        return nivelCombustivel;
    }

    public void setNivelCombustivel(double nivelCombustivel) {
        this.nivelCombustivel = nivelCombustivel;
    }

    public boolean isMotorLigado() {
        return motorLigado;
    }

    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    // Método para calcular o valor total para encher o tanque
    public double calcularValorParaEncherTanque(double precoGasolina) {
        return (capacidadeTanque - nivelCombustivel) * precoGasolina;
    }

    // Método para ligar o motor
    public void ligarMotor() {
        if (!motorLigado) {
            System.out.println("Ligando o motor.");
            motorLigado = true;
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    // Método para desligar o motor
    public void desligarMotor() {
        if (motorLigado) {
            System.out.println("Desligando o motor.");
            motorLigado = false;
            velocidade = 0; // Se o motor é desligado, a velocidade é zero.
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar(int velocidadeDesejada) {
        if (motorLigado) {
            if (velocidadeDesejada >= 0 && velocidadeDesejada <= 180) {
                System.out.println("Acelerando para " + velocidadeDesejada + " km/h.");
                velocidade = velocidadeDesejada;
            } else {
                System.out.println("Velocidade desejada inválida.");
            }
        } else {
            System.out.println("Não é possível acelerar com o motor desligado.");
        }
    }

    // Método para frear o carro
    public void frear() {
        if (motorLigado) {
            System.out.println("Freando o carro.");
            velocidade = 0;
        } else {
            System.out.println("Não é possível frear com o motor desligado.");
        }
    }