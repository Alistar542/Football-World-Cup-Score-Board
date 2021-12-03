package ScoreBoard.createscore;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public interface CreateScoreValidatorInterface {

	public boolean validateForCreateScore(ScoreVO scoreVO);
	
}