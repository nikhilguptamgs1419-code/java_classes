public class Reverse{
    public static void main(String args[]){
    int number = 123456789;
    int reverse = 0;
    while(number != 0){
        int digit = number % 10;
        reverse = reverse * 10 + digit;
        number /= 10;
    }
    System.out.println("reversed number:"+ reverse);
   // System.out.println("Reversed number: " + reverse);
    }
}