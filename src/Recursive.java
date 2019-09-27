
public class Recursive {
	
	int func(int n) {
		int result;
		if(n==1)
			return 1;
		result=func(n-1);
		return result;
	}
	
	static boolean returnResult() {
		try {
			return false;
		}
		finally {
			return true;
		}
	}
	public static void main(String[] args) {
		System.out.println(new Recursive().func(6));
		System.out.println(returnResult());
		int x=-5,y=2,z=0,m;
		m=++x|++y&++z;
		
		System.out.println(x+" "+y+" "+z+" "+m+" "+Integer.toBinaryString(z));
		
		
		
		
	}

}
