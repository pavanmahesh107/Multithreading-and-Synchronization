package SynchronizationMethod;

public class Count {
    private int value;

    public Count(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    //If we declare a method synchronized in a class, then only one thread can be present
    //inside any synchronized method on that object at a time.

    public synchronized void incrementCount(int i){
        this.value += i;
    }
}
