package Thread;
 
import java.util.concurrent.Semaphore;
 
class Semaphore_Test2 extends Thread {
 
    private final Semaphore semaphore;
    private String name;
 
    public Semaphore_Test2(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }
 
    public void run() {
        try {
            System.out.println(name + ": acquiring lock...");
            System.out.println(name + ": available Semaphore permits now: " + semaphore.availablePermits());
            semaphore.acquire();
            System.out.println(name + ": got the permit!");
 
            try {
                System.out.println(name + ": is performing operation, available Semaphore permits : "
                        + semaphore.availablePermits());
                Thread.sleep(100); // simulate time to work
            } finally {
                // calling release() after a successful acquire()
                System.out.println(name + ": releasing lock...");
                semaphore.release();
                System.out.println(name + ": available Semaphore permits now: " + semaphore.availablePermits());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Thread_Semaphore {
	 
    private static Semaphore semaphore = new Semaphore(4);
 
    public static void main(String[] args) {
        System.out.println("Total available Semaphore permits: " + semaphore.availablePermits());
        for (int i = 1; i <= 6; i++) {
        	Semaphore_Test2 atmWorker = new Semaphore_Test2(semaphore, "AMT " + i);
            atmWorker.start();
        }
    }
}