import java.util.Scanner;

public class AlphabetTriangle {
    public static void main (String [] muthu) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value N:");
        int n = sc.nextInt();
        //loops

        for (int i = 1; i <=n; i++) {
            char c='A';
        for ( int j = 1; j<=i; j++) {
            System.out.print(c++);
        }
        System.out.println();
        }
    }
}