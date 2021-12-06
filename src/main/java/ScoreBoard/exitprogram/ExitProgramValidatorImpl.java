package ScoreBoard.exitprogram;

import java.util.Objects;

import ScoreBoard.vo.ScoreVO;

public class ExitProgramValidatorImpl implements ExitProgramValidatorInterface{

	@Override
	public boolean validateForExiting(ScoreVO scoreVO) {
		if(Objects.isNull(scoreVO)) {
			return true;
		}
		return false;
	}

}
