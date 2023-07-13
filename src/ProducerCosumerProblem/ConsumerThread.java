package ProducerCosumerProblem;

public class ConsumerThread extends Thread {
    Company c ;
    ConsumerThread(Company c){
        this.c=c;
    }
    public void run(){


        while (true){
            this.c.ConsumeItem();
            try{Thread.sleep(2000);
            }catch (Exception e){

            }
        }

    }
}
