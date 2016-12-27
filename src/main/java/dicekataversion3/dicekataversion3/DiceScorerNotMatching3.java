package dicekataversion3.dicekataversion3;

import java.util.Map;

public class DiceScorerNotMatching3 extends CountBaseRule {

	private int diceValue;
	private int scoreForNotMatching;
	
	public DiceScorerNotMatching3(int dv, int score) {
		diceValue = dv;
		scoreForNotMatching = score;
	}
	
	public int score(DiceRoll diceRoll) {
		int score = 0; 
		
		Map<Integer, Integer> numberOfEachDie = countNumberOfDice(diceRoll.getRoll());
		
		if (numberOfEachDie.containsKey(diceValue)) {
			int count = numberOfEachDie.get(diceValue) % 3;
			score += scoreForNotMatching * count;
		}
		return score;
	}
}
