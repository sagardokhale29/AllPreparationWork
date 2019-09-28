import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class DemoMapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Himalaya";
		
		
		
		HashMap<Character,Integer> countMap=new HashMap<>();
		
		HashSet<Character> hset=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			
			if(countMap.containsKey(str.charAt(i))) {
				countMap.put(str.charAt(i), countMap.get(str.charAt(i))+1);
			}else {
				countMap.put(str.charAt(i), 1);
			}
			
			hset.add(str.charAt(i));
			
		}
		
		AtomicInteger max=new AtomicInteger(0);
		AtomicReference<Character> maxchar=new AtomicReference<>();
		
		WeakHashMap<String,Integer> hmap=new WeakHashMap<>();
		hmap.put(new String("Sagar"), 1);
		hmap.put(new String("Varsha"), 2);
		hmap.put(new String("Nikita"), 3);
		hmap.put("Pooja", 4);
	    System.out.println("size....."+hmap.size());
	    long l1=System.nanoTime();
	    System.gc();
	    System.out.println("size....."+hmap.size());
	   
	    System.out.println("size....."+hmap.size());
	    long l2=System.nanoTime();
	    System.out.println("time in mill...."+(l2-l1));
		
		Hashtable<String,Integer> htable=new Hashtable<>();
		htable.put("Sagar", 1);
      
      
      System.out.println("max occurence "+maxchar.get()+" "+max.get());
		
		System.out.println(countMap.entrySet().stream().max(Map.Entry.comparingByValue()));

	}

}
