import java.util.Scanner;
public class Flyod {
public static void main( String [] muthu){
    int n,i,j,num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    n=sc.nextInt();

    num = 1;
    for (i=1; i<=n; i++){
        for (j=1; j<=i; j++){
            System.out.print(num++);
    }
    System.out.println();
}
}}