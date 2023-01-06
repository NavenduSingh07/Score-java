import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter name of batsman: ");
    String name = scanner.nextLine();

    System.out.print("Enter number of matches played: ");
    int noOfMatches = scanner.nextInt();

    System.out.print("Enter runs scored: ");
    int runsScored = scanner.nextInt();

    System.out.print("Enter number of centuries scored: ");
    int centuries = scanner.nextInt();

    Batsman batsman = new Batsman(name);
    batsman.setNoOfMatches(noOfMatches);
    batsman.setRunsScored(runsScored);
    batsman.setCenturies(centuries);

    PlayerDetails playerDetails = new PlayerDetails();
    playerDetails.addBatsman(batsman);
    playerDetails.calculateRatingPoints();
    playerDetails.rankBatsmen();

    System.out.println("Player Ranking:");
    System.out.println("Batsman: Rank " + batsman.getBatsmanRank() + " Points " + batsman.getRatingPoints());
  }
}
