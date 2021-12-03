package ScoreBoard.finishscore;

import java.util.Objects;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class FinishScoreValidatorImpl implements FinishScoreValidatorInterface{

	@Override
	public boolean validateForFinishScore(ScoreVO scoreVO) {
		if(Objects.nonNull(scoreVO)) {
			return true;
		}
		return false;
	}

}
