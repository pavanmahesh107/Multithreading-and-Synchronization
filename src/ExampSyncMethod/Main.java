package ExampSyncMethod;

import SynchronizationMethod.Count;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Count2 c1 = new Count2(0);
        Count2 c2 = new Count2(0);

        Thread t1 = new Thread(c1::incvalue);
        Thread t2 = new Thread(c1::decValue);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c1);
        System.out.println(c2);
    }
}
