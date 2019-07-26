package Suraj;

import java.util.Scanner;

public class Primenumber {
	Scanner sc = new Scanner(System.in);
	public void NextPrimeNumber() {
	System.out.println("enter the prime number");
	int s= sc.nextInt();
	int k=  s+1;
	for(int i=2;i<=(k+1)/2;i++)
	{
	if(k%i==0) {
	
	k++;
	}

	}
	System.out.println(" "+k);

}
}


	


