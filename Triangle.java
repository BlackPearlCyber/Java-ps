// package chapter1;

import java.util.Scanner;

public class Triangle {
	public static void main(String [] muthu) {
		int a,b,c;
		Scanner t1 = new Scanner (System.in);
		
		System.out.println("Enter the three Number of angels");
		a = t1.nextInt();
		b = t1.nextInt();
		c = t1.nextInt();
		
		if (a==b && c==a) {
			System.out.println("The Triangle is Equlator");
			
		}
		else if(a==b ||c==a) {
			System.out.println("The Triangle is Isolaces");
		}
		else {
			System.out.println("The Triangle is scalane");
		}
		
	}
}
