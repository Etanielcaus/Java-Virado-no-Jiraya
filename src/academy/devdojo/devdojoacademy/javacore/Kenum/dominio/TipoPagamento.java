package academy.devdojo.devdojoacademy.javacore.Kenum.dominio;

public enum TipoPagamento {
    DEBITO(1){
        @Override
        public double calcularDesconto(double valorDesconto) {
            return valorDesconto * 0.1;
        }
    },
    CREDITO(2){
        @Override
        public double calcularDesconto(double valorDesconto) {
            return valorDesconto * 0.5;
        }
    };

    private int valor;
    TipoPagamento(int valor){
        this.valor = valor;
    }

    public abstract double calcularDesconto(double valorDesconto);
}
