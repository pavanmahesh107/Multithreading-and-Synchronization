package SynchronizationProblem.UsingSynchronizedKeyword;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count(0);
        Adder adder = new Adder(count);
        Subtraction subtraction = new Subtraction(count);

        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtraction);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count.value);
    }
}
