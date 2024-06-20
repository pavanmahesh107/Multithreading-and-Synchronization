package ProcessandThreads;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World in Runnable interface, line 1 printed by " +Thread.currentThread().getName());
        System.out.println("Hello World in Runnable interface, line 2 printed by " +Thread.currentThread().getName());
    }
}
