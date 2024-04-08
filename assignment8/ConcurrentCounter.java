public class ConcurrentCounter {
    private static int count = 0;
    private static final int THREADS = 5;
    private static final int INCREMENTS = 1000;

    public static void main(String[] args) {
        Thread[] threads = new Thread[THREADS];

        for (int i = 0; i < THREADS; i++) {
            threads[i] = new Thread(new Counter(i));
            threads[i].start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final counter value: " + count);
    }

    static class Counter implements Runnable {
        private final int threadID;

        Counter(int threadID) {
            this.threadID = threadID;
        }

        @Override
        public void run() {
            int localCount = 0;
            for (int i = 0; i < INCREMENTS; i++) {
                synchronized (ConcurrentCounter.class) {
                    count++;
                    localCount++;
                }
            }
            System.out.println("Thread " + threadID + " increments: " + localCount);
        }
    }
}
