import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CandleWaxProblem implements Cloneable{
public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int numberOfTestCases=0;
		System.out.println("Please enter number");
		if(scanner.hasNextInt())
			numberOfTestCases=scanner.nextInt()+1;
		
		List<String> tokens = new ArrayList<>();	
		while (numberOfTestCases!=0 && scanner.hasNext()) {
			tokens.add(scanner.nextLine());
			numberOfTestCases--;
		}
		scanner.close();	
		System.out.println(tokens);
		
		tokens.stream().filter(i->i!=null && !i.isEmpty()).forEach(j->{
			String [] arr=j.split("\\s");
			calculateNumberOfCandles(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]),Integer.parseInt(arr[2]));
		});

}


@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

public static void calculateNumberOfCandles(int n,int c,int m) {
	
	int numberOfCandles=n/c+(n/c)/m+(n/c)%m;
	System.out.println("numberOfCandles:-"+numberOfCandles);
	
}
}
