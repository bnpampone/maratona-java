package academy.devdojo.maratonajava.javacore.ZZFthreads.exercises;

class ExercisesMethod02 implements Runnable{
    @Override
    public void run() {
        System.out.println("Starting to process orders from the " + Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " processing...");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class exercises02 {
    public static void main(String[] args) throws InterruptedException {
        ExercisesMethod02 runnable = new ExercisesMethod02();

        Thread p1 = new Thread(runnable, "Order 1");
        Thread p2 = new Thread(runnable, "Order 2");
        Thread p3 = new Thread(runnable, "Order 3");

        p1.start();
        p2.start();
        p3.start();

        p1.join();
        p2.join();
        p3.join();

        System.out.println("All orders have been processed");
    }
}
