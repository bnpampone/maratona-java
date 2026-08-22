package academy.devdojo.maratonajava.javacore.ZZFthreads.exercises;

import java.util.LinkedList;
import java.util.Queue;

class Order {
    private int id;
    private String client;

    public Order(int id, String client) {
        this.id = id;
        this.client = client;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public String getClient() {
        return client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", client='" + client + '\'' +
                '}';
    }
}

class OrderQueue implements Runnable {
    private final Queue<Order> orders = new LinkedList<>();
    private boolean producerFinished = false;


    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        if (threadName.equals("Producer")) {
            for (int i = 1; i <= 20; i++) {
                Order order = new Order(i, "Cliente " + i);

                synchronized (orders) {
                    orders.add(order);
                    System.out.println(threadName + " have been added successfully " + order.getClient() + " to List");
                    orders.notifyAll();
                }
            }

            synchronized (orders) {
                producerFinished = true;
                orders.notifyAll();
            }

        } else {
            while (true) {
                Order order;

                synchronized (orders) {
                    while (orders.isEmpty() && !producerFinished) {
                        try {
                            System.out.println(threadName + " has entered wait mode");
                            orders.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    if (orders.isEmpty() && producerFinished) {
                        break;
                    }

                    order = orders.poll(); // Se a lista NÃO ESTIVER VAZIA, pegue o ultimo elemento presente na List
                }
                try {
                    Thread.sleep(1000);
                    System.out.println(threadName + "processed successfully " + order.toString());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class exercises05 {
    public static void main(String[] args) {
        OrderQueue queue = new OrderQueue();

        Thread producer = new Thread(queue, "Producer"); // Producer
        Thread worker1 = new Thread(queue, "Worker 1"); // Consumers
        Thread worker2 = new Thread(queue, "Worker 2");
        Thread worker3 = new Thread(queue, "Worker 3");

        producer.start();
        worker1.start();
        worker2.start();
        worker3.start();
    }
}
