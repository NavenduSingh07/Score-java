 class Batsman extends Player {
	  private int runsScored;
	  private int centuries;
	  private int halfCenturies;
	  private int ballsFaced;
	  private int pointsEarned;
	  private int batsmanRank;

	  public Batsman(String name) {
	    super(name);
	    this.runsScored = 0;
	    this.centuries = 0;
	    this.halfCenturies = 0;
	    this.ballsFaced = 0;
	    this.pointsEarned = 0;
	    this.batsmanRank = 0;
	  }

	  public int getRunsScored() {
	    return this.runsScored;
	  }

	  public int getCenturies() {
	    return this.centuries;
	  }

	  public int getHalfCenturies() {
	    return this.halfCenturies;
	  }

	  public int getBallsFaced() {
	    return this.ballsFaced;
	  }

	  public int getPointsEarned() {
	    return this.pointsEarned;
	  }

	  public int getBatsmanRank() {
	    return this.batsmanRank;
	  }

	  public void setRunsScored(int runsScored) {
	    this.runsScored = runsScored;
	  }

	  public void setCenturies(int centuries) {
	    this.centuries = centuries;
	  }

	  public void setHalfCenturies(int halfCenturies) {
	    this.halfCenturies = halfCenturies;
	  }

	  public void setBallsFaced(int ballsFaced) {
	    this.ballsFaced = ballsFaced;
	  }

	  public void setPointsEarned(int pointsEarned) {
	    this.pointsEarned = pointsEarned;
	  }

	  public void setBatsmanRank(int batsmanRank) {
	    this.batsmanRank = batsmanRank;
	  }

	  public boolean validateBatsmanRecord() {
	    if (this.centuries < 0 || this.centuries > this.getNoOfMatches()) {
	      return false;
	    }
	    if (this.centuries * 100 > this.runsScored) {
	      return false;
	    }
	    return true;
	  }

	  public void calculatePoints(int index, PlayerDetails playerDetails) {
	    if (!this.validateNoOfMatches() || !this.validateBatsmanRecord()) {
	      this.setPointsEarned(0);
	      this.setBatsmanRank(0);
	      return;
	    }
	    this.setPointsEarned(this.runsScored * 2 + this.centuries * 25);
	    this.setBatsmanRank(playerDetails.rankPlayer(this.pointsEarned, index));
	  }
	}



