package ExampSyncMethod;

 public class Count2 {

    private int value;

     Count2(int value){
        this.value = value;
    }

    public synchronized void incvalue(){
        for(int i = 1; i<=1000000;i++){
            value += i;
        }
    }

    public synchronized void decValue(){
       for(int i =1;i<=1000000;i++){
           value -= i;
       }
    }

    @Override
     public String toString(){
         return String.valueOf(value);
    }
}
