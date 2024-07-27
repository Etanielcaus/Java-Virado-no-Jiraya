package academy.devdojo.devdojoacademy.javacore.ZZFthreads.test;

import academy.devdojo.devdojoacademy.javacore.ZZFthreads.Serveice.EmailDeliveryService;
import academy.devdojo.devdojoacademy.javacore.ZZFthreads.dominio.Members;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread jiraya = new Thread(new EmailDeliveryService(members), "Jiraya");
        Thread takashi = new Thread(new EmailDeliveryService(members), "Takashi");

        jiraya.start();
        takashi.start();

        while (true){
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if (email == null || email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }
    }
}
