
public class TaskThree implements Runnable {

	@Override
	public void run() {
		System.out.println("Executing taks 3");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
