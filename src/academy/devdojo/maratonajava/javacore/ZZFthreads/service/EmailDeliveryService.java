package academy.devdojo.maratonajava.javacore.ZZFthreads.service;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;

public class EmailDeliveryService implements Runnable{
    private final Members members;

    public EmailDeliveryService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting to delivery emails...");
        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String email = members.retriveEmail();
                if (email == null) continue;
                System.out.println(Thread.currentThread().getName() + " enviando email para " + email);
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " enviou email com sucesso para " + email);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos os emails foram enviados com sucesso!");
    }
}
