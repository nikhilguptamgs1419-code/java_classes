import java.util.Scanner;
public class Factoruser {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Scanner.nextInt();
        System.out.println("Factors of " + n + " are: ");
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
