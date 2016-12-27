package dicekataversion3.dicekataversion3;

import java.util.HashMap;
import java.util.Map;

public class Die {

	private int rollValue;
	
	static Map<Integer, Die> dieMap = new HashMap<Integer, Die>();
	
	public static Die[] arrayOf(Integer ...values) {
		Die[] dice = new Die[values.length];
		for (int i = 0; i < dice.length; i++) {
			if (dieMap.get(values[i]) == null) {
				dieMap.put(values[i], new Die(values[i]));
			}
			dice[i] = dieMap.get(values[i]);
		}
		return dice;
	}
	
	public Die(int val) {
		rollValue = val;
	}
	
	public int getDie() {
		return rollValue;
	}
	
}
