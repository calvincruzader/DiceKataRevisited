package dicekataversion3.dicekataversion3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class DieTest {

	Die die;
	
	@After
	public void after() {
		die = null;
	}
	
	@Test
	public void testDieRollValue() {
		die = new Die(3);
		assertEquals("checks if die roll has a value of 3", 3, die.getDie());
	}
}
