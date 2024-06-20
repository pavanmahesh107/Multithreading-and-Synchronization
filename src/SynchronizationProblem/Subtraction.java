package SynchronizationProblem;

public class Subtraction implements Runnable{
    private Count count;
    Subtraction(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i = 1; i<= 100000; i++){
            count.value -= i;
        }
    }
}
