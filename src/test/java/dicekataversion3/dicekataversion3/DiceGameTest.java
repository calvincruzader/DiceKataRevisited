package dicekataversion3.dicekataversion3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceGameTest {

	DiceGame diceGame;
	
	@Before 
	public void before() {
		diceGame = new DiceGame();
		diceGame.addRule(new Matching3Scorer(1, 1000));
		diceGame.addRule(new Matching3Scorer(2, 200));
		diceGame.addRule(new Matching3Scorer(3, 300));
		diceGame.addRule(new Matching3Scorer(4, 400));
		diceGame.addRule(new Matching3Scorer(5, 500));
		diceGame.addRule(new Matching3Scorer(6, 600));

		diceGame.addRule(new DiceScorerNotMatching3(1, 100));
		diceGame.addRule(new DiceScorerNotMatching3(4, 40));

	}
	
	@After
	public void after() {
		diceGame = null;
	}
	
	@Test
	public void test3OnesGive1000points() {
		Die[] diceRoll = Die.arrayOf(1,1,1,3,3);
		assertEquals("Checks that 3 ones gives 1000 points", 1000, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void test3TwosGives200points() {
		Die[] diceRoll = Die.arrayOf(2,2,2,3,3);
		assertEquals("Checks that 3 twos gives 200 points", 200, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void test3ThreesGives300points() {
		Die[] diceRoll = Die.arrayOf(3,3,3,2,2);
		assertEquals("Checks that 3 threes gives 300 points", 300, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void test3FoursGives400points() {
		Die[] diceRoll = Die.arrayOf(4,4,4,2,2);
		assertEquals("Checks that 3 fours gives 400 points", 400, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void test3FivesGives500points() {
		Die[] diceRoll = Die.arrayOf(5,5,5,2,2);
		assertEquals("Checks that 3 fives gives 500 points", 500, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void test3SixesGives600points() {
		Die[] diceRoll = Die.arrayOf(6,6,6,2,2);
		assertEquals("Checks that 3 sixes gives 600 points", 600, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void testOnesNotInMatching3Set() {
		Die[] diceRoll = Die.arrayOf(1,2,3,5,6);
		assertEquals("Checks that 1 one not in a matching 3 set gives 100 points", 100, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void testFoursNotInMatching3Set() {
		Die[] diceRoll = Die.arrayOf(4,2,3,5,6);
		assertEquals("Checks that 1 four not in a matching 3 set gives 40 points", 40, diceGame.scoreRoll(diceRoll));
	}
	
	@Test 
	public void testGivenSampleTests() {
		Die[] diceRoll = Die.arrayOf(1,2,3,4,5);
		assertEquals("Checks first given sample test", 140, diceGame.scoreRoll(diceRoll));

		diceRoll = Die.arrayOf(1,1,1,2,2);
		assertEquals("Checks second given sample test", 1000, diceGame.scoreRoll(diceRoll));

		diceRoll = Die.arrayOf(5,4,5,4,5);
		assertEquals("Checks third given sample test", 580, diceGame.scoreRoll(diceRoll));

		diceRoll = Die.arrayOf(4,4,4,4,4);
		assertEquals("Checks fourth given sample test", 480, diceGame.scoreRoll(diceRoll));

		diceRoll = Die.arrayOf(1,5,5,5,1);
		assertEquals("Checks fifth given sample test", 700, diceGame.scoreRoll(diceRoll));

	}
}
