 class Player {
		    private String name;
		    private int ratingPoints;
		    private int noOfMatches;

		    public Player(String name) {
		      this.name = name;
		      this.ratingPoints = 0;
		      this.noOfMatches = 0;
		    }

		    public String getName() {
		      return this.name;
		    }

		    public int getRatingPoints() {
		      return this.ratingPoints;
		    }

		    public int getNoOfMatches() {
		      return this.noOfMatches;
		    }

		    public void setRatingPoints(int ratingPoints) {
		      this.ratingPoints = ratingPoints;
		    }

		    public void setNoOfMatches(int noOfMatches) {
		      this.noOfMatches = noOfMatches;
		    }

		    public boolean validateNoOfMatches() {
		      if (this.noOfMatches > 0 && this.noOfMatches <= 100) {
		        return true;
		      }
		      return false;
		    }
		  }

