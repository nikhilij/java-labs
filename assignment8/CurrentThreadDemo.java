// package assignment8;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        // Get a reference to the current thread
        Thread currentThread = Thread.currentThread();

        // Display information about the current thread
        System.out.println("Name of the current thread: " + currentThread.getName());
        System.out.println("ID of the current thread: " + currentThread.getId());
        System.out.println("Priority of the current thread: " + currentThread.getPriority());
        System.out.println("State of the current thread: " + currentThread.getState());
        System.out.println("Thread group of the current thread: " + currentThread.getThreadGroup());
    }
}
