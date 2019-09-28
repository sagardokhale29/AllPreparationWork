import java.util.HashSet;

public class InputOutput {
	String name;
	int id;
	int salary;
	public static void main(String [] args) {
		
		HashSet<InputOutput> hset=new HashSet<>();
		InputOutput i=new InputOutput();
		i.name="Sagar";
		i.id=12;
		i.salary=85000;
		hset.add(i);
		i=new InputOutput();
		i.name="Varsha";
		hset.add(i);
		modify(hset);
		i=new InputOutput();
		i.name="Sunil";
		hset.add(i);
		hset.forEach(j->{
			System.out.println(j);
		});
		
	}
	
	@Override
	public String toString() {
		return "InputOutput [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

	public static void modify(HashSet<InputOutput> hset1) {
		InputOutput i1=new InputOutput();
		i1.name="Sanket";
		InputOutput i2=new InputOutput();
		i2.name="Pooja";
		hset1.add(i1);
		hset1.add(i2);
		hset1=new HashSet<>();
		i2=new InputOutput();
		i2.name="Suresh";
		hset1.add(i2);
		
	}

}
