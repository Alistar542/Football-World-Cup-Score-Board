package ScoreBoard.displaysummary;

import java.util.Collection;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public interface DisplaySummaryInterface {
	
	public void displaySummaryOfScores(Collection<ScoreVO> completeScores);
}
