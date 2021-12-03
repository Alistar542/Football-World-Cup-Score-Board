package ScoreBoard.finishscore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class FinishScoreImpl implements FinishScoreInterface{

	@Override
	public Collection<ScoreVO> finishScore(ScoreVO currentScore, Collection<ScoreVO> completeScores) {
		if(Objects.isNull(completeScores)) {
			completeScores = new ArrayList<>();
		}
		completeScores.add(currentScore);
		currentScore = null;
		return completeScores;
	}

}
