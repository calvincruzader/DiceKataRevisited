package dicekataversion3.dicekataversion3;

import java.util.HashMap;

public abstract class CountBaseRule implements Scoring {

	protected HashMap<Integer, Integer> countNumberOfDice(Die[] dice) {
		
		HashMap<Integer, Integer> numberOfEachDie = new HashMap<Integer, Integer>();

		for (int i = 0; i < dice.length; i++) {
			if (numberOfEachDie.get(dice[i].getDie()) == null) {
				numberOfEachDie.put(dice[i].getDie(), 1);
			} else {
				int currentCount = numberOfEachDie.get(dice[i].getDie());
				numberOfEachDie.put(dice[i].getDie(), ++currentCount);
			}
		}
		return numberOfEachDie;
	}
}
