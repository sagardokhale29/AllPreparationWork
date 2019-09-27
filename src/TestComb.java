import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class TestComb {
	
	private int id=10;
	public TestComb(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public TestComb() {
		super();
		// TODO Auto-generated constructor stub
	}

	String name ;
	int age;
	
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return 1;
	}*/

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestComb other = (TestComb) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;*/
		return false;
	}

	static {
		System.out.println("test..");
	}
	
	public static void main(String[] args) {
         HashSet<TestComb> test=new HashSet<>();
        // @formatter:off
		 
		// @formatter:on

         TestComb t=new TestComb(1,"Sagar",30);
         TestComb t1=t;
         test.add(t);
         test.add(t1);
         System.out.println(t.hashCode()+" "+t1.hashCode());
         System.out.println("test size "+test.size());
         
	}

	
}
