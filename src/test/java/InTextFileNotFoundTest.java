import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InTextFileNotFoundTest {
    static Logger logger=Logger.getLogger(InTextFileNotFound.class.getName());
    @BeforeClass
    public static void startInfo(){
        logger.log(Level.INFO, "Test has started.");
    }
    @Test
    public void testConstructor() {
        InTextFileNotFound inTextException = new InTextFileNotFound("inText.txt not found.");
        assertEquals("inText.txt not found.", inTextException.getLocalizedMessage());
    }
    @AfterClass
    public static void endInfo(){
        logger.log(Level.INFO, "Test has ended.");
    }
}

