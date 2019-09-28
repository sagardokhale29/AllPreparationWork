import java.util.Arrays;

public class IncrementTest {

	public static void main(String[] args) {
		
		int [] arr =new int[] {4,5,62,6,2,6,8,2,56,34,3,6,4,7,45,2};
		
		int count=checkCount(arr,4);
		System.out.println("count..."+count);

	}

	private static int checkCount(int[] arr, int j) {
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			while(i<arr.length-1 && arr[i+1]<=arr[i]) {
				arr[i+1]=arr[i+1]+j;
				
				count++;
			}
			
			
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
		return count;
	}

}
