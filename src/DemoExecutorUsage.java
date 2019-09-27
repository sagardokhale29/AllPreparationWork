import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class DemoExecutorUsage {
	
	private static ExecutorService executor;
	private static volatile Future taskOneResults;
	private static volatile Future taskTwoResults;
	
	
	public static void main(String[] args) {
		executor=Executors.newFixedThreadPool(2);
		
		System.out.println("Number of processor.."+Runtime.getRuntime().availableProcessors());
		while(true) {
			checkTasks();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


	private static void checkTasks() {

		if(taskOneResults==null ||taskOneResults.isDone()||taskOneResults.isCancelled()) {
			if(taskOneResults!=null)
			 System.out.println("taskOneResults.isDone() "+taskOneResults.isDone());
			taskOneResults=executor.submit(new TaskOne());
			
		}
		
     if(taskTwoResults==null ||taskTwoResults.isDone()||taskTwoResults.isCancelled()) {
    	 if(taskTwoResults!=null)
    	   System.out.println("taskTwoResults.isDone() "+taskTwoResults.isDone());
    	 taskTwoResults=executor.submit(new TaskTwo());
			
		}
	}

}
