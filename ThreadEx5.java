package thread;

public class ThreadEx5 {

	public static void main(String[] args) {
		Thread thread1 = new SimpleThread("Thread 1");
	     Thread thread2 = new SimpleThread("Thread 2");
	        
	        thread1.start();
	        thread2.start();
	        
	        // Main thread continues
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Main thread executing task " + i);
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }

	}

}
class SimpleThread extends Thread {
   
   private String threadName;
   
   public SimpleThread(String threadName) {
       this.threadName = threadName;
   }
   
   public void run() {
       System.out.println(threadName + " started.");
       try {
           for (int i = 0; i < 5; i++) {
               System.out.println(threadName + " executing task " + i);
               Thread.sleep(1500);
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       System.out.println(threadName + " ended.");
   }
}
