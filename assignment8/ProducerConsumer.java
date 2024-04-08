import java.util.LinkedList;

public class ProducerConsumer {
    public static void main(String[] args) {
        final int CAPACITY = 5;
        LinkedList<Integer> buffer = new LinkedList<>();
        Thread producer = new Thread(new Producer(buffer, CAPACITY), "Producer");
        Thread consumer = new Thread(new Consumer(buffer), "Consumer");

        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable {
    private final LinkedList<Integer> buffer;
    private final int capacity;
    private int value = 0;

    Producer(LinkedList<Integer> buffer, int capacity) {
        this.buffer = buffer;
        this.capacity = capacity;
    }

    @Override
    public void run() {
        while (value < 10) { // Produce values from 0 to 9
            synchronized (buffer) {
                while (buffer.size() == capacity) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Producer produced: " + value);
                buffer.add(value++);
                buffer.notify();
            }
        }
    }
}

class Consumer implements Runnable {
    private final LinkedList<Integer> buffer;

    Consumer(LinkedList<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (buffer) {
                while (buffer.isEmpty()) {
                    try {
                        buffer.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                int val = buffer.removeFirst();
                System.out.println("Consumer consumed: " + val);
                buffer.notify();
            }
        }
    }
}
