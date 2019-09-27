import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

import com.sun.xml.internal.bind.v2.runtime.reflect.ListIterator;

class A{
	int i = 1212;
	
	/*A(int i){
		System.out.println("A parametric");
	}*/
	
	static {
		System.out.println("A static");
	}
	public void print(A a) {
		System.out.println(" a class method");
	}
}

class B extends A {

	A a;
	
	static {
		System.out.println("B static");
	}
	
	public B() {
		
	}
	 
	public void print(A a) {
		
		
			System.out.println("B  class method");
			
			
		
		System.out.println("BBBBBBBB");
	}
    public B(A a)
    {
        this.a = a;
    }


	
}
public class TestInheritance extends B {
	
	static {
		System.out.println("TestInheritance static ..");
	}
	
public static void main(String[] args) {
	
	

	A ar=new A();
	

	
	A ab=new B();
	ab.print(ab);
	ab.print(ar);
	
	
	/*System.out.println("main method");
	A a=new A();
	B b=new B(a);
	b.a.i=10;
	
	List<String> arrList=new ArrayList<>();
	arrList.add("Sagar");
	arrList.add("Priyansh");
	arrList.add("Vishal");
	arrList.add("Jai");
	arrList.add("Swapnil");
	
	java.util.ListIterator<String> listItr=arrList.listIterator();
	
	while(listItr.hasNext()) {
		String str=listItr.next();
		System.out.println(str);
		
		
		if(str.equals("Priyansh")) {
			listItr.remove();
			listItr.add("Vasant");
		}
	}
	
	System.out.println("arrList.."+arrList);
	
	
	
	System.out.println(a.i);*/
	
}

}
