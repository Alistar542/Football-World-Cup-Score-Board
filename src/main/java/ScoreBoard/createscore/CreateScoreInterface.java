package ScoreBoard.createscore;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public interface CreateScoreInterface {

	public ScoreVO createScore(String homeTeam,String awayTeam);
	
}
