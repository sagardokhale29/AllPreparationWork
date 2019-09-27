
public class StringNumberOfZeros {
	
	public static void main(String[] args) {
		int numberOfZeros=countMaxNumberOfZeros("00000000100000010001001000000000000000");
		System.out.println("numberOfZeros:- "+numberOfZeros);
	}

	private static int countMaxNumberOfZeros(String string) {
		String between_1_String=string.substring(string.indexOf('1'), string.lastIndexOf('1')+1);
		int max=0,count=0,i=0;
		
		while(i<between_1_String.length()) {
			
			if(between_1_String.charAt(i)=='1') {
				
				if(count>max) {
					max=count;
					count=0;
				}
					
				}else {
					count=count+1;
				}
			 i++;
			}
		  return max;
		}

		
		
		

}
