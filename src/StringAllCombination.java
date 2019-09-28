import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringAllCombination {
	
	public static void permutationOfString(String input,String ans) {
		
		if(input.length()==0) {
			System.out.println("Combination .."+ans);
			return;
		}
		
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			String ros=input.substring(0,i)+input.substring(i+1);
			permutationOfString(ros,ans+ch);
		}
		
	}

	public static void main(String[] args) {
		permutationOfString("ABC","");
		HashMap<String,Integer> hmap=new HashMap<>();
		hmap.put("Sagar", 7);
		hmap.put("Varsha", 4);
		hmap.put("Pooja", 2);
		hmap.put("Sunil", 18);
		System.out.println(hmap.entrySet().stream().sorted(Map.Entry.comparingByValue())
	   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new)));
		
		
	}

}
