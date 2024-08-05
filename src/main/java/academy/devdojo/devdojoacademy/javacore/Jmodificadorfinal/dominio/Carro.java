package academy.devdojo.devdojoacademy.javacore.Jmodificadorfinal.dominio;
// com final, a classe não pode ser estendida
public class Carro {
    private String nome;
    public final Comprador COMPRADOR = new Comprador();
    private int velocidade;
    // Declaração de uma constante.
    private static final double VELOCIDADE_LIMITE = 250;
    private final double VELOCIDADE_INICIAL = 130;

    // Exemplo de uso de uma constante, não é possível utilizar ou criar um get ou set para uma const estática.
    public void multar(){
        if (this.velocidade > VELOCIDADE_LIMITE){
            System.out.println("Você foi multado...");
            System.out.println("A velocidade final é de: " + VELOCIDADE_LIMITE + "Km/h e você passou a " + getVelocidade());
            System.out.println("Portanto, você passou " + (this.velocidade - VELOCIDADE_LIMITE) + " acima da velocidade final.");
        } else {
            System.out.println("Você não foi multado...");
        }
        }

    public final void imprime(){
        System.out.println(this.nome);
    }
    public double getVELOCIDADE_INICIAL() {
        return VELOCIDADE_INICIAL;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
