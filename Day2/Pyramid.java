import java.util.Scanner;

public class Pyramid {
    public static void main(String [] muthu) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n");
        n = sc.nextInt();
        for (int i=1; i<=n; i++) //rows
        {
            for (int j = 1; j<=n-i; j++){
                System.out.print("");
            }
            {
                for (int j = 1; j<=2*i-1; j++) // column
                System.out.print("*");
            }
            System.out.println();
        }
           }
}