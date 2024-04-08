public class EvenOddSeparate {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        StringBuilder evenBuffer = new StringBuilder();
        StringBuilder oddBuffer = new StringBuilder();

        Thread evenThread = new Thread(new EvenPrinter(numbers, evenBuffer), "EvenThread");
        Thread oddThread = new Thread(new OddPrinter(numbers, oddBuffer), "OddThread");

        evenThread.start();
        oddThread.start();

        try {
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Even Numbers:");
        System.out.println(evenBuffer.toString());

        System.out.println("Odd Numbers:");
        System.out.println(oddBuffer.toString());
    }
}

class EvenPrinter implements Runnable {
    private final int[] numbers;
    private final StringBuilder buffer;

    EvenPrinter(int[] numbers, StringBuilder buffer) {
        this.numbers = numbers;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int num : numbers) {
            if (num % 2 == 0) {
                synchronized (buffer) {
                    buffer.append(num).append(" ");
                }
            }
        }
    }
}

class OddPrinter implements Runnable {
    private final int[] numbers;
    private final StringBuilder buffer;

    OddPrinter(int[] numbers, StringBuilder buffer) {
        this.numbers = numbers;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int num : numbers) {
            if (num % 2 != 0) {
                synchronized (buffer) {
                    buffer.append(num).append(" ");
                }
            }
        }
    }
}
