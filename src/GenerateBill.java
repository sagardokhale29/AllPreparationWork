import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws NumberFormatException, IOException {
		PlanFactory planFactory=new PlanFactory();
		System.out.println("Enter name of plan for which bill to be generated");
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in)); 
		String planName=null;
     	 planName=br.readLine();
		
		System.out.println("Enter number of units");
		int units=Integer.parseInt(br.readLine());  
		 Plan p = planFactory.getPlan(planName);  
	  
	      System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
	           p.getRate();  
	           p.calculateBill(units);  

	}

}
