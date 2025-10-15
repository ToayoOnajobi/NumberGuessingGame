import java.util.Scanner;

public class Main{
    //output Hello Wold to the console
    public static void main(String[] args) {
         System.out.println("Welcome to the number guessing game!\n");
         System.out.println("Would you like to begin? (Y/N)");
         Scanner scanner = new Scanner(System.in);
         String option = scanner.nextLine();
         option = option.toLowerCase();

        //Ensure that we have both the lower and upper case to be valid 
       
        String yes = "y";
       

         while(!option.equals("y") && !option.equals("n")){
                
                System.out.println("Please enter a valid option");
                option = scanner.nextLine();
            
         }

         if(option.equals(yes))
         {
            Game game = new Game();
            game.startGame();
         }
        
         System.out.println("Bye!");

         scanner.close();
    }

}