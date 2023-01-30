import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are");
        String yes = scan.nextLine();

        if(yes.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot.\n");
            String usersChoice = scan.nextLine();
            String computerChoice = computerChoice();
            String result = result(usersChoice, computerChoice);
            printResult(usersChoice, computerChoice, result);
        } else {
            System.out.println(" What a shame! Some other time then...");
        }
        scan.close();
    }

/**
 * Function name: computerChoice <--------
 * @return a choice (String).
 *
 * Inside the function:
 *   1. Picks a random number between 0 and 2.
 *   2. if 1: return the choice 'rock'
 *      if 2: return the choice 'paper'
 *      if 3: return the choice 'scissors'
 */

    public static String computerChoice() {

        double randomNumber = Math.random() * 3;
        int integer = (int) randomNumber;
        
        switch (integer) {
            case 0: return "rock"; 
            case 1: return "paper";
            case 2: return "scissors";
            default: return ""; //default case will not be possible
        }
    }

    public static String result(String usersChoice, String computerChoice) {
        String result = ""; 

        if (usersChoice.equals("rock") && computerChoice.equals("scissors")){ 
            result = "You win!";
        } else if (usersChoice.equals("rock") && computerChoice.equals("paper")) {
            result = "You lose!";
        } else if (usersChoice.equals("paper") && computerChoice.equals("rock")) {
            result = "You win!";
        } else if (usersChoice.equals("paper") && computerChoice.equals("scissors")) {
            result = "You lose!";
        } else if (usersChoice.equals("scissors") && computerChoice.equals("paper")) {
            result = "You win!";
        } else if (usersChoice.equals("scissors") && computerChoice.equals("rock")) {
            result = "You lose!";
        } else if (usersChoice.equals(computerChoice)) {
            result = "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }
        return result;
      }

    public static void printResult(String usersChoice, String computerChoice, String result) {
        System.out.println("\nYou chose:\t" + usersChoice);
        System.out.println("The computer chose:\t" + computerChoice);
        System.out.println(result);
    }

}
