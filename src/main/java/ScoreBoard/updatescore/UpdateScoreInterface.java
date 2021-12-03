package ScoreBoard.updatescore;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public interface UpdateScoreInterface {

	public ScoreVO updateScore(ScoreVO currentScore,int homeTeamGoal,int awayTeamGoal);
	
}
