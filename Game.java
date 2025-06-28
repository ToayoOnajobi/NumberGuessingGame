import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Game {
    public static void main(String[] args) {

         

    }

    private static int lives = 3;
    private int roundNum = 1;

    public int getRoundNum(){
        return roundNum;
    }

    public int updateRoundNum(){

        return roundNum++;

    }


    public void startGame(){
        boolean isGameOver = false;
        System.out.println("Round " + getRoundNum() + "!\n");
        System.out.println("Starting Game!");
        int answer = getRandomNumber();
       
        Scanner userAns = new Scanner(System.in);

        Vector<Integer> guesses = new Vector();
        while(!isGameOver){
            
            //if the user wants a hint
            System.out.println("The number is between: ");

            //for when the user runs out of lives
            if(lives == 0){
                System.out.println("The answer was " + answer + ".");
                System.out.println("You had guessed the following:\n");
                for(int i = 0; i < guesses.size(); i++){
                    System.out.println(guesses.elementAt(i));
                }

                System.out.println("Game Over!");
                break;
            }

            System.out.println("Please guess a number between 0-50");
            int userAnswer = userAns.nextInt();
            guesses.add(userAnswer);
            boolean isCorrect = checkAnswer(userAnswer, answer);
            if(isCorrect){
                System.out.println("Correct! Congrats, you win! You had " + lives + " remaining.");
                System.out.println("Would you like to play again?");
                
                //check for the userInput 
                Scanner playAgain = new Scanner(System.in);
                String option = playAgain.nextLine();
                if(option.equals(option)){
                    updateRoundNum();
                    startGame();
                }
                else
                {
                    isGameOver = true;
                }

                playAgain.close();
                
                
            }     
            
        }    
        userAns.close();  
                
    }

    static int getRandomNumber(){

        Random generateRandom = new Random();
        int random = generateRandom.nextInt(51);

        return random;
    }

    static boolean checkAnswer(int userA, int correctAns) {

        if(userA == correctAns){
            
            return true;
        }

        lives--;
        System.out.println("That is incorrect! Try agin!\n");

        return false;
    }

    public String giveHint()
    {

        return "This number is prime number";

    }

    boolean isPrime(int n)
    {
        for(int i = 0; i < n; i++){
            if(n % i == 0){
                return true;
            }
        }

        return true;
    }
   

}
