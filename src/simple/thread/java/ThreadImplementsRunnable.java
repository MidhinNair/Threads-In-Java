package simple.thread.java;

public class ThreadImplementsRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread 1 start");
        for(int i=1;i<=10;i++){
            System.out.println( Thread.currentThread().getName() +"  The value is " + i);
            try{Thread.sleep(2000);}catch(Exception e){};
        }
        System.out.println("  Thread 1 end");
    }


}
