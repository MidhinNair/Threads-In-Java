package ProducerCosumerProblem;

public class Company {
    int n;

    // for different sleep time it gone to be make problem so,
    // we need to develop "inter thread communication"
    boolean communication = false;//producerTread will produce


    synchronized public  void  produceItem(int n){
        if(communication){
            try {
                wait();
            }catch (Exception e){

            }
        }
        this.n=n;
        System.out.println("Produced" + this.n);
        communication= true;
        notify();
    }
    synchronized public int ConsumeItem(){
        // true Consumer Wait until complete after produce then consumer will consume
        if(!communication){
            try {
                wait();
            }catch (Exception e){

            }
        }
        System.out.println("Consumed" + this.n);
        communication = false;
        notify();
        return  this.n;
    }
}
