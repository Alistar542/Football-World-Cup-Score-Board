package ScoreBoard.updatescore;

import java.util.Objects;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class UpdateScoreValidatorImpl implements UpdateScoreValidatorInterface{

	@Override
	public boolean validateForUpdateScore(ScoreVO scoreVO) {
		if(Objects.nonNull(scoreVO)) {
			return true;
		}
		return false;
	}

}
