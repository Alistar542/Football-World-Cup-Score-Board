package ScoreBoard.createscore;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class CreateScoreImpl implements CreateScoreInterface{

	@Override
	public ScoreVO createScore(String homeTeam, String awayTeam) {
		ScoreVO currentScore = new ScoreVO(homeTeam, awayTeam);
		return currentScore;
	}

}
