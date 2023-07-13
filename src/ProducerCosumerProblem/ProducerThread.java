package ProducerCosumerProblem;

public class ProducerThread extends Thread {
    Company c ;
    ProducerThread(Company c){
        this.c=c;
    }
    public void run(){

        int i=1;
        while (true){
            this.c.produceItem(i);
            i++;
           try{Thread.sleep(1000);
           }catch (Exception e){

           }
        }

    }
}
