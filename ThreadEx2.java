package thread;

public class ThreadEx2 implements Runnable {


	public static void main(String[] args) {
		 ThreadEx2 t=new ThreadEx2();
	     Thread th=new Thread(t);
	     th.start();

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Thread starts");
		}

	}

