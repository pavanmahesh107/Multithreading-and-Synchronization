package ExecutorService;

public class NumberPrinter implements Runnable {
    private int number;

    public NumberPrinter(int x) {
        this.number = x;
    }

    @Override
    public void run() {
        System.out.println(number + " is printed by " + Thread.currentThread().getName());
    }
}
