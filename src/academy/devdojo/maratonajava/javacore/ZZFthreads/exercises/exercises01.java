package academy.devdojo.maratonajava.javacore.ZZFthreads.exercises;

class ExercisesMethod01 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class exercises01 {
    public static void main(String[] args) {
        ExercisesMethod01 runnable = new ExercisesMethod01();
        Thread t1 = new Thread(runnable, "A");
        Thread t2 = new Thread(runnable, "B");
        Thread t3 = new Thread(runnable, "C");

        t1.start();
        t2.start();
        t3.start();
    }
}
