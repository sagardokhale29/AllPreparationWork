import java.util.function.Consumer;

public class TestPoly {
	
	
	/*static
	{
		i=10;
	}*/
	
	public String getMessage(Object o) {
		return "Object";
		
	}
	
   public String getMessage(double [] darray) {
		
	   return "Double";
	}
   
   
   public void test() {
	   System.out.println("this is test method");
   }

   public static void main(String[] args) {
	
	   String s=new TestPoly().getMessage(null);
	   System.out.println(s);
	   
	   
	   TestFunctional t= new TestPoly()::test;
	   
	   t.print();
	   
	   
	   try {
		   int i,sum;
		   sum=10;
		   for(i=-1;i<3;++i) {
			   sum=sum/i;
			   System.out.print(i);
			   
		   }
		   
	   }catch(ArithmeticException ae) {
		   System.out.print(0);
	   }
  }
   
}
