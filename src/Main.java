import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.io.*;

class Main {  
 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    
    int length=s.nextInt();
    LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
   
    for(int i=0;i<length;i++) {
    	lhs.add(s.nextInt());
    }
    int [] arr= {2,4,1,4,2,6,7};
   List<Integer> qwe=IntStream.of(2,4,1,4,2,6,7).boxed().collect(Collectors.toList());
    
    for(int j=1;j<=length;j++) {
    	if(lhs.contains(j)==false)
    	System.out.print(j+" ");
    }
    
  }   
  
}


  