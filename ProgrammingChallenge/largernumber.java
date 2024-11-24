import java.util.Scanner;

    public class number{
public static void main(String[] args) {

    Scanner scanner =new Scanner(System.in);
    

    double[] numbers= new double[3];

    System.out.println("Enter First Number: ");
    numbers [0] = scanner.nextDouble();
    System.out.println("Enter Second number: ");
    numbers [1] = scanner.nextDouble();
    System.out.println("Enter Third Number: ");
    numbers[2] = scanner.nextDouble();

    if (numbers [0] == numbers [1] && numbers [1] == numbers [2]){
        System.out.println("All numbers are Equal");
    }
    else {
        double largest = numbers[0];

        for (int s=1; s <numbers.length; s++)
        {
            if (numbers[s] > largest) {
            largest = numbers[s];

        }

        
    }
    System.out.println("The Large Number is " +largest);

    }
    
    scanner.close();


    }
}
    
  
    
    

    

