import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class NumberOfMatches {
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc=new Scanner(System.in);
		try(BufferedReader br=new BufferedReader(new FileReader(new File("D:\\Work\\flaApiRequest.txt")));) {
			
			while(br.read()!=-1) {
				System.out.println((char)br.read()+br.readLine());
			};
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int numberOfTestCases=sc.nextInt();
		for(int i=0;i<numberOfTestCases;i++) {
			calculateNumberOfMatches(sc.nextInt());
			
		}
	}

	private static void calculateNumberOfMatches(int teams) {
		
		int numberOfMatches=0;
		if(teams==1) {
			numberOfMatches=1;	
		}else {
			
			while(teams!=1) {
				int tempTeam=teams;
				teams=teams/2;
				numberOfMatches+=teams;
				if(tempTeam%2!=0) {
					teams+=1;
				}
			}
		}
		
		System.out.println(numberOfMatches);
		
	}

}
