import java.util.Scanner;
public class Table
{
    public static void main (String[] args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter a number to find its table:");
        int num =Sc.nextInt();
        for (int i = 1; i<=10; i++)
        {
            System.out.println(num + "x" + i + "=" + (num*i));

        }
    }
}