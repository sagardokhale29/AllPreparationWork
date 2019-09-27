import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	Scanner sc=new Scanner(System.in);
        int numbTestCases=sc.nextInt();
        for(int i=0;i<=numbTestCases;i++){
        	String nextLine=sc.nextLine();
            if(nextLine!=null && !nextLine.isEmpty()) {
            	 System.out.println(new CandidateCode().calculateNumberOfMatches(Integer.parseInt(nextLine)));
            }
              
        }

   }

   public  int calculateNumberOfMatches(int totalTeams){ 
	    int count=0;
	   
	    if(totalTeams==1) {
	    	return 1;
	    }
       outer:while(totalTeams!=0 && totalTeams!=1){
    		      totalTeams=totalTeams/2;
    		      int tempTeams=totalTeams;
    	          count=count+totalTeams;
    			  if(totalTeams%2!=0){
    			     totalTeams= totalTeams+1;
    			  }
       }
   
     
     return count;
       
   }
}
