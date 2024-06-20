package PrintNumbers1to100;

public class PrintNumbers implements Runnable{
    private int number;
    PrintNumbers(int x){
        this.number = x;
    }
    @Override
    public void run() {
        System.out.println(number +" is printed by "+Thread.currentThread().getName());
//        for(int i = 0; i <= 100; i++){
//            System.out.println("The number "+i+" is printed by " +Thread.currentThread().getName());
//        }
    }
}
