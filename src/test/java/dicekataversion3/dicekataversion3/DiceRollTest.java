package dicekataversion3.dicekataversion3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceRollTest {

	
	@Test 
	public void testDiceRollValue() {
		Die[] diceRoll = Die.arrayOf(1,2,3,4,5);
		assertEquals("Checks whether the roll returns what was given", 5, diceRoll.length);
	}

}
