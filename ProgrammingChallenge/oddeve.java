import java.util.Scanner;

 public class oddeve{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter a number : ");
      int number = sc.nextInt();
      
      if (number % 2 == 0) {
          System.out.println("The number is even.");
      } else {
          System.out.println("The number is odd.");
      }
      
      if (number > 0) {
          System.out.println("The number is positive.");
      } else if (number < 0) {
          System.out.println("The number is negative.");
      } else {
          System.out.println("The number is zero.");
      }
        
    }
 }