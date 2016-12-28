package dicekataversion3.dicekataversion3;

import java.util.Map;

public class DiceScorerNotMatching3 extends CountBaseRule {

	private int diceValue;
	private int scoreForNotMatching;
	
	public DiceScorerNotMatching3(int diceValue, int score) {
		this.diceValue = diceValue;
		scoreForNotMatching = score;
	}
	
	public int score(Die[] diceRoll) {
		int score = 0; 
		
		Map<Integer, Integer> numberOfEachDie = countNumberOfDice(diceRoll);
		
		if (numberOfEachDie.containsKey(diceValue)) {
			int count = numberOfEachDie.get(diceValue) % 3;
			score += scoreForNotMatching * count;
		}
		return score;
	}
}
