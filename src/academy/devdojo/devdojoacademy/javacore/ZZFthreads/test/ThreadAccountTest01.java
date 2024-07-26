package academy.devdojo.devdojoacademy.javacore.ZZFthreads.test;

import academy.devdojo.devdojoacademy.javacore.ZZFthreads.test.dominio.Account;

public class ThreadAccountTest01 implements Runnable {
    private Account account = new Account();

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("Account balance is negative");
            }
        }
    }

    public static void main(String[] args) {
        ThreadAccountTest01 thread = new ThreadAccountTest01();
        Thread t1 = new Thread(thread, "joao");
        Thread t2 = new Thread(thread, "Pedro");

        t1.start();
        t2.start();


    }

    private void withdraw(int amount) {
        if (account.getBalance() >= amount) {
            System.out.println(getThreadName() + " esta indo sacar dinheiro.");
            account.withdraw(amount);
            System.out.println(getThreadName() + " completou o saque, valor atual da conta "
                    + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque."
                    + account.getBalance());
        }
    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
