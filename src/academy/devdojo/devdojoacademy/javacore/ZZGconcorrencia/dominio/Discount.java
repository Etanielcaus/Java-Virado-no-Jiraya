package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.dominio;


public class Discount {
    public enum Code {
        NONE(0), SUPER(5), SUPER2(10), SUPER3(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
