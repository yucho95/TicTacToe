/*
 * NAME:Yubin Cho
 */
package hw1;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * JUnit test for Stats.java
 * @since 2016-09-24
 * @author Yubin Cho
 *
 */
public class StatsTest {

		private Stats stat;

		/* this sets up the test fixture. JUnit invokes this method before
	 	   every testXXX method.  
	 	   The @Before tag tells JUnit to run this method 
		   before each test */
		@Before
		public void setUp() throws Exception {
			stat = new Stats(1, 2, 3);
		}
		
		/* The @Test tag tells JUnit this is a test to run */
		@Test
		public void testgetTotalGames() {
			System.out.println("Checking getTotalGames");
			assertEquals(6, stat.getTotalGames());
		}

		@Test
		public void testIncrements() {
			System.out.println("Checking Proper Increment");
			stat.incrementComputerWins();
			assertEquals(7, stat.getTotalGames());
			stat.incrementUserWins();
			assertEquals(8, stat.getTotalGames());
			stat.incrementTies();
			assertEquals(9, stat.getTotalGames()); 
		}
	

		@Test
		public void testReset() {
			System.out.println("Checking Reset");
			stat.reset();
			assertEquals(0, stat.getTotalGames());
		}

		@Test
		public void testAverage() {
			System.out.println("Checking Proper Average");
			stat.reset();
			assertEquals(0, stat.averageGames(0));
			stat.reset();
			stat.incrementComputerWins();
			stat.incrementUserWins();
			stat.incrementTies();
			assertEquals(33, stat.averageGames(0));
			assertEquals(33, stat.averageGames(1));
			assertEquals(33, stat.averageGames(2));
			assertEquals(-1, stat.averageGames(3));
		}

		
		@Test
		public void testResetWrong(){
			System.out.println("Checking Reset wrong");
			stat.resetWrong();
			assertEquals(0, stat.getTotalGames());
		}

}

