public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Ana", 5000);
        Vendedor vendedor1 = new Vendedor("Carlos", 3000);
        Faxineiro faxineiro1 = new Faxineiro("Maria", 1500);

        gerente1.baterPonto();
        gerente1.solicitarMaterial();

        vendedor1.baterPonto();
        vendedor1.realizarVenda();
        vendedor1.fecharCaixa();

        faxineiro1.baterPonto();
        faxineiro1.limparCorredor();
    }
}