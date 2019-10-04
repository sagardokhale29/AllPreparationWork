public class Solution implements Runnable{
	
	public int PRINT_NUMBERS_UPTO=98;
	static int  number=1;
	int remainder;
	static Object lock=new Object();
	
   Solution(int remainder){
		this.remainder=remainder;
   }
	
	
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	Thread t1=new Thread(new Solution(1),"t1");
    	Thread t2=new Thread(new Solution(2),"t2");
    	Thread t3=new Thread(new Solution(3),"t3");
    	Thread t4=new Thread(new Solution(4),"t4");
    	Thread t5=new Thread(new Solution(0),"t5");
    	
    	t1.start();
    	t2.start();
    	t3.start();
     	t4.start();
     	t5.start();
    }

	@Override
	public void run() {
		
		while (number < PRINT_NUMBERS_UPTO-1) {
			synchronized (lock) {
				while (number % 5 != remainder) { // wait for numbers other than remainder
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " will print: " + number);
				number++;
				lock.notifyAll();
			}
		
   }
}
	
}