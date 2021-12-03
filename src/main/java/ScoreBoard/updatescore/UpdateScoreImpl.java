package ScoreBoard.updatescore;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class UpdateScoreImpl implements UpdateScoreInterface{

	@Override
	public ScoreVO updateScore(ScoreVO currentScore, int homeTeamGoal, int awayTeamGoal) {
		currentScore.setHomeTeamGoal(homeTeamGoal);
		currentScore.setAwayTeamGoal(awayTeamGoal);
		return currentScore;
	}

}
