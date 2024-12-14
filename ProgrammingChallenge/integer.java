import java.util.Scanner;
import java.util.ArrayList;

public class integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();


        System.out.println();
        System.out.println("Enter a number: ");
        int input = sc.nextInt();
        list.add(input);

        boolean isAddInput = true;

        while (isAddInput){
            System.out.println("Do want to add more? Yes or No: ");
            String pick = sc.nextLine();

            if (pick.equalsIgnoreCase("y")){
                System.out.println();
                System.out.println("Enter A Number: ");
                input = sc.nextInt();
                list.add(input);

            } else if (pick.equalsIgnoreCase("n")) {
                int sum =0;
                for (int num: list){
                    sum+=num;
                }  
                System.out.println();
                System.out.println("The sum of all input is : " + sum);
                isAddInput = false;                
                }


            }
        }
    }
    
    

