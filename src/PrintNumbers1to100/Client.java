package PrintNumbers1to100;

public class Client {
    public static void main(String[] args) {
        for(int i = 1; i <= 100 ; i++) {
            PrintNumbers printNumbers = new PrintNumbers(i);
            Thread thread = new Thread(printNumbers);
            thread.start();
        }
    }
}
