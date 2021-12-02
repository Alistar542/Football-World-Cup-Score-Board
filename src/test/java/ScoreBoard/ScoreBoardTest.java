package ScoreBoard;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Alistar
 * Test cases for ScoreBoard
 * Test cases for creation, updation, finishing and summary display
 */
@ExtendWith(MockitoExtension.class)
public class ScoreBoardTest {
	
	/**
	 * Test case for creation of a new Score Board
	 * A new score board is created with the names of both home and away team
	 * The initial score will be set as 0-0
	 */
	@Test
	public void createScoreBoard() {
		
	}
	
	/**
	 * Test case when Score Board is already present
	 * An Error is to be displayed when attempting to create a new score board
	 * if there exists already a score board
	 */
	@Test
	public void doNotCreateScoreBoardWhenScoreBoardAlreadyExists() {
		
	}
	
	/**
	 * Test case for updating the Score Board
	 * The score board is updated with the new score entered by the user
	 * The new score will be the goals of both home and away teams
	 */
	@Test
	public void updateScoreBoardWhenScoreBoardAlreadyExists() {
		
	}
	
	/**
	 * Test case when the user tries to update the Score Board when a score board 
	 * has'nt already been created
	 * The score board is not updated with the new score entered by the user
	 */
	@Test
	public void doNotUpdateScoreBoardWhenScoreBoardDoesntExists() {
		
	}
	
	/**
	 * Test case for finish the match
	 * The current score board is added to the collection of complete scores
	 * The current score board is also emptied to simulate finishing of match
	 */
	@Test
	public void finishScoreBoardWhenScoreBoardAlreadyExists() {
		
	}
	
	/**
	 * Test case when the user tries to finish the match when a score board 
	 * does not exist
	 * The match is prevented to finish as there is not a score board present already
	 */
	@Test
	public void doNotFinishScoreBoardWhenScoreBoardDoesntExists() {
		
	}
	
	/**
	 * Test case to display summary of all the scores present in the collection
	 */
	@Test
	public void displaySummaryWhenAtleastOneScoreExists() {
		
	}
	
	/**
	 * Test case when user tries to display the summary of all the scores 
	 * but is prevented when there exists no scores in the collection
	 * An error is shown when the user tries to attempt this
	 */
	@Test
	public void doNotDisplaySummaryWhenNoScoresExists() {
		
	}
}
