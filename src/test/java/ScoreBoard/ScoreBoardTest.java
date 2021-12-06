package ScoreBoard;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.Spy;

import ScoreBoard.vo.ScoreVO;


/**
 * @author Alistar
 * Test cases for ScoreBoard
 * Test cases for creation, updation, finishing and summary display
 */
public class ScoreBoardTest {
	
	
	@Spy
	ScoreBoardController scr;
	
	@BeforeEach
	public void setup() {
		scr = Mockito.spy(ScoreBoardController.class);
	}
	
	/**
	 * Test case for creation of a new Score Board
	 * A new score board is created with the names of both home and away team
	 * The initial score will be set as 0-0
	 * @throws IOException 
	 */
	@Test
	public void createScoreBoard() throws IOException {
			doReturn("France")
			.doReturn("Egypt")
			.when(scr).getInputFromUser(anyString());
		assertNotNull(scr.createScore(null));
	}
	
	/**
	 * Test case when Score Board is already present
	 * An Error is to be displayed when attempting to create a new score board
	 * if there exists already a score board
	 * @throws Exception 
	 */
	@Test
	public void doNotCreateScoreBoardWhenScoreBoardAlreadyExists() throws Exception {
		ScoreVO scoreVO = new ScoreVO("France","Germany");
			doReturn("France")
			.doReturn("Egypt")
			.when(scr)
				.getInputFromUser(anyString());
		assertNull(scr.createScore(scoreVO));
	}
	
	/**
	 * Test case for updating the Score Board
	 * The score board is updated with the new score entered by the user
	 * The new score will be the goals of both home and away teams
	 * @throws IOException 
	 */
	@Test
	public void updateScoreBoardWhenScoreBoardAlreadyExists() throws IOException {
		ScoreVO scoreVO = new ScoreVO("France","Germany");
		doReturn("1")
		.doReturn("2")
		.when(scr)
			.getInputFromUser(anyString());
		scr.updateScore(scoreVO);
		assertEquals(scoreVO.getHomeTeamGoal(), 1);
	}
	
	/**
	 * Test case when the user tries to update the Score Board when a score board 
	 * has'nt already been created
	 * The score board is not updated with the new score entered by the user
	 * @throws IOException 
	 */
	@Test
	public void doNotUpdateScoreBoardWhenScoreBoardDoesntExists() throws IOException {
		ScoreVO scoreVO = null;
		doReturn("1")
		.doReturn("2")
		.when(scr)
			.getInputFromUser(anyString());
		scr.updateScore(scoreVO);
		assertNull(scoreVO);
	}
	
	/**
	 * Test case for finish the match
	 * The current score board is added to the collection of complete scores
	 * The current score board is also emptied to simulate finishing of match
	 * @throws IOException 
	 */
	@Test
	public void finishScoreBoardWhenScoreBoardAlreadyExists() throws IOException {
		ScoreVO scoreVO = new ScoreVO("France", "Italy");
		Collection<ScoreVO> completeScores = null;
		assertNotNull(scr.finishScore(completeScores,scoreVO).get(1));
	}
	
	/**
	 * Test case when the user tries to finish the match when a score board 
	 * does not exist
	 * The match is prevented to finish as there is not a score board present already
	 */
	@Test
	public void doNotFinishScoreBoardWhenScoreBoardDoesntExists() {
		ScoreVO scoreVO = null;
		Collection<ScoreVO> completeScores = null;
		assertNull(scr.finishScore(completeScores,scoreVO).get(1));
	}
	
	/**
	 * Test case to display summary of all the scores present in the collection
	 */
	@Test
	public void displaySummaryWhenAtleastOneScoreExists() {
		PrintStream standardOut = System.out;
		ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		Collection<ScoreVO> completeScores = createDataForTesting();
		scr.displayCompleteScores(completeScores);
		String expectedOut = "Germany 5 - Italy 1 France 2 - England 2 Belgium 4 - Sweden 0";
		assertEquals(expectedOut.trim().replaceAll("\\s+", " ")
				,outputStreamCaptor.toString()
					      .trim().replaceAll("\\s+", " "));
		System.setOut(standardOut);
		
	}
	
	/**
	 * Test case when user tries to display the summary of all the scores 
	 * but is prevented when there exists no scores in the collection
	 * An error is shown when the user tries to attempt this
	 */
	@Test
	public void doNotDisplaySummaryWhenNoScoresExists() {
		PrintStream standardOut = System.out;
		ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		Collection<ScoreVO> completeScores = null;
		scr.displayCompleteScores(completeScores);
		assertEquals("Nothing to display",outputStreamCaptor.toString()
			      .trim());
		System.setOut(standardOut);
	}
	
	/**
	 * Test case when user tries to exit
	 * but is prevented when there exists score to be finished
	 * An error is shown when the user tries to attempt this
	 */
	@Test
	public void doNotExitWhenScoreIsYetToBeFinished() {
		PrintStream standardOut = System.out;
		ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStreamCaptor));
		ScoreVO scoreVO = new ScoreVO("France", "Spain");
		scr.exitProgram(scoreVO);
		assertEquals("Please Finish the score before Exiting",outputStreamCaptor.toString()
			      .trim());
		System.setOut(standardOut);
	}
	
	/**
	 * Test case when user tries exit
	 */
	@Test
	public void exitWhenNoScoresExistsToBeFinished() {
		assertFalse(scr.exitProgram(null));
	}
	
	public Collection<ScoreVO> createDataForTesting() {
		ScoreVO score1 = new ScoreVO("France","England");
		score1.setHomeTeamGoal(2);
		score1.setAwayTeamGoal(2);
		
		ScoreVO score2 = new ScoreVO("Germany","Italy");
		score2.setHomeTeamGoal(5);
		score2.setAwayTeamGoal(1);
		
		ScoreVO score3 = new ScoreVO("Belgium","Sweden");
		score3.setHomeTeamGoal(4);
		score3.setAwayTeamGoal(0);
		
		Collection<ScoreVO> completeScores = new ArrayList<>();
		completeScores.add(score1);
		completeScores.add(score2);
		completeScores.add(score3);
		
		return completeScores;
	}
}
