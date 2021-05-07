package RockPaperScissorShootBattle;
import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] options = {"rock","paper","scissors"};
        while(true) {
            System.out.println("\nRock Paper Scissor Shoot : ");

            String player_choice = sc.nextLine();
            int comp_choice = r.nextInt(3);

            System.out.format("\nYou : %s; Computer : %s\n",player_choice,options[comp_choice]);
            //System.out.println(player_choice.toLowerCase());

            if (player_choice.toLowerCase().equals("rock")){
                switch (options[comp_choice]) {
                    case "rock":
                        System.out.println("\nIt's a Tie");
                        break;
                    case "paper":
                        System.out.println("\nYou Lose");
                        break;
                    case "scissors":
                        System.out.println("\nYou Win");
                        break;
                }
            }

            else if (player_choice.toLowerCase().equals("scissors")){
                switch (options[comp_choice]) {
                    case "rock":
                        System.out.println("\nYou Lose");
                        break;
                    case "paper":
                        System.out.println("\nYou Win");
                        break;
                    case "scissors":
                        System.out.println("\nIt's a Tie");
                        break;
                }
            }

            else if (player_choice.toLowerCase().equals("paper")){
                switch (options[comp_choice]) {
                    case "rock":
                        System.out.println("\nYou Win");
                        break;
                    case "paper":
                        System.out.println("\nIt's a Tie");
                        break;
                    case "scissors":
                        System.out.println("\nYou Lose");
                        break;
                }
            }
            else{
                System.out.println("\nSOMETHING WENT WRONG. TRY AGAIN");
            }



        }

    }
}
