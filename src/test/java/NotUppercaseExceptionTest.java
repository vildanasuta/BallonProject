import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class NotUppercaseExceptionTest {
    static Logger logger=Logger.getLogger(NotUppercaseExceptionTest.class.getName());
    @BeforeClass
    public static void startInfo(){
        logger.log(Level.INFO, "Test has started.");
    }
    @Test
    public void testConstructor() {
        NotUppercaseException notUpperException = new NotUppercaseException("Inputted word is not UPPERCASE.");
        assertEquals("Inputted word is not UPPERCASE.", notUpperException.getLocalizedMessage());
    }
    @AfterClass
    public static void endInfo(){
        logger.log(Level.INFO, "Test has ended.");
    }
}

