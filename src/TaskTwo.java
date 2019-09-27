
public class TaskTwo implements Runnable {

	@Override
	public void run() {
		int i=0;
		while (i<10) {
			System.out.println("Executing taks 2 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
          i++;
		}
	}

}
