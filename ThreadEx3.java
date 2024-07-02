package thread;

public class ThreadEx3 {

	public static void main(String[] args) //throws InterruptedException
	{
		System.out.println("Thread starts....");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread Ends");

	}

}
