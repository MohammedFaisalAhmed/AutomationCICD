package programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int fibLength;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		fibLength = sc.nextInt();
		
		int num[] = new int[fibLength];
		num[0]=0;
		num[1]=1;
		
		for(int i=2;i<fibLength;i++)
		{
			
			
			num[i] = num[i-1]+num[i-2];
			
		}
		
		for(int i=0;i<fibLength;i++)
		{
			System.out.println(num[i] + "");
		}
		

	}

}
