package SynchronizationProblem.UsingSynchronizedKeyword;

public class Subtraction implements Runnable{
    private Count count;

    public Subtraction(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 1; i <= 100000; i++){
            synchronized (Count.class) {
                count.value -= i;
            }
        }
    }
}
