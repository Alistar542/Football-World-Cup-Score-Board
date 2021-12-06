package ScoreBoard;

import static ScoreBoard.constants.ScoreBoardConstants.CREATE_FLAG;
import static ScoreBoard.constants.ScoreBoardConstants.EXIT_FLAG;
import static ScoreBoard.constants.ScoreBoardConstants.FINISH_FLAG;
import static ScoreBoard.constants.ScoreBoardConstants.UPDATE_FLAG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import ScoreBoard.createscore.CreateScoreImpl;
import ScoreBoard.createscore.CreateScoreInterface;
import ScoreBoard.createscore.CreateScoreValidatorImpl;
import ScoreBoard.createscore.CreateScoreValidatorInterface;
import ScoreBoard.displaysummary.DisplaySummaryImpl;
import ScoreBoard.displaysummary.DisplaySummaryInterface;
import ScoreBoard.displaysummary.DisplaySummaryValidatorImpl;
import ScoreBoard.displaysummary.DisplaySummaryValidatorInterface;
import ScoreBoard.displaytext.DisplayTextImpl;
import ScoreBoard.displaytext.DisplayTextInterface;
import ScoreBoard.finishscore.FinishScoreImpl;
import ScoreBoard.finishscore.FinishScoreInterface;
import ScoreBoard.finishscore.FinishScoreValidatorImpl;
import ScoreBoard.finishscore.FinishScoreValidatorInterface;
import ScoreBoard.updatescore.UpdateScoreImpl;
import ScoreBoard.updatescore.UpdateScoreInterface;
import ScoreBoard.updatescore.UpdateScoreValidatorImpl;
import ScoreBoard.updatescore.UpdateScoreValidatorInterface;
import ScoreBoard.vo.ScoreVO;

/**
 * @author Alistar
 *
 */
public class ScoreBoardController {


	public void maintainScoreBoard() throws IOException {
		ScoreVO scoreVO = null;
		Collection<ScoreVO> completeScores = null;
		displayDetails();
		boolean continueFlag = true;
		while (continueFlag) {
			String userInput = getInputFromUser("Enter Your Input");
			switch (userInput) {
				case CREATE_FLAG: {
					scoreVO = createScore(scoreVO);
					break;
				}
				case UPDATE_FLAG: {
					updateScore(scoreVO);
					break;
				}
				case FINISH_FLAG: {
					List<Object> temporaryVals = finishScore(completeScores, scoreVO);
					scoreVO = (ScoreVO) temporaryVals.get(0);
					completeScores = (Collection<ScoreVO>) temporaryVals.get(1);
					break;
				}
				case EXIT_FLAG: {
					continueFlag = false;
					break;
				}
				default:
					System.out.println("Wrong Input");
			}
		}
		displayCompleteScores(completeScores);
		
	}

	public ScoreVO createScore(ScoreVO scoreVO) throws IOException {
		CreateScoreValidatorInterface createScoreValidator = new CreateScoreValidatorImpl();
		CreateScoreInterface createScoreInterface = new CreateScoreImpl();
		if(createScoreValidator.validateForCreateScore(scoreVO)) {
			String homeTeam = getInputFromUser("Name of Home Team");
			String awayTeam = getInputFromUser("Name of Away Team");
			return createScoreInterface.createScore(homeTeam, awayTeam);
		}else {
			System.out.println("Please Finish before updation");
			return null;
		}
	}
	
	public void updateScore(ScoreVO scoreVO) throws IOException {
		UpdateScoreValidatorInterface updateScoreValidator = new UpdateScoreValidatorImpl();
		UpdateScoreInterface updateScoreInterface = new UpdateScoreImpl();
		if (updateScoreValidator.validateForUpdateScore(scoreVO)) {
			int homeTeamGoal = Integer.parseInt(getInputFromUser("Goals of Home Team"));
			int awayTeamGoal = Integer.parseInt(getInputFromUser("Goals of Away Team"));
			updateScoreInterface.updateScore(scoreVO, homeTeamGoal, awayTeamGoal);
		} else {
			System.out.println("Please create before updation");
		}
	}
	
	public List<Object> finishScore(Collection<ScoreVO> completeScores, ScoreVO scoreVO) {
		FinishScoreValidatorInterface finishScoreValidator = new FinishScoreValidatorImpl();
		FinishScoreInterface finishScoreInterface = new FinishScoreImpl();
		if(finishScoreValidator.validateForFinishScore(scoreVO)) {
			completeScores =  finishScoreInterface.finishScore(scoreVO, completeScores);
			scoreVO = null;
			return Arrays.asList(scoreVO,completeScores);
		}else {
			System.out.println("Please Create before Finishing");
			return Arrays.asList(scoreVO,completeScores);
		}
	}
	
	public void displayCompleteScores(Collection<ScoreVO> completeScores) {
		DisplaySummaryValidatorInterface displaySummaryValidator = new DisplaySummaryValidatorImpl();
		DisplaySummaryInterface displaySummaryInterface = new DisplaySummaryImpl();
		if(displaySummaryValidator.validateForDisplayingSummary(completeScores)) {
			displaySummaryInterface.displaySummaryOfScores(completeScores);
		}else {
			System.out.println("Nothing to display");
		}
	}
	
	public String getInputFromUser(String question) throws IOException {
		System.out.println(question);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
	
	public void displayDetails() {
		DisplayTextInterface displayTextInterface = new DisplayTextImpl();
		displayTextInterface.displayWelcomeText();
		displayTextInterface.displayTextForScoreBoard();
	}
	
}
