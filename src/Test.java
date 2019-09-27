import java.util.HashMap;

public class  Test extends Immutable
{
	
	Test(){
		super(8,"sagar");
	}
	
	public static void main(String[] args) {
		Test t=new Test();
		
		HashMap<Employee,Integer> hmap =new HashMap<>();
		hmap.put(new Employee(1,"Sagar"),1);
		hmap.put(new Employee(1,"Nilesh"),1);
		hmap.put(new Employee(1,"Sagar"),1);
		System.out.println(hmap.size());
		}

}
