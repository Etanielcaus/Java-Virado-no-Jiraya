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

//    private static synchronized void print(){
////
//    }
//    ou
//    private static void pritn(){
//        synchronized (){
//
//        }
//    }

    public static void main(String[] args) {
        ThreadAccountTest01 thread = new ThreadAccountTest01();
        Thread t1 = new Thread(thread, "joao");
        Thread t2 = new Thread(thread, "Pedro");

        t1.start();
        t2.start();


    }

    private void withdraw(int amount) {
        System.out.println(getThreadName() + " ====thread rodado fora====");

        synchronized (account) {
            System.out.println(getThreadName() + " ====thread rodado dentro====");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " esta indo sacar dinheiro.");
                account.withdraw(amount);
//                try {
//                    Thread.sleep(10000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println(getThreadName() + " completou o saque, valor atual da conta "
                        + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque."
                        + account.getBalance());
            }
        }

    }

    private static String getThreadName() {
        return Thread.currentThread().getName();
    }
}
