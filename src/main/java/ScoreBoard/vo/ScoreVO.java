package ScoreBoard.vo;

/**
 * @author Alistar
 *
 */
public class ScoreVO {

	String homeTeamName;
	String awayTeamName;
	int homeTeamGoal;
	int awayTeamGoal;

	/**
	 * @param homeTeamName
	 * @param awayTeamName
	 */
	public ScoreVO(String homeTeamName, String awayTeamName) {
		this.homeTeamName = homeTeamName;
		this.awayTeamName = awayTeamName;
		this.homeTeamGoal = 0;
		this.awayTeamGoal = 0;
	}

	public String getHomeTeamName() {
		return homeTeamName;
	}

	public void setHomeTeamName(String homeTeamName) {
		this.homeTeamName = homeTeamName;
	}

	public String getAwayTeamName() {
		return awayTeamName;
	}

	public void setAwayTeamName(String awayTeamName) {
		this.awayTeamName = awayTeamName;
	}

	public int getHomeTeamGoal() {
		return homeTeamGoal;
	}

	public void setHomeTeamGoal(int homeTeamGoal) {
		this.homeTeamGoal = homeTeamGoal;
	}

	public int getAwayTeamGoal() {
		return awayTeamGoal;
	}

	public void setAwayTeamGoal(int awayTeamGoal) {
		this.awayTeamGoal = awayTeamGoal;
	}

}
