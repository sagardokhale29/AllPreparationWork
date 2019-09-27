
public class TestInherit extends Employee  {
	
	int a;
	
	TestInherit(){
		System.out.println("sub class constructor.."+this.hashCode());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + a;
		System.out.println("result.."+result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestInherit other = (TestInherit) obj;
		if (a != other.a)
			return false;
		return true;
	}
	
	public static void main(String[] args) {
		/*Employee e=new Employee();
		
		String s1=new String("Sagar");
		String s2="Sagar";
		s1.intern();
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
//		System.out.println(e==e);
*/		
//        /System.out.println(t.hashCode());
	
		Employee t=new TestInherit();
		t.print();
	}

	
	
	public void print() {
		int i=0;
		while(i<100) {
			try {
				Thread.currentThread().sleep(10000l);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			
		}
		System.out.println("printing..");
	}

}
