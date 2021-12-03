package ScoreBoard.displaytext;

/**
 * @author Alistar
 *
 */
public class DisplayTextImpl implements DisplayTextInterface{

	@Override
	public void displayTextForScoreBoard() {
		System.out.println("Enter C for creating new score board \n" 
				+ "Enter U for updating the score board \n"
				+ "Enter F for Finishing the match \n"
				+ "Enter E for exiting and showing the summary of all matches");
	}

	@Override
	public void displayWelcomeText() {
		System.out.println("****************************");
		System.out.println("Welcome to the score board application \n");
	}

}
