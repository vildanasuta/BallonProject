import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InTextFileNotFoundExceptionTest {
    static Logger logger=Logger.getLogger(InTextFileNotFoundExceptionTest.class.getName());
    @BeforeClass
    public static void startInfo(){
        logger.log(Level.INFO, "Test has started.");
    }
    @Test
    public void testConstructor() {
        InTextFileNotFoundException inTextException = new InTextFileNotFoundException("inText.txt not found.");
        assertEquals("inText.txt not found.", inTextException.getLocalizedMessage());
    }
    @AfterClass
    public static void endInfo(){
        logger.log(Level.INFO, "Test has ended.");
    }
}

