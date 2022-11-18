import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.util.logging.Level;
import java.util.logging.Logger;

import static junit.framework.TestCase.assertEquals;

public class SolutionTest {
    static Logger logger=Logger.getLogger(SolutionTest.class.getName());
    @BeforeClass
    public static void startInfo(){
        logger.log(Level.INFO, "Testing process has started.");
    }
    @BeforeEach
    public void beforeEach(){logger.log(Level.INFO, "Test has started.");}
    @Test
    public void testSolution1() {
        int counter = Solution.solution("BALLOON", "BAONXXOLL");
        assertEquals(1, counter);
    }

    @Test
    public void testSolution2() {
        int counter = Solution.solution("BALLOON", "BAOOLLNNOLOLGBAX");
        assertEquals(2, counter);
    }

    @Test
    public void testSolution3() {
        int counter = Solution.solution("BALLOON", "QAWABAWONL");
        assertEquals(0, counter);
    }

    @Test
    public void testSolution4() {
        int counter = Solution.solution("BALLOON", "ONLABLABLOON");
        assertEquals(1, counter);
    }
    @AfterEach
    public void afterEach(){logger.log(Level.INFO, "Test has ended.");}
    @AfterClass
    public static void endInfo(){
        logger.log(Level.INFO, "Testing process has ended.");
    }
}




