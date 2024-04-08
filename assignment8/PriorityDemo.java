public class PriorityDemo {
    public static void main(String[] args) {
        // Create two threads
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");

        // Get and display the default priority of the threads
        System.out.println(t1.getName() + " default priority: " + t1.getPriority());
        System.out.println(t2.getName() + " default priority: " + t2.getPriority());

        // Set priorities for the threads
        t1.setPriority(Thread.MAX_PRIORITY); // Set to maximum priority
        t2.setPriority(Thread.MIN_PRIORITY); // Set to minimum priority

        // Display the updated priorities
        System.out.println(t1.getName() + " updated priority: " + t1.getPriority());
        System.out.println(t2.getName() + " updated priority: " + t2.getPriority());

        // Start the threads
        t1.start();
        t2.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running.");
        }
    }
}
