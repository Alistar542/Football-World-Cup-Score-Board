package ScoreBoard.displaysummary;

import java.util.Collection;
import java.util.Objects;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class DisplaySummaryValidatorImpl implements DisplaySummaryValidatorInterface{

	@Override
	public boolean validateForDisplayingSummary(Collection<ScoreVO> completeScores) {
		if(Objects.nonNull(completeScores)) {
			return true;
		}
		return false;
	}

	

}
