package academy.devdojo.devdojoacademy.javacore.ZZGconcorrencia.dominio;

public class Account {
    private int balance = 50;

    public int withdraw(int amount) {
        this.balance = this.balance - amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }
}
