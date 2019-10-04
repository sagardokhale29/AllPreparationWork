/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Arrays;

class TestClass {
    public static void main(String args[] ) throws Exception {
        
        String str="00010001001000000100000000000000000000";
        
        String str1=str.substring(str.indexOf("1"), str.lastIndexOf("1"));
        String [] arr=str1.split("1");
        
        long maxLength=Arrays.asList(arr).stream().max(String::compareTo).get().length();
       
        System.out.println("max="+ maxLength);
        
     
      
      
    }

	
	
	
	

	
	
	 
	

	
    
    
}
