// package chapter1;
import java.util.Scanner;
public class DiscountCalaculator {
	public static void main(String [] muthu) {
		int a;
		Scanner dc = new Scanner(System.in);
		System.out.println("Enter the phurcahed prices to get discount");
		a = dc.nextInt();
		double dis;
		//Condition
		if (a >=5000) {
			dis = a *0.8;
			System.out.println("The Discounted amount of 20% is "+(int)(dis));
		}
		else if (a >=2000) {
			dis = a *0.9+(a);
			System.out.println("The Discounted amount of 10% is "+(int)(dis));
		}
		
		else {
			System.out.println("No Discount For you :(");
		}
	}
}
