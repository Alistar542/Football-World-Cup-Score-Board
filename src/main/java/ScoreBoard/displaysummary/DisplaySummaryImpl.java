package ScoreBoard.displaysummary;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class DisplaySummaryImpl implements DisplaySummaryInterface{

	@Override
	public void displaySummaryOfScores(Collection<ScoreVO> completeScores) {
		TotalScoreComparator scoreComp = new TotalScoreComparator();
		Collections.sort((List)completeScores, scoreComp);
		completeScores.stream().forEach(score -> {
			System.out.println(score.getHomeTeamName()+" "
					+score.getHomeTeamGoal()+" - "
					+score.getAwayTeamName()+" "
					+score.getAwayTeamGoal());
		});
	}
	
	public class TotalScoreComparator implements Comparator<ScoreVO> {

	    @Override
	    public int compare(ScoreVO firstScore, ScoreVO secondScore) {
	       return Integer.compare(secondScore.getHomeTeamGoal()+secondScore.getAwayTeamGoal()
	       ,firstScore.getHomeTeamGoal()+firstScore.getAwayTeamGoal());
	    }

	}

}
