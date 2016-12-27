package dicekataversion3.dicekataversion3;

public class DiceRoll {
	
	private Die[] dice; 

	public DiceRoll(Die[] dice) {
		this.dice = dice;
	}
	
	public Die[] getRoll() {
		return dice;
	}
	
}
