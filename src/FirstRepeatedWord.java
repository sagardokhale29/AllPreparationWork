import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.function.Consumer;

public class FirstRepeatedWord {
	
public static void main(String[] args) {
	
	String sample="Hi this is india this is india,india:god is;ultimate	rahul";
	String []arr=sample.split("[\\s+\\,\\;\\:\\-\\.]");
	
	Integer [] intArrat= {1,2,3,4,4,5,3,2,4,5,6,7,4,7};
	
	TreeMap<String,String> tmap=new TreeMap<>();

	
	
	Consumer<String> cons=t->System.out.println(t);
	
	cons.accept("sagar");
	
	System.out.println("array is "+Arrays.toString(intArrat));
	FirstRepeatedWord.countDuplicate(intArrat);
	
    HashSet<String> hset=new HashSet<>();	
    outer:for(int i=0;i<arr.length;i++) {
    	if(!hset.add(arr[i])) {
    		System.out.println("First repeating word:"+arr[i]);
    		break outer;
    	}
    }
	
}

public static <T>  void countDuplicate(T []arr) {
	
	 HashMap<T,Integer> hmap=new HashMap<>();
	 
		for (T element : arr) {
			if(hmap.containsKey(element)) {
				hmap.put(element,hmap.get(element)+1);
			}else {
				hmap.put(element,1);
			}

		}
	
		System.out.println("Non repeating words are "+hmap.values().parallelStream().filter(i->i>1).count());
		
}


}
