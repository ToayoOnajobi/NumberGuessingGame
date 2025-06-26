import java.util.Scanner;

public class Main{
    //output Hello Wold to the console
    public static void main(String[] args) {
         System.out.println("Welcome to the number guessing game!\n");
         System.out.println("Would you like to begin? (Y/N)");
         Scanner scanner = new Scanner(System.in);
         String option = scanner.nextLine();

        //Ensure that we have both the lower and upper case to be valid 
       
        String yes = "y";
        String no = "n";

         while(!option.equals("Y") && !option.equals("N")){
                
                System.out.println("Please enter a valid option");
                option = scanner.nextLine();
            
         }


         scanner.close();
    }

}