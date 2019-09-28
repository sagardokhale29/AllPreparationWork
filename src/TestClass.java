import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

public class TestClass {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int n = Integer.parseInt(br.readLine().trim());
         ArrayList<Integer> arr = new ArrayList<Integer>(n);
         for(int i_arr=0; i_arr<n; i_arr++)
         {
             String str = br.readLine();
             arr.add(Integer.parseInt(str));
         }
         long out_ = good_triplets(arr, n);
         System.out.println(out_);
         
         br.close();
    }
    
    static long good_triplets(ArrayList<Integer> arr, int n){
      ListIterator<Integer> lit=arr.listIterator();
      
      long numberOfCombination=0l;
       numberOfCombination=findTriplet(arr);
        return numberOfCombination;
          
    }

	private static long findTriplet(ArrayList<Integer> arr) {
		
		ArrayList<Integer> originalArrayList=new ArrayList<>(arr);
		long combinations=0l;
		int count=0;
		  ArrayList<Integer> triplet=new ArrayList<>();
		  while( count<3) {			  		
			  triplet.add(arr.get(count));
			  if(triplet.size()==3) {
			  if(!checkTriplet(triplet)) {
				  triplet.clear();
				  arr.remove(0);
				  count=0;
			  }else {
				  
				  combinations=findCombinations(originalArrayList,triplet);
				 
			  }
			  }
			  
			  count++;
			  
		  }
		  
		  return combinations;
	}
    
 
	private static long findCombinations(ArrayList<Integer> originalArrayList, ArrayList<Integer> triplet) {
		// TODO Auto-generated method stub
		originalArrayList.retainAll(triplet);
		
		return 0;
	}

	private static boolean checkTriplet(ArrayList<Integer> triplet) {
		boolean isGoodTriplet=false;
		AtomicInteger sum=new AtomicInteger(0);
		triplet.parallelStream().forEach(i->sum.addAndGet(i));
		long divisibleCount=triplet.parallelStream().filter(j->sum.get()%j==0).count();
        if(divisibleCount==1l)
        	isGoodTriplet=true;
		return isGoodTriplet;
	}
}