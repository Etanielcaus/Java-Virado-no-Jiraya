package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO(1){
        @Override
        public double calcularDesconto(double valorDoProduto) {
            return valorDoProduto * 0.5;
        }
    },
    CREDITO(2){
        @Override
        public double calcularDesconto(double valorDoProduto) {
            return valorDoProduto * 0.5;
        }
    };

    private double valorDescontando;

    private int valor;
    TipoPagamento(int valor){
        this.valor = valor;
    }

    public abstract double calcularDesconto(double valorDoProduto);
}
