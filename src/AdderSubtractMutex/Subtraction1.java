package AdderSubtractMutex;

import java.util.concurrent.locks.Lock;

public class Subtraction1 implements Runnable{
    private Count1 count;
    private Lock lock;

    public Subtraction1(Count1 count, Lock lock){
        this.count = count;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 1000000; i++){
            lock.lock();
            count.value -= i;
            lock.unlock();
        }
    }
}
