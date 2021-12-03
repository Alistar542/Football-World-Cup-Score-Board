package ScoreBoard.finishscore;

import java.util.Collection;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public interface FinishScoreInterface {

	public Collection<ScoreVO> finishScore(ScoreVO currentScore, Collection<ScoreVO> completeScores);
}
