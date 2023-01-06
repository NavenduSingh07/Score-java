
public class main {
		  public static void main(String[] args) {
		    PlayerDetails playerDetails = new PlayerDetails();

		    Batsman batsman1 = new Batsman("Batsman 1");
		    batsman1.setNoOfMatches(10);
		    batsman1.setRunsScored(420);
		    batsman1.setCenturies(3);
		    batsman1.setHalfCenturies(1);
		    batsman1.calculatePoints(0, playerDetails);

		    Batsman batsman2 = new Batsman("Batsman 2");
		    batsman2.setNoOfMatches(12);
		    batsman2.setRunsScored(380);
		    batsman2.setCenturies(2);
		    batsman2.calculatePoints(1, playerDetails);

		    Batsman batsman3 = new Batsman("Batsman 3");
		    batsman3.setNoOfMatches(8);
		    batsman3.setRunsScored(280);
		    batsman3.setCenturies(1);
		    batsman3.calculatePoints(2, playerDetails);

		    System.out.println("Player Ranking:");
		    System.out.println("Batsman 1: Rank " + batsman1.getBatsmanRank() + " Points " + batsman1.getPointsEarned());
		    System.out.println("Batsman 2: Rank " + batsman2.getBatsmanRank() + " Points " + batsman2.getPointsEarned());
		    System.out.println("Batsman 3: Rank " + batsman3.getBatsmanRank() + " Points " + batsman3.getPointsEarned());
		  }
		}



