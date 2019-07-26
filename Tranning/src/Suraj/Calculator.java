package Suraj;
import java.util.Scanner;
public class Calculator {
	
	
		 Scanner n = new Scanner(System.in);
	public  void addition() {
			int sum=0,d,h;
			System.out.println("enter the value");
			d=n.nextInt();
			for(int i=0;i<d;i++) {
				h=n.nextInt();
				sum=sum+h;
			}
			System.out.println(sum);
		}
		public void subtract() {
			int diff=0,b,j;
			System.out.println("enter the value");
			b=n.nextInt();
			for(int i=0;i<b;i++) {
				j=n.nextInt();
				diff=diff-j;
			}
			System.out.println(diff);
		}
		public void multiplication() {
			int p,q,w;
			System.out.println("enter the value of p");
			p=n.nextInt();
			System.out.println("enter the value of q");
			q=n.nextInt();
			w=p*q;
			System.out.println("the value of w is:"+w);
			}
		public void percentage() {
			int e,r,t;
			System.out.println("enter the value of e");
			e=n.nextInt();
			System.out.println("enter the value of r");
			r=n.nextInt();
			t=e%r;
			System.out.println("the value of t is:"+t);	
		}
	} 

