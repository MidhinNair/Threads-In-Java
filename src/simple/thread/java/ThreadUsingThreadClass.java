package simple.thread.java;

public class ThreadUsingThreadClass extends Thread {
    public void run(){
        System.out.println("Thread 0 Start");
        for(int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName() + "  The value is "+ i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){

            }
            System.out.println(" Thread 0 end");
        }
    }
}



