package main.java.test;

import static org.junit.Assert.assertFalse;
import org.junit.After;
import org.junit.Before;
import main.java.conway.domain.LifeInterface;
import org.junit.Test;
 
/*
 * TEST PLAN
 */
public class LifeTest {
private LifeInterface lifeModel;

	@Before
	public void setup() {
		System.out.println("LifeTest | setup");	
		lifeModel = null;
	}
	@After
	public void down() {
		System.out.println("LifeTest | down");
	}
	
	@Test
	public void testNextGeneration() {
		System.out.println("testNextGeneration ---------------------" );
		lifeModel.resetGrids();
		lifeModel.setCell(0, 0, true);
		lifeModel.nextGeneration();
		assertFalse(lifeModel.isAlive(0, 0));
	}

}
