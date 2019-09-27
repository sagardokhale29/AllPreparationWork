
public class StringAllCombinations {
	
	public static void permutationsOfString(String input,String ans) {
		
		System.out.println("Input-->"+input +" Answer--->"+ans);
		
		if(input.length()==0) {
			System.out.println("ans-->"+ans);
		}
		
		for(int i=0;i<input.length();i++) {
			
			char ch=input.charAt(i);
			System.out.println("input:"+input+" ans:="+ans+" ch:="+ch);
			String ros=input.substring(0,i)+input.substring(i+1);
			
			System.out.println("i="+i+" input.substring(0,i):="+input.substring(0,i)
			+"  input.substring(i+1):-->"+input.substring(i+1));
			permutationsOfString(ros,ans+ch);
			
		}
		
	}
	
	public static void main(String[] args) {
		permutationsOfString("ABC","");
	}

}
