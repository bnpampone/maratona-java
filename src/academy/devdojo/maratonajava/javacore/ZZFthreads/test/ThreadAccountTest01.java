package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Account;

public class ThreadAccountTest01 implements Runnable{
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 ThreadTestAccount = new ThreadAccountTest01();
        Thread t1 = new Thread(ThreadTestAccount, "Hestia");
        Thread t2 = new Thread(ThreadTestAccount, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withDrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("FODEU");
            }
        }
    }

//    private synchronized void withDrawal(int amount){
//        System.out.println(Thread.currentThread().getName() + " dentro do sycronized");
//        if (account.getBalance() >= amount) {
//            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
//            account.withDrawal(amount);
//            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta " + account.getBalance());
//        } else {
//            System.out.println("Sem dinheiro para sacar " + Thread.currentThread().getName() + " efetuar o saque de " + account.getBalance());
//        }
//    }

//    private static void print(){
//        synchronized (ThreadAccountTest01.class){
//
//        }
//    } MUITO POUCO USADO

    // Mais usado, Sincronização de metodos ou blocos de codigo: que precisam ser executados de forma atomica ( A thread que começou precisa ir até o final sem ser interropido por outras threds)
    private void withDrawal(int amount){
            System.out.println(Thread.currentThread().getName() + " $$$fora do sycronized");
        synchronized (account){
            System.out.println(Thread.currentThread().getName() + " ###dentro do sycronized");
        if (account.getBalance() >= amount) {
            System.out.println(Thread.currentThread().getName() + " está indo sacar dinheiro");
            account.withDrawal(amount);
            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta " + account.getBalance());
        } else {
            System.out.println("Sem dinheiro para sacar " + Thread.currentThread().getName() + " efetuar o saque de " + account.getBalance());
        }
        }
    }
}
