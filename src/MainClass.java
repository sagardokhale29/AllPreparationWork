import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.WeakHashMap;

public class MainClass {

	static
    {
        System.out.println("FOURTH");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		
		P p=new Q();
		
		Z z = new Z();
        
        System.out.println(z.method(21.12));
        
        WeakHashMap<String,Integer> wHmap=new WeakHashMap<>();
        String str=new String("Sagar");
        wHmap.put(new String("Rakesh"),1);
        wHmap.put(new String("mahesh"),1);
        wHmap.put(new String("nilesh"),1);
        System.out.println("size..."+wHmap.size());
        String str1=new String("sagar");
        
        HashMap<Employee,Integer> empMap=new HashMap<>();
        empMap.put(new Employee(1,"Sagar"),1);
        empMap.put(new Employee(1,"Nilesh"),1);
        empMap.put(new Employee(1,"vasant"),1);
        
        System.out.println("empmap:--"+empMap.size());
        
        
        WeakReference<String> wr=new WeakReference<>(new String("Mahesh"));
        ReferenceQueue<String> queue=new ReferenceQueue<>();
        PhantomReference<String> pr=new PhantomReference<String>(str1,queue);
        SoftReference<String> sr=new SoftReference<String>(str1);
        System.gc();
        List<Integer> lst=Arrays.asList(1,2,3,4,5,66,6,6,4,4,5);
     /*   System.out.println("list..."+lst.toString());
        
        System.out.println("weak reference.."+wr.get());
        System.out.println("phantom reference.."+pr.get());
        System.out.println("soft reference.."+sr.get());
        System.out.println("size..."+wHmap.get(0));*/
    
        	Reference<? extends String> polledRef =queue.poll();
			System.out.println("queue..."+polledRef);
		
//        System.out.println(wHmap.size());
        
        
        
	}

}

class P
{
	P(){
		
	}
    static
    {
    	
        System.out.println("FIRST");
    }
    
    void print() {
    	
    }
}
 
class Q extends P
{
	 void print() {
		System.out.println("Class Q");
	}
	
	void doSomething() {
		System.out.println("Do something");
	}
    static
    {
        System.out.println("SECOND");
    }
}
 
class C extends Q
{
    static
    {
        System.out.println("THIRD");
    }
}


class X
{
    int method(int i)
    {
        return i *= i;
    }
}
 
class Y extends X
{
    double method(double d)
    {
        return d /= d;  
    }
}
 
class Z extends Y
{
    float method(float f)
    {
        return f += f;
    }
}
 
