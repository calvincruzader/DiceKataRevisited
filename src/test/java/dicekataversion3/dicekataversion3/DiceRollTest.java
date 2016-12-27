package dicekataversion3.dicekataversion3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceRollTest {

	DiceRoll diceRoll;
	
	@Test 
	public void testDiceRollValue() {
		Die[] dice = Die.arrayOf(1,2,3,4,5);
		diceRoll = new DiceRoll(dice);
		assertEquals("Checks whether the roll returns what was given", 5, diceRoll.getRoll().length);
	}

}
