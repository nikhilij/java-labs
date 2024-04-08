public class ThreadStateDemo {

    public static void main(String[] args) {
        // Create a thread
        Thread thread = new Thread(new MyRunnable());

        // Start the thread
        thread.start();

        // Get and display the initial state of the thread
        System.out.println("Initial state of the thread: " + thread.getState());

        try {
            // Wait for the thread to finish
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get and display the final state of the thread
        System.out.println("Final state of the thread: " + thread.getState());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Simulate some work
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
