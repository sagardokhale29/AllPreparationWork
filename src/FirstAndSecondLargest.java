import java.util.Arrays;

public class FirstAndSecondLargest {
	
	public static void checkSumIsGivenNumber(int inputArray[],int inputNumber) {
		int i=0;
		int j=inputArray.length-1;
		Arrays.sort(inputArray);
		while(i<j) {
			
			if(inputArray[i]+inputArray[j]==inputNumber) {
				System.out.println("pair "+inputArray[i]+","+inputArray[j]+" input number"+inputNumber);
				i++;
				j--;
			}
			
			if(inputArray[i]+inputArray[j]<inputNumber) {
				i++;
			}
			
			if(inputArray[i]+inputArray[j]>inputNumber) {
				j--;
			}
		}
		
	}
	
	public void  findFirstAndSecondLargest(int [] arr) {
		int firstLargest=arr[0],secondLargest=arr[1];
		if(firstLargest<secondLargest) {
			firstLargest=arr[1];
			secondLargest=arr[0];
		}
		
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}else if(arr[i]<firstLargest && arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		checkSumIsGivenNumber(new int[] {4, 6, 5, -10, 8, 5, 20}, 10);
		 
		checkSumIsGivenNumber(new int[] {4, -5, 9, 11, 25, 13, 12, 8}, 20);
 
		checkSumIsGivenNumber(new int[] {12, 13, 10, 15, 8, 40, -15}, 25);
 
		checkSumIsGivenNumber(new int[] {12, 23, 10, 41, 15, 38, 27}, 50);
		System.out.println("first largest is "+firstLargest);
		System.out.println("second largest is "+secondLargest);
          		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new FirstAndSecondLargest().findFirstAndSecondLargest(new int[]{1,2,89,90,12,34,21});
	}

}
