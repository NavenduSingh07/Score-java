import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

public class PlayerDetails {
	 private static int[] playersPointsArr = {1000, 934, 800, 550};
	  private List<Batsman> batsmen;

	  public PlayerDetails() {
	    this.batsmen = new ArrayList<>();
	  }

	  public void addBatsman(Batsman batsman) {
	    this.batsmen.add(batsman);
	  }

	  public List<Batsman> getBatsmen() {
	    return this.batsmen;
	  }

	  public void calculateRatingPoints() {
	    for (Batsman batsman : this.batsmen) {
	      int ratingPoints = 0;
	      ratingPoints += (batsman.getRunsScored() / 2);
	      ratingPoints += (batsman.getCenturies() * 12);
	      ratingPoints += (batsman.getHalfCenturies() * 6);
	      if (batsman.getBallsFaced() > 0) {
	        double strikeRate = (double) batsman.getRunsScored() / batsman.getBallsFaced() * 100;
	        if (strikeRate > 80) {
	          ratingPoints += 4;
	        } else if (strikeRate > 70) {
	          ratingPoints += 2;
	        }
	      }
	      batsman.setRatingPoints(ratingPoints);
	    }
	  }

	  public void rankBatsmen() {
	    Collections.sort(this.batsmen, new Comparator<Batsman>() {
	      @Override
	      public int compare(Batsman b1, Batsman b2) {
	        return b2.getRatingPoints() - b1.getRatingPoints();
	      }
	    });
	    for (int i = 0; i < this.batsmen.size(); i++) {
	      this.batsmen.get(i).setBatsmanRank(i + 1);
	    }
	  }

	  public static int rankPlayer(int pointsEarned, int index) {
	    playersPointsArr[index] = pointsEarned;
	    Arrays.sort(playersPointsArr);
	    for (int i = 0; i < playersPointsArr.length; i++) {
	      if (playersPointsArr[i] == pointsEarned) {
	        return i + 1;
	      }
	    }
	    return 0;
	  }
	}


