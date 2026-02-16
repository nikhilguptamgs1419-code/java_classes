import java.util.Scanner;
public class SumAllNum {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = Scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the first " + n + " numbers is: " + sum);
    }
}