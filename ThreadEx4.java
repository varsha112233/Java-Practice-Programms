package thread;

public class ThreadEx4 {

	public static void main(String[] args) {
		 System.out.println("Countdown Started...");
	       try {
	       for(int i=5;i>=1;i--)
	       {
	    	   System.out.println(i);
				Thread.sleep(3000);
			} 
	       }
	       
	       catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	       System.out.println("Winner is.....XXXX");
	       }
		}
