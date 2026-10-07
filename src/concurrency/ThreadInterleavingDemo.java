package concurrency;

class PrintTask implements Runnable {
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        for(int i = 1; i <= 5; i++){
            System.out.println(name + ": " + i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class ThreadInterleavingDemo {
    public static void main(String[] args){
        Thread threadA = new Thread(new PrintTask(), "Thread-A");
        Thread threadB = new Thread(new PrintTask(), "Thread-B");
        Thread threadC = new Thread(new PrintTask(), "Thread-C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
// The Thread Execution is based on the scheduling behavior
// so the order of output is not deterministic