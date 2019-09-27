import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class ArraySearch {
	
	enum days{MONDAY,SATURDAY ;
		days(){
			System.out.println("Default constructor enum");
		};
		static {
			
			System.out.println("static block enum");
		}
		{
			System.out.println("Instance block of enum");
		}
	};

	public static void main(String[] args) {
		System.out.println(ArraySearch.days.MONDAY);
		
		ArrayList<String> arr=new ArrayList<>();
		arr.add("Sagar");
		arr.add("Nilesh");
		int p=modifyList(arr);
		arr.add("Mahesh");
		System.out.println("Arraylist "+arr+" returned value "+p);
		
		for(int i = 1;i<= 4;i++)
		{
			int temp=0;
			for(int j=1;j<=i;j++)
			{
				temp=i+j;
				System.out.print(temp-1+" ");
			}
			System.out.println();
		} 
		
		HashMap<String,Integer> hmap=new HashMap<>();
		hmap.put("Sagar",1);
		hmap.put("Priyansh",8);
		System.out.println(sortList(hmap.keySet()));
	}

	
	
	private static int modifyList(ArrayList<String> arr) {
		// TODO Auto-generated method stub
		arr.add("Pamu");
		arr=new ArrayList<>();
		arr.add("Swapnil");
		
		try {
			return 1;
		}catch(Exception e) {
			return 2;
		}finally {
			return 3;
		}
	}



	public static ArrayList<String>  sortList(Set<String> inputSet){
		
		String temp="";
		
		ArrayList<String> arrList=new ArrayList<String>(inputSet);
		
		for(int j=0;j<arrList.size();j++) {
			if(j<arrList.size()-1 && arrList.get(j).compareTo(arrList.get(j+1))>0) {
				temp=arrList.get(j);
				arrList.set(j, arrList.get(j+1));
				arrList.set(j+1, temp);
			}
		}
		
		
		return arrList;
		
	}

}
