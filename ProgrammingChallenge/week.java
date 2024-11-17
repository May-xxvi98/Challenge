import java.util.Scanner;

public class week {
    public static  void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");

        int week = sc.nextInt();

        if(week==1){
            System.out.println("The Week is Monday");
            
        } else if (week==2) {
            System.out.println("The Week is Tuesday");

        } else if (week==3){
            System.out.println("The Week is WEdnesday");
        } else if (week==4){
            System.out.println("The Week is Thursday");
        } else if (week==5){
            System.out.println("The Week is Friday");
        }else if (week==6){
            System.out.println("The Week is Saturday");
        }else if (week==7){
            System.out.println("The Week is Sunday");
        }
        

        if (week>7){
                System.out.println("invalid number. Please enter a number between 1 and 7.");
        }

        return;
        


    }

    
}
