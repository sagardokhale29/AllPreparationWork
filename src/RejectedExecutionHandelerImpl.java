import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedExecutionHandelerImpl implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable runnable, ThreadPoolExecutor arg1) {
		System.out.println(runnable.toString() + " : I've been rejected ! ");
	}

}
