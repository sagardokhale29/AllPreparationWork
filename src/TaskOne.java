import java.util.LinkedList;

public class TaskOne implements Runnable {

	@Override
	public void run() {
		while (true) {
			System.out.println("Executing taks 1");
			try {
				Thread.sleep(1000);
				Thread.currentThread().wait();
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}

}
