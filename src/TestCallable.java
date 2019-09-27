import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(10);
		
		Future<String> result=executor.submit(new TestCallable());
		
		ArrayList<Integer> arrList=new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		Integer[] arr1=arrList.stream().toArray(Integer[]::new);
		
		System.out.println("arr1"+Arrays.toString(arr1));
		try {
			System.out.println(result.get());
		} catch (InterruptedException |ExecutionException e) {
			e.printStackTrace();
		} 
		
		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		    	Thread.sleep(1000);
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		    	Thread.sleep(1000);
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		    	Thread.sleep(1000);
		        return "Task 3";
		    }
		});
		
		
//			String result1=executor.invokeAny(callables);
			List<Future<String>> results;
			try {
				results = executor.invokeAll(callables);
				results.forEach(i->{
					
					try {
						System.out.println("result "+i.get());
					} catch (InterruptedException | ExecutionException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			});
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				executor.shutdown();
			}
			
		
	}
}
