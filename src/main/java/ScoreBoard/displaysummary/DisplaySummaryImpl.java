package ScoreBoard.displaysummary;

import java.util.Collection;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class DisplaySummaryImpl implements DisplaySummaryInterface{

	@Override
	public void displaySummaryOfScores(Collection<ScoreVO> completeScores) {
		completeScores.stream().forEach(score -> {
			System.out.println(score.getHomeTeamName()+" "
					+score.getHomeTeamGoal()+" - "
					+score.getAwayTeamName()+" "
					+score.getHomeTeamGoal());
		});
	}

}
