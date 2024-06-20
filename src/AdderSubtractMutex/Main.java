package AdderSubtractMutex;

import SynchronizationProblem.Adder;
import SynchronizationProblem.Count;
import SynchronizationProblem.Subtraction;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count1 count = new Count1(0);

        Lock lock = new ReentrantLock();

        Adder1 adder = new Adder1(count, lock);
        Subtraction1 subtraction = new Subtraction1(count,lock);

        Thread thread1 = new Thread(adder);
        Thread thread2 = new Thread(subtraction);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(count.value);
    }
}
