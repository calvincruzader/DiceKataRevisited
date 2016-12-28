package dicekataversion3.dicekataversion3;

import java.util.Map;

public class Matching3Scorer extends CountBaseRule {

	private int threeScore;
	private int diceValue;
	
	public Matching3Scorer(int diceValue, int threeScore) {
		this.diceValue = diceValue;
		this.threeScore = threeScore;
	}
	
	public int score(Die[] diceRoll) {
		int score = 0;
		
		Map<Integer, Integer> numberOfEachDie = countNumberOfDice(diceRoll); 

		if (numberOfEachDie.containsKey(diceValue)) {
			if (numberOfEachDie.get(diceValue) >= 3) {
				score += threeScore;
			}
		}
		
		return score;
	}
}
