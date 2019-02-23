package RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {

  public static void main(String[] args) {
    int pointsToWin = 0;
    Scanner keyboard = new Scanner(System.in);
    String playerMove = "";
    String computerMove = "";
    int playerPoints = 0;
    int computerPoints = 0;

    System.out.println("Points to win?");
    pointsToWin = keyboard.nextInt();

    while (playerPoints != pointsToWin && computerPoints != pointsToWin) {
      System.out.println("Rock, paper or scissors ?");
      playerMove = keyboard.next();
      computerMove = ComputerOpponent.getMove();

      if (playerMove.equalsIgnoreCase("rock") &&
          computerMove.equalsIgnoreCase("paper")) {
        computerPoints = computerPoints + 1;
        System.out.println("The computer chose " + computerMove + " so you lose. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("rock") &&
          computerMove.equalsIgnoreCase("scissors")) {
        playerPoints = playerPoints + 1;
        System.out.println("The computer chose " + computerMove + " so you won. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("rock") &&
          computerMove.equalsIgnoreCase("rock")) {
        System.out.println("The computer chose " + computerMove + " so it's a tie. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("paper") &&
          computerMove.equalsIgnoreCase("paper")) {
        System.out.println("The computer chose " + computerMove + " so it's a tie. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("paper") &&
          computerMove.equalsIgnoreCase("scissors")) {
        computerPoints = computerPoints + 1;
        System.out.println("The computer chose " + computerMove + " so you lose. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("paper") &&
          computerMove.equalsIgnoreCase("rock")) {
        playerPoints = playerPoints + 1;
        System.out.println("The computer chose " + computerMove + " so you won. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("scissors") &&
          computerMove.equalsIgnoreCase("paper")) {
        playerPoints = playerPoints + 1;
        System.out.println("The computer chose " + computerMove + " so you won. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("scissors") &&
          computerMove.equalsIgnoreCase("scissors")) {
        System.out.println("The computer chose " + computerMove + " so it's a tie. (" + playerPoints
            + "-" + computerPoints + ")");
      } else if (playerMove.equalsIgnoreCase("scissors") &&
          computerMove.equalsIgnoreCase("rock")) {
        computerPoints = computerPoints + 1;
        System.out.println("The computer chose " + computerMove + " so you lose. (" + playerPoints
            + "-" + computerPoints + ")");
      } else {
        System.out.println("Check your input again!");
      }

    }

    if (playerPoints == pointsToWin) {
      System.out.println("Congratulations! You won.");
    } else {
      System.out.println("Sorry! You lost, better luck nect time.");
    }

  }
}

