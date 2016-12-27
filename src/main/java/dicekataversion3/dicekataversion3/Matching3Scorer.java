package dicekataversion3.dicekataversion3;

import java.util.Map;

public class Matching3Scorer extends CountBaseRule {

	private int threeScore;
	private int diceValue;
	
	public Matching3Scorer(int dv, int tos) {
		diceValue = dv;
		threeScore = tos;
	}
	
	public int score(DiceRoll diceRoll) {
		int score = 0;
		
		Map<Integer, Integer> numberOfEachDie = countNumberOfDice(diceRoll.getRoll()); 

		if (numberOfEachDie.containsKey(diceValue)) {
			if (numberOfEachDie.get(diceValue) >= 3) {
				score += threeScore;
			}
		}
		
		return score;
	}
}
