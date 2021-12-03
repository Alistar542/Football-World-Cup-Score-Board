package ScoreBoard.createscore;

import java.util.Objects;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class CreateScoreValidatorImpl implements CreateScoreValidatorInterface{

	@Override
	public boolean validateForCreateScore(ScoreVO scoreVO) {
		if(Objects.isNull(scoreVO)) {
			return true;
		}
		return false;
	}

}
