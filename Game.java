import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Game {
    public static void main(String[] args) {

         

    }

    public static void startGame(){
        boolean isGameOver = false;
        System.out.println("Starting Game!");
        int answer = getRandomNumber();
        int lives = 3;
        Scanner userAns = new Scanner(System.in);

        Vector<Integer> guesses = new Vector();
        while(!isGameOver){
            
            //if the user wants a hint
            System.out.println("The number is between: ");

            //for when the user runs out of lives
            if(lives == 0){
                System.out.println("The answer was " + answer + ".");
                System.out.println("You had guessed the following: ");
                for(int i = 0; i < guesses.size(); i++){
                    System.out.println(guesses.elementAt(i));
                }
            }

            System.out.println("Please guess a number between 0-50");
            
        }
        
        
    }

    static int getRandomNumber(){

        Random generateRandom = new Random();
        int random = generateRandom.nextInt(51);

        return random;
    }
   

}
