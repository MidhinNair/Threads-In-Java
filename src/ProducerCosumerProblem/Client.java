package ProducerCosumerProblem;

public class Client {
    public static void main(String[] args) {
        Company c = new Company();
        ConsumerThread ct = new ConsumerThread(c);
        ProducerThread pt = new ProducerThread(c);
        pt.start();
        ct.start();

    }
}
