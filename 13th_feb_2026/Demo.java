import java.util.Scanner;

class Demo {
   
   public static void main(String[] args) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      if (var2 > 0) {
         if (var2 % 2 == 0) {
            System.out.println("Even number");
         } else {
            System.out.println("Odd number");
         }
      } else if (var2 < 0) {
         System.out.println("Negative number");
      } else {
         System.out.println("Zero");
      }

   }
}

