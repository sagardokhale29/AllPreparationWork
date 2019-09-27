
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        List<Integer> numbers = new ArrayList<>();    

        for(int i = 0; i<number; i++ ) {
        	numbers.add(input.nextInt());
        }


        numbers.stream()
        	.forEach((i)-> {
        		int matches = i ;
                int matchesSum;
                if(matches == 1){
                    matchesSum = 1;
                } else {
                    matchesSum = 0;
                }

                while(matches != 0 && matches != 1){
                	int tempMatches = matches;
                	matches = matches / 2;
                    matchesSum += matches; 
                    if(tempMatches % 2 != 0) {
                    	matches += 1;      
                    }
                }
                System.out.println(matchesSum);
        	});
   }
}