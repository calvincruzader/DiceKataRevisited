package dicekataversion3.dicekataversion3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiceGame {
	
	
	private List<Scoring> rules = new ArrayList<Scoring>();
	
	//open/close 
	public void addRule(Scoring rule) {
		this.rules.add(rule);
	}
	
	public int scoreRoll(DiceRoll diceRoll) {
				
		int score = 0;
		for(Scoring rule : this.rules) {
			score += rule.score(diceRoll);
		}
		
		return score;
	}
	

}

