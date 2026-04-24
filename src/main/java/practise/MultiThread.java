package practise;

public class MultiThread extends Thread {

@Override
    public void run() {
        for(int i=0; i<=5; i++){
            try {
                System.out.println("hello " + (i+1)) ;
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }

        public void disp(int x) {
            System.out.println("number " + x);
        }

}
