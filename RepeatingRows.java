import java.util.Scanner;
public class RepeatingRows {
    public static void main(String [] muthu) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of n");
        n = sc.nextInt();
        for (int i =1; i <=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}