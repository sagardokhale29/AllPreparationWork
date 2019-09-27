import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

class Main {  
  public static String MaximalSquare(String[] strArr) { 
  
    // code goes here   
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */
	  
	  AtomicInteger in=new  AtomicInteger(1);
	  
	  Map<String,Integer> arraySizeMap=new TreeMap<>();
	  List<Integer> lst=new ArrayList<>();
	  
	  for(int i=0;i<strArr.length;i++) {
		  String str=strArr[i];
		 String []arr=str.split("0");
		 for(int j=0;j<arr.length;j++) {
			 arraySizeMap.put(arr[j], arr[j].length());
		 }
		 System.out.println(arr[0]);
	  }
       
    return strArr[0];
    
  } 
  
  public static void main (String[] args) {  
	  
	ArrayList<Employee> arr=new ArrayList<>();
	arr.add(new Employee(4,"Sagar"));
	arr.add(new Employee(2,"Priyansh"));
	arr.add(new Employee(7,"Satish"));
	arr.add(new Employee(1,"Nilesh"));
	HashMap<String,Integer> hmap=new HashMap<>();
	hmap.put("sagar",1);
	hmap.put("sagar",2);
	hmap.put("sagar",3);
	System.out.println(hmap);
	
	HashMap<Employee,Integer> hmap1=new HashMap<>();
	hmap1.put(new Employee(1,"sagar"),1);
	hmap1.put(new Employee(1,"sagar"),1);
	hmap1.put(new Employee(1,"sagar"),1);
	System.out.println("size of map .."+hmap1.get(new Employee(1,"sagar")));
	
	
	LinkedList<String> strList=new LinkedList<>();
	strList.add(null);
	strList.add("Sagar");
	strList.add("Swapnil");
	Integer [][]ints= {{1,2,3},{null},{4,5,6}};
	//ints[1][0].intValue();
//	strList.removeFirst();
	
	int [] intArray= {1,6,2,5,23,3,23,534,24,4,8,8,8};
    int evenCount=0;
    int oddCount=0;
    
    Deque<Integer> evenStack=new ArrayDeque<>();
    Deque<Integer> oddStack=new ArrayDeque<>();
    
     Arrays.stream(intArray).forEach(j->{
    	 if(j%2==0) {
    		 evenStack.push(j);
    	 }else {
    		 oddStack.push(j);
    	 }
    	 
    });
    
   
    

  
    
    int size=0;
    
    if(evenStack.size()>oddStack.size()) {
    	size=evenStack.size()*2;
    }else if(oddStack.size()>evenStack.size()) {
    	size=oddStack.size()*2;
    }else{
    	  size=evenStack.size()+oddStack.size();
    }
    
    int [] newArray=new int[size]; 
    
    for(int i=0;i<size;i++) {
    	
    	if(i%2==0) {
    		if(!evenStack.isEmpty())
    		  newArray[i]=evenStack.pop();
    	}else {
    		if(!oddStack.isEmpty())
    		    newArray[i]=oddStack.pop();
    	}
    	
    	
    }
   
    
    System.out.println("newArray..."+Arrays.toString(newArray));
    
    
    
    
	strList.pop();
    String [] strArray=new String[] {"01110110111011", "1111011011101", "11110110110111", "11110011001111"};
    System.out.print(MaximalSquare(strArray)); 
  }   
  
}


  