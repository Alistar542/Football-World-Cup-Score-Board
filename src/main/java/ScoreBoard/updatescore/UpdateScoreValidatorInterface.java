package ScoreBoard.updatescore;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public interface UpdateScoreValidatorInterface {

	public boolean validateForUpdateScore(ScoreVO scoreVO);
}
