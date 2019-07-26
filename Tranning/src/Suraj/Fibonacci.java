package Suraj;

import java.util.Scanner;

public class Fibonacci {
	Scanner sc = new Scanner(System.in);

	public void FibonacciSeries() {
		int Initial_Number = 0, Second_number = 1;
		
		int count = sc.nextInt();
		for (int i = 2; i <= count; ++i) {
			int number3 = Initial_Number + Second_number;
			System.out.println(number3);
			Initial_Number = Second_number;
			Second_number = number3;
		}
	}
}
