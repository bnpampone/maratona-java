package academy.devdojo.maratonajava.javacore.ZZFthreads.exercises;

import java.util.LinkedList;
import java.util.Queue;

class TaskQueue implements Runnable {
    private final Queue<String> tasks = new LinkedList<>();

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        if (threadName.equals("Producer")) {
            for (int i = 1; i <= 10; i++) {
                synchronized (tasks) {
                    tasks.add("Task " + i);
                    System.out.println(threadName + " - " + threadName + " added task " + i);
                    tasks.notifyAll();
                }
            }
        } else {
            while (true) {
                String task;

                synchronized (tasks) {
                    while (tasks.isEmpty()) { // Enquanto a Lista de Tasks estiver vazia
                        try {
                            System.out.println(Thread.currentThread().getName() + " ====> Consumers waiting for as task...");
                            tasks.wait(); // Adicione-as Threads Consumidoras ao modo wait...
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    task = tasks.poll(); // Se a lista NÃO ESTIVER VAZIA, pegue a primeira TASK
                }
                    System.out.println(threadName + " processed successfully " + task);
            }
        }
    }
}

public class exercises04 {
    public static void main(String[] args) {
        TaskQueue queue = new TaskQueue();

        Thread producer = new Thread(queue, "Producer");
        Thread consumer1 = new Thread(queue, "Consumer1");
        Thread consumer2 = new Thread(queue, "Consumer2");
        Thread consumer3 = new Thread(queue, "Consumer3");

        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();

    }
}
