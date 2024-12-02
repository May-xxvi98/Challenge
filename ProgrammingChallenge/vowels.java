import java.util.Scanner;


public class vowels{

    public static void main(String[] args) {

        System.out.println("Enter a letter: ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
       

        switch (ch) {
            case 'a':
            System.out.println("This letter  "+ch+" is a Vowel");
                break;

            case 'e':
                System.out.println("This letter  "+ch+" is a Vowel");
                break;    
            case 'i':
            System.out.println("This letter  "+ch+" is a Vowel");
                break;
            case 'o':
            System.out.println("This letter  "+ch+" is a Vowel");
                break;
            case 'u':
            System.out.println("This letter  "+ch+" is a Vowel");
                break;
            default:
        
              System.out.println("You entered a consonant: "+ch);
                break;
              
        }

       
    }


}