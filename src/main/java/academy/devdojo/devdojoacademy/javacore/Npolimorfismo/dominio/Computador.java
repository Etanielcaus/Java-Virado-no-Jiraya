package academy.devdojo.devdojoacademy.javacore.Npolimorfismo.dominio;

public class Computador extends Produto {

   public static final double IMPOSTO_POR_CENTO = 0.21;
    @Override
    public double calcularImposto() {
        System.out.println("Calculando Importo do Computador.");
        return this.valor * IMPOSTO_POR_CENTO;
    }

    public Computador(String nome, double valor) {
        super(nome, valor);
    }


}
