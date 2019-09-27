import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringOperations {
	
	public static void main(String[] args) {
		String test="abcddefghhijjjkln";
		StringBuilder sb=new StringBuilder(test);
		
		List<Character> charList=new ArrayList<>();
		for(char ch:test.toCharArray()) {
			charList.add(ch);
		}
		
		List<Character> duplicateList=new ArrayList<>();
		
		charList.stream().distinct().forEach(i->{
			if(test.lastIndexOf(i)-test.indexOf(i)!=0) {
				duplicateList.add(i);
			}
			});
		
		charList.removeAll(duplicateList);
		String result="";
		for (char c:charList) {
			result=result+c;
		}
		
		
		System.out.println(result);
	}

}
