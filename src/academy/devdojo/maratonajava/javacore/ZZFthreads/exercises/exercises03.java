package academy.devdojo.maratonajava.javacore.ZZFthreads.exercises;

class AccountManage {
    private double balance = 1000;

    public void withdrawal(double amoount) {
        this.balance -= amoount;
    }

    public double getBalance() {
        return balance;
    }
}

class ExercisesMethod03 implements Runnable {
    private final AccountManage wallet = new AccountManage();

    @Override
    public void run() {
        synchronized (wallet) {
            if (wallet.getBalance() >= 300) {
                wallet.withdrawal(300);
                System.out.println(Thread.currentThread().getName() + " Withdrawal 300 on the wallet, remained " + wallet.getBalance() + " dollars");
            } else {
                System.out.println(Thread.currentThread().getName() + " Inssuficiente funds in the wallet");
            }
        }
    }
}

public class exercises03 {
    public static void main(String[] args) {
        ExercisesMethod03 acc = new ExercisesMethod03();
        Thread t1 = new Thread(acc, "Conta 1");
        Thread t2 = new Thread(acc, "Conta 2");
        Thread t3 = new Thread(acc, "Conta 3");
        Thread t4 = new Thread(acc, "Conta 4");
        Thread t5 = new Thread(acc, "Conta 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}


