public class p {

    public static void main(String[] args) {
        Thread mThread = new Thread(new MPrinter());
        Thread wThread = new Thread(new WPrinter());

        mThread.start();
        wThread.start();
    }

    static class MPrinter implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Good morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class WPrinter implements Runnable {
        @Override
        public void run() {
            while (true) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
