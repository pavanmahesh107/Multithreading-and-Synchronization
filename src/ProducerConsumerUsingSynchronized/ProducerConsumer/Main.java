package ProducerConsumerUsingSynchronized.ProducerConsumer;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Object> store = new ArrayDeque<>();
        int maxSize = 6;

        Producer p1 = new Producer(store,maxSize,"P1");
        Producer p2 = new Producer(store,maxSize,"P2");
        Producer p3 = new Producer(store,maxSize,"P3");

        Consumer c1 = new Consumer(store,maxSize,"C1");
        Consumer c2 = new Consumer(store,maxSize,"C2");
        Consumer c3 = new Consumer(store,maxSize,"C3");
        Consumer c4 = new Consumer(store,maxSize,"C4");

        //Producer Threads
        Thread t1 = new Thread(p1);
        t1.start();

        Thread t2 = new Thread(p2);
        t2.start();

        Thread t3 = new Thread(p3);
        t3.start();

        //Consumer Threads
        Thread t4 = new Thread(c1);
        t4.start();

        Thread t5 = new Thread(c2);
        t5.start();

        Thread t6 = new Thread(c3);
        t6.start();

        Thread t7 = new Thread(c4);
        t7.start();

    }
}
