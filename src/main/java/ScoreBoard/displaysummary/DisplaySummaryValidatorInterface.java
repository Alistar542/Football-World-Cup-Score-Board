package ScoreBoard.displaysummary;

import java.util.Collection;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public interface DisplaySummaryValidatorInterface {

	public boolean validateForDisplayingSummary(Collection<ScoreVO> completeScores);
	
}
