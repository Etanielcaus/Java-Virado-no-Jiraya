package academy.devdojo.devdojoacademy.javacore.ZZFthreads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendigEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email){
        synchronized (this.emails){
            String nameThread = Thread.currentThread().getName();
            System.out.println(nameThread + " Adicionou email na lista");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (this.emails){
            while(this.emails.isEmpty()) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName()+ " Não tem email disponivel na lista." +
                        " Entrando em modo de espera.");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void close(){
        open = false;
        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo que não estamos" +
                    " mais pegando emails.");
        }
    }
}
